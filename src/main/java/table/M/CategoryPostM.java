package table.M;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Embeddable
@Table(name = "categoryPM")
public class CategoryPostM implements Serializable {
    @Id
    @Column(name = "idPM")
    private int postId;
    @Id
    @Column(name = "idCM")
    private int categoryId;

    public CategoryPostM() {
    }
    public CategoryPostM(int postId, int categoryId) {
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
