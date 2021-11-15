package com.wicodeTask.wicodeTask.Repository;

import com.wicodeTask.wicodeTask.Model.userInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface userRepo extends JpaRepository<userInfo, Long> {
    userInfo findById(String aLong);
}
