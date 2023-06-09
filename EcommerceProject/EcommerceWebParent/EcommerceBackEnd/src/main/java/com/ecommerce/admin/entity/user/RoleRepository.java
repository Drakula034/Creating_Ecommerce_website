package com.ecommerce.admin.entity.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.common.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
