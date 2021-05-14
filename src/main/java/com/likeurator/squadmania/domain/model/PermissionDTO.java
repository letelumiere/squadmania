package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
public class PermissionDTO{
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
}
