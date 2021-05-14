package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "Comments")
@ToString
public class Comment{
    private String comment;
    private String playerid;
    private String nickname;
    private Long reportbad;
    private Long recommend;

    @Builder
    public Comment(String comment, String playerid, String nickname, Long reportbad, Long recommend) {
        this.comment = comment;
        this.playerid = playerid;
        this.nickname = nickname;
        this.reportbad = reportbad;
        this.recommend = recommend;
    }

}