package table.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "user")
public class User{
    @Id
    @Column(name="userId")
    private int id;
    @Column(name = "login")
    private String login;
    @Column(name = "statusIdU")
    private int statusId;
    @Column(name = "imgU")
    private String avatar;
    @Column(name = "balance")
    private BigDecimal balance;

    public User() {
    }
    public User(int id, String login, int statusId, String avatar, BigDecimal balance) {
        this.id = id;
        this.login = login;
        this.statusId = statusId;
        this.avatar = avatar;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getStatusId() {
        return statusId;
    }
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
