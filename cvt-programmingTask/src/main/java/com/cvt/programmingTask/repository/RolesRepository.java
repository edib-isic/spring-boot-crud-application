package com.cvt.programmingTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cvt.programmingTask.model.Roles;

/**
 * @author edibi
 *
 */
@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}
