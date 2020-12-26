package table.M;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Embeddable
@Table(name = "tagPM")
public class TagPostM implements Serializable {
    @Id
    @Column(name = "idPM")
    private int postId;
    @Id
    @Column(name = "idTM")
    private int tagId;

    public TagPostM() {
    }
    public TagPostM(int postId, int tagId) {
        this.postId = postId;
        this.tagId = tagId;
    }
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public int getTagId() {
        return tagId;
    }
    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}
