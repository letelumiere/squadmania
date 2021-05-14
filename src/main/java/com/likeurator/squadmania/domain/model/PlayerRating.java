package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "PlayerRatings")
@ToString
public class PlayerRating{
    private String playerid;
    private Long rating;
    private Long howmanyusers;

    @Builder
    public PlayerRating(String playerid, Long rating, Long howmanyusers) {
        this.playerid = playerid;
        this.rating = rating;
        this.howmanyusers = howmanyusers;
    }

}