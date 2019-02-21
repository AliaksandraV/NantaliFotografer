package by.nantalifoto.service;

import by.nantalifoto.config.AppConfig;
import by.nantalifoto.entity.RoleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class RoleServiceImpTest {

    @Autowired
    private RoleService roleService;

    @Test
    public  void testCRUDforRoleEntity(){

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

    }

}