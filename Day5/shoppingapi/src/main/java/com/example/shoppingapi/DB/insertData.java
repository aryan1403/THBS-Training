package com.example.shoppingapi.DB;

import java.util.ArrayList;
import java.util.List;
import com.example.shoppingapi.Helpers.authlogin;
import com.example.shoppingapi.Helpers.response;
import com.example.shoppingapi.Helpers.user;

public class insertData {
    static List<user> userList = new ArrayList<>();

    // Register
    public static response addUser(user u) {
        if(userList.add(u)) {
            return new response(200, "Registered User Successfully", u);
        }
        return new response(404, "Error Occured", null);
    }

    // Login
    public static response userLogin(authlogin credentials) {
        for (user usr : userList) {
            if(usr.getEmail().equals(credentials.getEmail()) && usr.getPassword().equals(credentials.getPassword())){
                return new response(200, "Logged in Successfully", usr);
            }
        }
        return new response(404, "User not Found", null);
    }

    public static response meow() {
        return new response(200, "Fetched All Users Successfully", userList);
    }
}
