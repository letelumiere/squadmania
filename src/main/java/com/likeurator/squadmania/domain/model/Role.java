package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "Role")
@ToString
public class Role{
    private String name;
    private String description;
    private String type;
    private String permissions; //?
    private String users; //?

    @Builder
    public Role(String name, String description, String type, String permissions, String users) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.permissions = permissions;
        this.users = users;
    }
}
