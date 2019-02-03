package by.nantalifoto.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "album")
public class AlbumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "localized_name_id")
    private LocalizedTextEntity localizedName;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "photo_category_id", nullable = false)
    private PhotoCategoryEntity photoCategory;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "albumId")
    private List<PhotoEntity> photo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public LocalizedTextEntity getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(LocalizedTextEntity localizedName) {
        this.localizedName = localizedName;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public PhotoCategoryEntity getPhotoCategory() {
        return photoCategory;
    }

    public void setPhotoCategory(PhotoCategoryEntity photoCategory) {
        this.photoCategory = photoCategory;
    }


    public List<PhotoEntity> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoEntity> photo) {
        this.photo = photo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumEntity that = (AlbumEntity) o;
        return id == that.id &&
                Objects.equals(localizedName, that.localizedName) &&
                Objects.equals(date, that.date) &&
                Objects.equals(photoCategory, that.photoCategory) &&
                Objects.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, localizedName, date, photoCategory, photo);
    }

    @Override
    public String toString() {
        return "AlbumEntity{" +
                "id=" + id +
                ", localizedName=" + localizedName +
                ", date=" + date +
                ", photoCategory=" + photoCategory +
                ", photo=" + photo +
                '}';
    }
}
