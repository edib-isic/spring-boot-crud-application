package com.cvt.programmingTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvt.programmingTask.model.User;

/**
 * @author edibi
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
