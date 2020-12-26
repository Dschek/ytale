package table.N;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "historyReadN")
public class HistoryReadN implements Serializable {
    @Id
    @Column(name="userId")
    private int userId;
    @Id
    @Column(name="postIdN")
    private int postIdN;

    public HistoryReadN() {
    }
    public HistoryReadN(int userId, int postIdN) {
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
