package com.app.springbootjdbconly.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {
    private String id;
    private String username;
    private String password;
}
