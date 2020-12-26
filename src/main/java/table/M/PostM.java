package table.M;

import javax.persistence.*;
import java.util.Date;

@Entity
@Embeddable
@Table(name = "postM")
public class PostM {
    @Id
    @Column(name = "idPM")
    private int postId;
    @Column(name = "postImgPM")
    private String postImg;
    @Column(name = "nameRuPM")
    private String nameRu;
    @Column(name = "typeIdPM")
    private int typeId;
    @Column(name = "nameEnPM")
    private String nameEn;
    @Column(name = "nameOrigPM")
    private String nameOrig;
    @Column(name = "likesPM")
    private int likes;
    @Column(name = "watchesPM")
    private int watches;
    @Column(name = "subscriptionPM")
    private int subscription;
    @Column(name = "titlePM")
    private String title;
    @Column(name = "organIdPM")
    private int organId;
    @Column(name = "statusPM")
    private int status;
    @Column(name="updateDatePM")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date updateDate;


    public PostM() {
    }
    public PostM(int postId, String postImg, String nameRu, int typeId, String nameEn, String nameOrig, int likes, int watches, int subscription, String title, int organId, int status, Date updateDate) {
        this.postId = postId;
        this.postImg = postImg;
        this.nameRu = nameRu;
        this.typeId = typeId;
        this.nameEn = nameEn;
        this.nameOrig = nameOrig;
        this.likes = likes;
        this.watches = watches;
        this.subscription = subscription;
        this.title = title;
        this.organId = organId;
        this.status = status;
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
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
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
    public Date getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}