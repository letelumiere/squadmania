package com.likeurator.squadmania.domain.model;


import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
public class RoleDTO{
    private String name;
    private String description;
    private String type;
    private String permissions; //?
    private String users; //?
}