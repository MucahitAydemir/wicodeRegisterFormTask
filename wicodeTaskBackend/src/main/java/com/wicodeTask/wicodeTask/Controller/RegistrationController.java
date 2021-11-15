package com.wicodeTask.wicodeTask.Controller;
import com.wicodeTask.wicodeTask.Model.userInfo;
import com.wicodeTask.wicodeTask.Service.registrationService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.Registration;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    private registrationService regService;

    public RegistrationController(registrationService regService) {
        this.regService = regService;
    }
    @CrossOrigin
    @PostMapping("/register")
    public void registerUser(@RequestBody userInfo user) throws Exception {
        regService.saveUserInfo(user);
    }
}
