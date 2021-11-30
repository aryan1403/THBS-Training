package com.bookapi.books;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class response {
    int responsecode;
    String message;
    Object response;
}
