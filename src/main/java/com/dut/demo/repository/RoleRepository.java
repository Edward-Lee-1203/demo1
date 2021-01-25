package com.dut.demo.repository;

import com.dut.demo.common.ERole;
import com.dut.demo.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName (ERole name);
}
