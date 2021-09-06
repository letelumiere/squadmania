package com.likeurator.squadmania.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "roles_test") 
@Data @AllArgsConstructor @NoArgsConstructor
public class Role {
    @Id @Indexed(unique = true) private String _id;
    @Field(name = "name") private String name;    
    @Field(name = "description") private String description;
    @Field(name = "type") private String type;
}
