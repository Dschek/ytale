package table.N;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Table(name = "purchasesN")
public class PurchasesN implements Serializable {
    @Id
    @Column(name="userId")
    private int userId;
    @Id
    @Column(name="glavaIdN")
    private BigInteger glavaId;

    public PurchasesN() {
    }
    public PurchasesN(int userId, BigInteger glavaId) {
        this.userId = userId;
        this.glavaId = glavaId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public BigInteger getGlavaId() {
        return glavaId;
    }
    public void setGlavaId(BigInteger glavaId) {
        this.glavaId = glavaId;
    }
}
