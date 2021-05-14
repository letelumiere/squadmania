package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;


@Getter
@Setter
@ToString
public class CommentDTO{
    private String comment;
    private String playerid;
    private String nickname;
    private Long reportbad;
    private Long recommend;
}