package com.mycmp.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycmp.users.model.Role;
import com.mycmp.users.model.RoleName;

import java.util.Optional;
/**
 * 
 * @author allib
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
