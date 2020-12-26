package table.N;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Embeddable
@Table(name = "commentPostN")
public class CommentGlavaN {
    @Id
    @Column(name = "idCN")
    private BigInteger id;
    @Column(name = "idGN")
    private BigInteger glavaId;
    @Column(name = "userId")
    private int userId;
    @Column(name = "titleCN")
    private String title;
    @Column(name = "likeCN")
    private int like;
    @Column(name = "dLikeCN")
    private int dlike;
    @Column(name = "createDateCN")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createDate;
    @Column(name = "parentIdCN")
    private BigInteger parentId;

    public CommentGlavaN() {
    }
    public CommentGlavaN(BigInteger id, BigInteger glavaId, int userId, String title, int like, int dlike, Date createDate, BigInteger parentId) {
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
