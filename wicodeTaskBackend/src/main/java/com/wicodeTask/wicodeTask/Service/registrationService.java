package com.wicodeTask.wicodeTask.Service;

import com.wicodeTask.wicodeTask.Model.userInfo;
import com.wicodeTask.wicodeTask.Repository.userRepo;
import org.springframework.stereotype.Service;

import javax.persistence.Convert;


@Service
public class registrationService {

    private userRepo repo;

    public registrationService(userRepo repo) {
        this.repo = repo;
    }

    public void saveUserInfo(userInfo user){
        repo.save(user);
    }

}
