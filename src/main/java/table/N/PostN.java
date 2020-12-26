package table.N;

import javax.persistence.*;
import java.util.Date;

@Entity
@Embeddable
@Table(name = "postN")
public class PostN {
    @Id
    @Column(name = "idPN")
    private int postId;
    @Column(name = "postImgPN")
    private String postImg;
    @Column(name = "nameRuPN")
    private String nameRu;
    @Column(name = "nameEnPN")
    private String nameEn;
    @Column(name = "nameOrigPN")
    private String nameOrig;
    @Column(name = "likesPN")
    private int likes;
    @Column(name = "watchesPN")
    private int watches;
    @Column(name = "subscriptionPN")
    private int subscription;
    @Column(name = "titlePN")
    private String title;
    @Column(name = "organIdPN")
    private int organId;
    @Column(name = "statusPN")
    private int status;
    @Column(name = "typeIdPN")
    private int typeId;
    @Column(name="updateDatePN")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updateDate;

    public PostN() {
    }
    public PostN(int postId, String postImg, String nameRu, String nameEn, String nameOrig, int likes, int watches, int subscription, String title, int organId, int status, int typeId, Date updateDate) {
        this.postId = postId;
        this.postImg = postImg;
        this.nameRu = nameRu;
        this.nameEn = nameEn;
        this.nameOrig = nameOrig;
        this.likes = likes;
        this.watches = watches;
        this.subscription = subscription;
        this.title = title;
        this.organId = organId;
        this.status = status;
        this.typeId = typeId;
        this.updateDate = updateDate;
    }
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public String getPostImg() {
        return postImg;
    }
    public void setPostImg(String postImg) {
        this.postImg = postImg;
    }
    public String getNameRu() {
        return nameRu;
    }
    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }
    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public String getNameOrig() {
        return nameOrig;
    }
    public void setNameOrig(String nameOrig) {
        this.nameOrig = nameOrig;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getWatches() {
        return watches;
    }
    public void setWatches(int watches) {
        this.watches = watches;
    }
    public int getSubscription() {
        return subscription;
    }
    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getOrganId() {
        return organId;
    }
    public void setOrganId(int organId) {
        this.organId = organId;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}