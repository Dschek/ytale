package table.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "payHisory")
public class PayHistory {
    @Id
    @Column(name="payHistoryId")
    private BigInteger id;
    @Column(name="senderId")
    private int senderId;
    @Column(name="senderType")
    private int senderType;
    @Column(name="PayeeId")
    private int payeeId;
    @Column(name="PayeeType")
    private int payeeType;
    @Column(name="amount")
    private BigDecimal amount;
    @Column(name = "title")
    private String title;
    @Column(name="dateTime")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date dateTime;

    public PayHistory() {
    }
    public PayHistory(BigInteger id, int senderId, int senderType, int payeeId, int payeeType, BigDecimal amount, String title, Date dateTime) {
        this.id = id;
        this.senderId = senderId;
        this.senderType = senderType;
        this.payeeId = payeeId;
        this.payeeType = payeeType;
        this.amount = amount;
        this.title = title;
        this.dateTime = dateTime;
    }
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public int getSenderId() {
        return senderId;
    }
    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }
    public int getSenderType() {
        return senderType;
    }
    public void setSenderType(int senderType) {
        this.senderType = senderType;
    }
    public int getPayeeId() {
        return payeeId;
    }
    public void setPayeeId(int payeeId) {
        this.payeeId = payeeId;
    }
    public int getPayeeType() {
        return payeeType;
    }
    public void setPayeeType(int payeeType) {
        this.payeeType = payeeType;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
