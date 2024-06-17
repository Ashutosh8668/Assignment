package com.hiracademyassignment.Hirademy.Repository;


import com.hiracademyassignment.Hirademy.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

