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

@Document(collection = "board_test") 
@Data @AllArgsConstructor @NoArgsConstructor
public class Board {
    @Id @Indexed(unique = true)private String _id;
    @Field(name = "board_no")private int board_no;
    @Field(name = "nickname")private String nickname;
    @Field(name = "title")private String title;
    @Field(name = "contents")private String contents;
    @Field(name = "created_at") @CreatedDate private LocalDateTime created_at;
    @Field(name = "modified_at") @LastModifiedDate private LocalDateTime modified_at;
}
