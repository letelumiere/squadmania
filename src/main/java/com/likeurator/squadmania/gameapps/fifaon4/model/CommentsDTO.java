package com.likeurator.squadmania.gameapps.fifaon4.model;

import com.mongodb.internal.connection.Time;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CommentsDTO{

    @MongoId
    private ObjectId _id;
    private String comment;
    private String playerid;
    private String nickname;
    private Long reportbad;
    private Long recommend;

    @Builder
    public CommentsDTO(ObjectId _id, String comment, String playerid, String nickname, Long reportbad, Long recommend) {
        this._id = _id;
        this.comment = comment;
        this.playerid = playerid;
        this.nickname = nickname;
        this.reportbad = reportbad;
        this.recommend = recommend;
    }

    public CommentsDTO documentToDTO(Comments comment){
        CommentsDTO commentDto = new CommentsDTO();
        commentDto.set_id(comment.get_id());
        commentDto.setComment(comment.getComment());
        commentDto.setPlayerid(comment.getPlayerid());
        commentDto.setNickname(comment.getNickname());
        commentDto.setReportbad(comment.getReportbad());
        commentDto.setRecommend(comment.getRecommend());

        return commentDto;
    }

    public Comments toDocumentBuild(){
        Comments comments = Comments.builder()
                                    ._id(_id)
                                    .comment(comment)
                                    .playerid(playerid)
                                    .nickname(nickname)
                                    .reportbad(reportbad)
                                    .recommend(recommend)
                                    .build();
        
        return comments;
    }
}