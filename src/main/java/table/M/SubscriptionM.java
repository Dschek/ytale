package table.M;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "subscriptionM")
public class SubscriptionM implements Serializable {
    @Id
    @Column(name="userId")
    private int userId;
    @Id
    @Column(name="postIdM")
    private int postIdM;
    @Column(name = "status")
    private int status;

    public SubscriptionM() {
    }
    public SubscriptionM(int userId, int postIdM, int status) {
        this.userId = userId;
        this.postIdM = postIdM;
        this.status = status;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getPostIdM() {
        return postIdM;
    }
    public void setPostIdM(int postIdM) {
        this.postIdM = postIdM;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}
