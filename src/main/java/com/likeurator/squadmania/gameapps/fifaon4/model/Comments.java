package com.likeurator.squadmania.gameapps.fifaon4.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "comments")
@ToString
public class Comments{

    @MongoId
    private ObjectId _id;
    private String comment;
    private String playerid;
    private String nickname;
    private Long reportbad;
    private Long recommend;

    @Builder
    public Comments(ObjectId _id, String comment, String playerid, String nickname, Long reportbad, Long recommend) {
        this._id = _id;
        this.comment = comment;
        this.playerid = playerid;
        this.nickname = nickname;
        this.reportbad = reportbad;
        this.recommend = recommend;
    }

}