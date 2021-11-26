package com.example.shoppingapi.Helpers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
public class authlogin {
    String email;
    String password;
}
