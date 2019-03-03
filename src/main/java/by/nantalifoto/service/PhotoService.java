package by.nantalifoto.service;

import by.nantalifoto.entity.PhotoEntity;

import java.util.List;

public interface PhotoService {

    void add(PhotoEntity photo);
    void update(PhotoEntity photo);
    void  delete (long id);
    PhotoEntity get(long id);
    List<PhotoEntity> list();
}
