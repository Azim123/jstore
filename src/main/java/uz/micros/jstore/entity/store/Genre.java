package uz.micros.jstore.entity.store;

import uz.micros.jstore.entity.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "genres")
public class Genre extends BaseEntity{

    @Column(unique = true, nullable = false, columnDefinition = "varchar(25)")
    private String title;

    @Column(unique = true, columnDefinition = "varchar(250)", name = "description")
    private String desc;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
