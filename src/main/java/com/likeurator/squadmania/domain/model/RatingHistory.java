package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Getter
@Document(collection = "RatingHistories")
@ToString
public class RatingHistory{
    private String playerid;
    private String nickname;
    private Long rating;

    @Builder
    public RatingHistory(String playerid, String nickname, Long rating) {
        this.playerid = playerid;
        this.nickname = nickname;
        this.rating = rating;
    }
}