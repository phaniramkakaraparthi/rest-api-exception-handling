package phani.spring.restapiexceptionhandling.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
public class Book {
    @javax.persistence.Id
    private String id;
    private String title;
    private String author;
    private Genre genre;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public enum Genre {
        fantasy,
        thriller,
        scifi
    }
}
