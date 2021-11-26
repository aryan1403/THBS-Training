package com.example.shoppingapi.Controllers.Auth;

import com.example.shoppingapi.Helpers.authlogin;
import com.example.shoppingapi.Helpers.response;
import com.example.shoppingapi.DB.insertData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class loginController {

    @PostMapping("/login")
    public response login(@RequestBody authlogin credentials) {
        return insertData.userLogin(credentials);
    }

    @GetMapping("/allUser")
    public response getallUsers() {
        return insertData.meow();
    }
}
