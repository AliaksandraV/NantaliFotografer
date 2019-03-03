package by.nantalifoto.dao;

import by.nantalifoto.config.AppConfig;
import by.nantalifoto.entity.AlbumEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class AlbumDaoImplTest {

    @Autowired
    private AlbumDaoImpl albumDao;


    @Test
    public void testAdd() {
        // when
        AlbumEntity albumEntity = new AlbumEntity();
        Date date = new Date();
        albumEntity.setDate(date);
//        albumEntity.setLocalizedName("");

        // call

        // then
    }
}