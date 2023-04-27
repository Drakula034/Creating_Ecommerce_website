package com.ecommerce.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.ecommerce.admin.entity.user.RoleRepository;
import com.ecommerce.common.entity.Role;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RoleRepositoryTests {
	
	@Autowired
    private RoleRepository roleRepo;

    @Test
    public void testCreateFirstRole(){
        Role roleAdmin = new Role(null, "Admin", "manage everything");
        Role savedRole = roleRepo.save(roleAdmin);

        assertThat(savedRole.getId()).isGreaterThan(0);
    }
    
    @Test
    public void testCreateRestRoles(){
        Role roleSalesperson = new Role(null, "Salesperson", "manage product price, customers,"
        		+ " shipping, orders and sales report");
        
        Role roleEditor = new Role(null, "Editor", "manage products, categories,"
        		+ " brands, articles, and menus");
        	
        Role roleShipper = new Role(null, "Shipper", "view products, view orders and update order status");
        
        Role roleAssistant = new Role(null, "Assistant", "manages question and reviews");
        
        roleRepo.saveAll(List.of(roleSalesperson, roleEditor, roleShipper, roleAssistant));
        
    }
	

}
