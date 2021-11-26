package com.example.demo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Participants {
    String name;
    String profile;
    String gender;
    List<Object> fav;
    double salary;
    
}
