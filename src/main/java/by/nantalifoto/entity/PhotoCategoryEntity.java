package by.nantalifoto.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "photo_category")
public class PhotoCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "localized_name_id")
    private LocalizedTextEntity localizedName;

    @Column(name = "cover_image_path")
    private String coverImagePath;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "photoCategory" )
    private List<AlbumEntity> albumList;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public LocalizedTextEntity getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(LocalizedTextEntity localizedName) {
        this.localizedName = localizedName;
    }


    public String getCoverImagePath() {
        return coverImagePath;
    }

    public void setCoverImagePath(String coverImagePath) {
        this.coverImagePath = coverImagePath;
    }


    public List<AlbumEntity> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<AlbumEntity> albumList) {
        this.albumList = albumList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoCategoryEntity that = (PhotoCategoryEntity) o;
        return id == that.id &&
                Objects.equals(coverImagePath, that.coverImagePath) &&
                Objects.equals(albumList, that.albumList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, coverImagePath, albumList);
    }

    @Override
    public String toString() {
        return "PhotoCategoryEntity{" +
                "id=" + id +
                ", coverImagePath='" + coverImagePath + '\'' +
                ", albumList=" + albumList +
                '}';
    }
}
