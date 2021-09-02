package com.likeurator.squadmania.domain.model;

import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users_test") @Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id @Indexed(unique = true) private String _id;
    @Field(name = "username") private String username;
    @Field(name = "email") private String email;
    @Field(name = "provider") private String provider;
    @Field(name = "password") private String password;
    @Field(name = "confirmationToken") private String confirmationToken;
    @Field(name = "confirmed") private String confirmed;
    @Field(name = "blocked") private boolean blocked;
    @Field(name = "role") private String role;
    @Field(name = "nickname") private String nickname;
    @Field(name = "icon") private String icon;
    @Field(name = "other1") private String other1;
    @Field(name = "other2") private int other2;
    @Field(name = "created_at") @CreatedDate private LocalDateTime created_at;
    @Field(name = "modified_at") @LastModifiedDate private LocalDateTime modified_at;
}
