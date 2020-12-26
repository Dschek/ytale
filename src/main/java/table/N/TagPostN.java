package table.N;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Embeddable
@Table(name = "tagPN")
public class TagPostN implements Serializable {
    @Id
    @Column(name = "idPN")
    private int postId;
    @Id
    @Column(name = "idTN")
    private int categoryId;

    public TagPostN() {
    }
    public TagPostN(int postId, int categoryId) {
        this.postId = postId;
        this.categoryId = categoryId;
    }
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
