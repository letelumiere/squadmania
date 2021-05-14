package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "User")
@ToString
public class User{
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

    @Builder
    public User(String username, String email, String provider, String password, String resetPasswordToken,
            String confirmationToken, String confirmed, String blocked, String role, String nickname, String icon,
            String other1, Long other2) {
        this.username = username;
        this.email = email;
        this.provider = provider;
        this.password = password;
        this.resetPasswordToken = resetPasswordToken;
        this.confirmationToken = confirmationToken;
        this.confirmed = confirmed;
        this.blocked = blocked;
        this.role = role;
        this.nickname = nickname;
        this.icon = icon;
        this.other1 = other1;
        this.other2 = other2;
    }
    
}