package com.example.shoppingapi.Controllers.Auth;

import com.example.shoppingapi.DB.insertData;
import com.example.shoppingapi.Helpers.response;
import com.example.shoppingapi.Helpers.user;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class registerController {
    @PostMapping("/register")
    public response register(@RequestBody user u) {
        return insertData.addUser(u);
    }
}
