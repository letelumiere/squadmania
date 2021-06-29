package com.likeurator.squadmania.domain;

import org.joda.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document
@AllArgsConstructor
public class TimeEntity {

    @Field(name = "created_at")
    @CreatedDate
    private LocalDateTime created_at;

    @Field(name = "modified_at")
    @LastModifiedDate  
    private LocalDateTime modified_at;
}
