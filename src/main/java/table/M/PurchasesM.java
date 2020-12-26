package table.M;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "purchasesM")
public class PurchasesM implements Serializable {
    @Id
    @Column(name="userId")
    private int userId;
    @Id
    @Column(name="glavaIdM")
    private BigInteger glavaId;

    public PurchasesM() {
    }
    public PurchasesM(int userId, BigInteger glavaId) {
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
