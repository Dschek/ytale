package table.N;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "subscriptionN")
public class SubscriptionN implements Serializable {
    @Id
    @Column(name="userId")
    private int userId;
    @Id
    @Column(name="postIdN")
    private int postIdN;
    @Column(name = "status")
    private int status;

    public SubscriptionN() {
    }
    public SubscriptionN(int userId, int postIdN, int status) {
        this.userId = userId;
        this.postIdN = postIdN;
        this.status = status;
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
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}
