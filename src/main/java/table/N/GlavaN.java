package table.N;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Embeddable
@Table(name = "glavaN")
public class GlavaN {
    @Id
    @Column(name="idGN")
    private BigInteger glavaId;
    @Column(name="indexGN")
    private int index;
    @Column(name="nameRuGN")
    private String nameRu;
    @Column(name="nameEnGN")
    private String nameEn;
    @Column(name="nameOrigGN")
    private String nameOrig;
    @Column(name="likesGN")
    private int likes;
    @Column(name="watchesGN")
    private int watches;
    @Column(name="autorIdGN")
    private int autorId;
    @Column(name="organIdGN")
    private int organId;
    @Column(name="contentGN")
    private String content;
    @Column(name="statusGN")
    private int status;
    @Column(name="createDateGN")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createDate;
    @Column(name="openDateGN")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date openDate;
    @Column(name="priceGN")
    private BigDecimal price;

    public GlavaN() {
    }
    public GlavaN(BigInteger glavaId, int index, String nameRu, String nameEn, String nameOrig, int likes, int watches, int autorId, int organId, String content, int status, Date createDate, Date openDate, BigDecimal price) {
        this.glavaId = glavaId;
        this.index = index;
        this.nameRu = nameRu;
        this.nameEn = nameEn;
        this.nameOrig = nameOrig;
        this.likes = likes;
        this.watches = watches;
        this.autorId = autorId;
        this.organId = organId;
        this.content = content;
        this.status = status;
        this.createDate = createDate;
        this.openDate = openDate;
        this.price = price;
    }
    public BigInteger getGlavaId() {
        return glavaId;
    }
    public void setGlavaId(BigInteger glavaId) {
        this.glavaId = glavaId;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
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
    public int getAutorId() {
        return autorId;
    }
    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }
    public int getOrganId() {
        return organId;
    }
    public void setOrganId(int organId) {
        this.organId = organId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getOpenDate() {
        return openDate;
    }
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}