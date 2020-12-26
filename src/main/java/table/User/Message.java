package table.User;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @Column(name="messageId")
    private BigInteger id;
    @Column(name="userId1")
    private int userId1;
    @Column(name="userId2")
    private int userId2;
    @Column(name = "typeId")
    private int typeId;
    @Column(name = "title")
    private String title;
    @Column(name = "name")
    private String name;
    @Column(name="dateTime")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date dateTime;

    public Message() {
    }
    public Message(BigInteger id, int userId1, int userId2, int typeId, String title, String name, Date dateTime) {
        this.id = id;
        this.userId1 = userId1;
        this.userId2 = userId2;
        this.typeId = typeId;
        this.title = title;
        this.name = name;
        this.dateTime = dateTime;
    }
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public int getUserId1() {
        return userId1;
    }
    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }
    public int getUserId2() {
        return userId2;
    }
    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}