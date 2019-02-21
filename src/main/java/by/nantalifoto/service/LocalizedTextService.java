package by.nantalifoto.service;

import by.nantalifoto.entity.LocalizedTextEntity;

import java.util.List;

public interface LocalizedTextService {

    void add(LocalizedTextEntity localizedText);
    void update (LocalizedTextEntity localizedText);
    void delete (long id);
    LocalizedTextEntity get(long id);
    List<LocalizedTextEntity> list();
}
