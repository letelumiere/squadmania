package com.likeurator.squadmania.gameapps.fifaon4.model;


import java.time.LocalDateTime;

import com.likeurator.squadmania.domain.model.TimeEntity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "comments_test")
public class Comment {

    @Id
    @Indexed(unique = true)
    private String _id;

    @Field(name = "contents")
    private String contents;

    @Field(name = "spid")
    @Indexed(unique = true)
    private int spid;

    @Field(name = "users_nickname")
    private String users_nickname;

    @Field(name = "report_bad")
    private int report_bad;

    @Field(name = "like")
    private int like;

    @Field(name = "created_at")
    @CreatedDate
    private LocalDateTime created_at;

    @Field(name = "modified_at")
    @LastModifiedDate
    private LocalDateTime modified_at;
}
