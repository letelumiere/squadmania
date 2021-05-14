package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
public class RatingHistoryDTO{
    private String playerid;
    private String nickname;
    private Long rating;
}
