package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
public class UserDTO{
    private String username;
    private String email;
    private String provider;
    private String password;
    private String resetPasswordToken;
    private String confirmationToken;
    private String confirmed;
    private String blocked;
    private String role;
    private String nickname;
    private String icon;
    private String other1;
    private Long other2;
}