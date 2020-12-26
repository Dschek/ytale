package table.M;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "historyReadM")
public class HistoryReadM implements Serializable {
    @Id
    @Column(name="userId")
    private int userId;
    @Id
    @Column(name="postIdN")
    private int postIdN;

    public HistoryReadM() {
    }
    public HistoryReadM(int userId, int postIdN) {
        this.userId = userId;
        this.postIdN = postIdN;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getPostIdN() {
        return postIdN;
    }
    public void setPostIdN(int postIdN) {
        this.postIdN = postIdN;
    }
}
