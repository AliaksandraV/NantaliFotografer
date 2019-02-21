package by.nantalifoto;

import by.nantalifoto.config.AppConfig;
import by.nantalifoto.entity.RoleEntity;
import by.nantalifoto.service.RoleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        RoleService roleService = context.getBean(RoleService.class);

        /**CRUD для ROLEENTITY Готов*/
//        RoleEntity roleEntity = new RoleEntity();
//        roleEntity.setRole("admin");
//        roleService.add(roleEntity);
//        System.out.println(roleEntity.getId());
//        roleEntity.setRole("user");
//        roleService.add(roleEntity);
//        System.out.println(roleEntity.getId());

//        int i = 3;
//        roleEntity.setRole("test update");
//        roleService.update(i,roleEntity);

//        roleService.delete(8);
//
//        List<RoleEntity> roles = roleService.roleList();
//        for(RoleEntity role: roles){
//            System.out.println("Id = "+ role.getId());
//            System.out.println("Role = "+ role.getRole());
//            System.out.println();
//        }

//        System.out.println(roleService.get(3).getId() +"!!!"+roleService.get(3).getRole());







        context.close();
    }
}
