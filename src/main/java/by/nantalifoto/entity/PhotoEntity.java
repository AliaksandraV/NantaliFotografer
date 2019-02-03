package by.nantalifoto.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "photo")
public class PhotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "path")
    private String path;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "album_id", nullable = false)
    private AlbumEntity albumId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public AlbumEntity getAlbumId() {
        return albumId;
    }

    public void setAlbumId(AlbumEntity albumId) {
        this.albumId = albumId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoEntity that = (PhotoEntity) o;
        return id == that.id &&
                Objects.equals(path, that.path) &&
                Objects.equals(albumId, that.albumId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, path, albumId);
    }


    @Override
    public String toString() {
        return "PhotoEntity{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", albumId=" + albumId +
                '}';
    }
}