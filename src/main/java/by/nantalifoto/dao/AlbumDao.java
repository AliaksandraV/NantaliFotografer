package by.nantalifoto.dao;

import by.nantalifoto.entity.AlbumEntity;

import java.util.List;

public interface AlbumDao {

    void add (AlbumEntity album);
    void update(AlbumEntity album);
    void delete (long id);
    AlbumEntity get (long id);
    List<AlbumEntity> list();
}
