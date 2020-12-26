package table.M;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Embeddable
@Table(name = "commentPostM")
public class CommentGlavaM {
    @Id
    @Column(name = "idCM")
    private BigInteger id;
    @Column(name = "idGM")
    private BigInteger glavaId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "titleCM")
    private String title;
    @Column(name = "likeCM")
    private int like;
    @Column(name = "dLikeCM")
    private int dlike;
    @Column(name = "createDateCM")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createDate;
    @Column(name = "parentIdCM")
    private BigInteger parentId;

    public CommentGlavaM() {
    }
    public CommentGlavaM(BigInteger id, BigInteger glavaId, int userId, String title, int like, int dlike, Date createDate, BigInteger parentId) {
        this.id = id;
        this.glavaId = glavaId;
        this.userId = userId;
        this.title = title;
        this.like = like;
        this.dlike = dlike;
        this.createDate = createDate;
        this.parentId = parentId;
    }
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public BigInteger getGlavaId() {
        return glavaId;
    }
    public void setGlavaId(BigInteger glavaId) {
        this.glavaId = glavaId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLike() {
        return like;
    }
    public void setLike(int like) {
        this.like = like;
    }
    public int getDlike() {
        return dlike;
    }
    public void setDlike(int dlike) {
        this.dlike = dlike;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public BigInteger getParentId() {
        return parentId;
    }
    public void setParentId(BigInteger parentId) {
        this.parentId = parentId;
    }
}
