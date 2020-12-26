package table.N;

import javax.persistence.*;

@Entity
@Embeddable
@Table(name = "categoryN")
public class CategoryN {
    @Id
    @Column(name = "idCN")
    private int id;
    @Column(name = "nameCN")
    private String name;

    public CategoryN() {
    }
    public CategoryN(int id, String name) {
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
