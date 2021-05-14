package com.likeurator.squadmania.domain.model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
public class PlayerRatingDTO{
    private String playerid;
    private Long rating;
    private Long howmanyusers;
}