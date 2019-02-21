package by.nantalifoto;

import by.nantalifoto.config.AppConfig;
import by.nantalifoto.entity.AlbumEntity;
import by.nantalifoto.entity.LocalizedTextEntity;
import by.nantalifoto.entity.RoleEntity;
import by.nantalifoto.service.AlbumService;
import by.nantalifoto.service.LocalizedTextService;
import by.nantalifoto.service.RoleService;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        RoleService roleService = context.getBean(RoleService.class);
        AlbumService albumService = context.getBean(AlbumService.class);
        LocalizedTextService localizedTextService = context.getBean(LocalizedTextService.class);

        /**CRUD для ROLEENTITY Готов*/
        //TODO Сделать в базе нормальные роли
//        RoleEntity roleEntity = new RoleEntity();
//        roleEntity.setRole("admin");
//        roleService.add(roleEntity);
//        System.out.println(roleEntity.getId());
//        roleEntity.setRole("user");
//        roleService.add(roleEntity);
//        System.out.println(roleEntity.getId());
//
//
//        roleEntity.setId(9);
//        roleEntity.setRole("test update");
//        roleService.update(roleEntity);
//
//        roleService.delete(12);
//
//        List<RoleEntity> roles = roleService.list();
//        for(RoleEntity role: roles){
//            System.out.println("Id = "+ role.getId());
//            System.out.println("Role = "+ role.getRole());
//            System.out.println();
//        }
//
//        System.out.println(roleService.get(3).getId() +"!!!"+roleService.get(3).getRole());
        /**CRUD для ALBUMENTITY Готов*/
        //TODO Сделать добавление имени при добавлении нового объекта, наверное это будет делаться через сервис
        //TODO Сделать добавление категории при создании альбома, и сделать категорию NOT NULL т.к. по факту альбом всегда будет создаваться в какой-либо категории
        //TODO При удлении удалять соответствующую строку в таблице LocalizedText!!!
//        AlbumEntity album = new AlbumEntity();
//        Calendar calendar = new GregorianCalendar(2019,01,17);
//        album.setDate(calendar.getTime());
//        albumService.add(album);
//
//        album.setId(2);
//        album.setDate(new Date());
//        albumService.update(album);
//
//        albumService.delete(1);
//
//        System.out.println(albumService.get(5));
//
//        List<AlbumEntity>albums = albumService.list();
//        for (AlbumEntity album1: albums){
//            System.out.println("ID = "+ album1.getId());
//            System.out.println("Data = "+ album1.getDate());
//            System.out.println("Name = "+ album1.getLocalizedName());
//            System.out.println("Photo category = "+ album1.getPhotoCategory());
//            System.out.println();
//        }
        /**CRUD для LocalizedTextEntity*/
//        LocalizedTextEntity localizedText = new LocalizedTextEntity();

//        localizedText.setRussian("Привет");
//        localizedText.setEnglish("Helo");
//        localizedText.setGerman("hz");
//        localizedTextService.add(localizedText);
//        localizedText.setRussian("1");
//        localizedText.setEnglish("1");
//        localizedText.setGerman("1");
//        localizedTextService.add(localizedText);
//        localizedText.setRussian("2");
//        localizedText.setEnglish("2");
//        localizedText.setGerman("2");
//        localizedTextService.add(localizedText);
//
//        localizedText.setGerman("hz");
//        localizedText.setRussian("Обновила");
//        localizedText.setEnglish("Update");
//        localizedText.setId(3);
//        localizedTextService.update(localizedText);
//        localizedTextService.delete(2);
//
//        System.out.println(localizedTextService.get(1));
//
//        List<LocalizedTextEntity> locText = localizedTextService.list();
//        for (LocalizedTextEntity localizedTex:locText){
//            System.out.println("Текст на русском = "+ localizedTex.getRussian());
//            System.out.println("Текст на английском = "+ localizedTex.getEnglish());
//            System.out.println("Текст на немецком = "+ localizedTex.getGerman());
//            System.out.println();
//        }

        context.close();
    }
}
