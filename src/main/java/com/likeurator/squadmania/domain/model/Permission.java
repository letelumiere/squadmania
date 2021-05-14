package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "Permission")
@ToString
public class Permission{
    
    private String type;
    private String controller;
    private String action;
    private boolean enabled;
    private String policy;
    private String role; //??
    private String nickname;
    private String icon;
    private String other1;
    private Long other2;

    @Builder
    public Permission(String type, String controller, String action, boolean enabled, String policy, String role,
            String nickname, String icon, String other1, Long other2) {
        this.type = type;
        this.controller = controller;
        this.action = action;
        this.enabled = enabled;
        this.policy = policy;
        this.role = role;
        this.nickname = nickname;
        this.icon = icon;
        this.other1 = other1;
        this.other2 = other2;
    }

}

