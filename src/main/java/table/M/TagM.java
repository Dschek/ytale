package table.M;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "tagM")
public class TagM {
    @Id
    @Column(name = "idTM")
    private int id;
    @Column(name = "nameTM")
    private String name;

    public TagM() {
    }
    public TagM(int id, String name) {
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
