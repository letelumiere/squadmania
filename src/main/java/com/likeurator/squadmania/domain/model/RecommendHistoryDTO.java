package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString
public class RecommendHistoryDTO{
    private String nickname;
    private String commentid;
}