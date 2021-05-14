package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor
@Getter
@Document(collection ="RecommendHistories")
@ToString
public class RecommendHistory{
    private String nickname;
    private String commentid;

    @Builder
    public RecommendHistory(String nickname, String commentid) {
        this.nickname = nickname;
        this.commentid = commentid;
    }
}