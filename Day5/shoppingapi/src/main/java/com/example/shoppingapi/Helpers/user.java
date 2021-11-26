package com.example.shoppingapi.Helpers;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class user {
    String uid; // User ID
    String name;
    String email;
    String password;
    String country_code;
    int number;
    List<Object> cart;
}
