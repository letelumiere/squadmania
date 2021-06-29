package com.likeurator.squadmania.domain.account.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String email;
    private String provider;
    private String password;
    private String confirmationToken;
    private String confirmed;
    private boolean blocked;
    private String role;
    private String nickname;
    private String icon;
    private String other1;
    private int other2;
}
