package by.nantalifoto.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "localized_text")
public class LocalizedTextEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "russian")
    private String russian;

    @Column(name = "english")
    private String english;

    @Column(name = "german")
    private String german;

    /**
     * Правильно ли это?
     * */
    @OneToOne(mappedBy = "localizedName" )
    private AlbumEntity album;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }


    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }


    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }


    public AlbumEntity getAlbum() {
        return album;
    }

    public void setAlbum(AlbumEntity album) {
        this.album = album;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalizedTextEntity that = (LocalizedTextEntity) o;
        return id == that.id &&
                Objects.equals(russian, that.russian) &&
                Objects.equals(english, that.english) &&
                Objects.equals(german, that.german) &&
                Objects.equals(album, that.album);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, russian, english, german, album);
    }

    @Override
    public String toString() {
        return "LocalizedTextEntity{" +
                "id=" + id +
                ", russian='" + russian + '\'' +
                ", english='" + english + '\'' +
                ", german='" + german + '\'' +
                ", album=" + album +
                '}';
    }
}
