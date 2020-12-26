package table.N;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "tagN")
public class TagN {
    @Id
    @Column(name = "idTN")
    private int id;
    @Column(name = "nameTN")
    private String name;

    public TagN() {
    }
    public TagN(int id, String name) {
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
