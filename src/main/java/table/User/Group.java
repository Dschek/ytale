package table.User;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "party")
public class Group {
    @Id
    @Column(name="groupId")
    private int id;
    @Column(name = "nameG")
    private String name;
    @Column(name = "imgU")
    private String avatar;
    @Column(name = "balance")
    private BigDecimal balance;
    @Column(name = "password")
    private String password;

    public Group() {
    }
    public Group(int id, String name, String avatar, BigDecimal balance, String password) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.balance = balance;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
