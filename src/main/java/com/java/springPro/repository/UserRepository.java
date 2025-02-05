package com.java.springPro.repository;


import com.java.springPro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from users where email = ?1", nativeQuery = true)
    User findByEmail(@Param("email") String email);


}

