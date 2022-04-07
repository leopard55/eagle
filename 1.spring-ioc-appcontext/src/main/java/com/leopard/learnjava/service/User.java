package com.leopard.learnjava.service;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-04-07 13:17
 */
@Data
@AllArgsConstructor
public class User {
    private long id;
    private String email;
    private String password;
    private String name;
}
