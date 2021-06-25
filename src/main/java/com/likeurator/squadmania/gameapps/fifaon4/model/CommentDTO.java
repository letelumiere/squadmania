package com.likeurator.squadmania.gameapps.fifaon4.model;

import com.mongodb.internal.connection.Time;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.*;
/*
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CommentDTO {
    @MongoId
    private ObjectId _id;

    @Field(name = "comment")
    private String contents;

    @Field(name = "playerid")
    private int playerid;

    @Field(name = "nickname")
    private String nickname;

    @Field(name = "reportbad")
    private Long reportbad;

    @Field(name = "recommend")
    private Long recommend;

/*
    public CommentDTO documentToDTO(CommentDTO comment){
        CommentDTO commentDto = new CommentDTO();
        commentDto.set_id(comment.get_id());
        commentDto.setContents(comment.getContents());
        commentDto.setPlayerid(comment.getPlayerid());
        commentDto.setNickname(comment.getNickname());
        commentDto.setReportbad(comment.getReportbad());
        commentDto.setRecommend(comment.getRecommend());

        return commentDto;
    }

    public CommentDTO toDocumentBuild(){
        CommentDTO comment = CommentDTO.builder()
                                    ._id(_id)
                                    .contents(contents)
                                    .playerid(playerid)
                                    .nickname(nickname)
                                    .reportbad(reportbad)
                                    .recommend(recommend)
                                    .build();
        
        return comment;
    }
  
}

*/