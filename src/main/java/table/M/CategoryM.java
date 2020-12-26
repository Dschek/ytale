package table.M;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "categoryM")
public class CategoryM {
    @Id
    @Column(name = "idCM")
    private int id;
    @Column(name = "nameCM")
    private String name;

    public CategoryM() {
    }

    public CategoryM(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
