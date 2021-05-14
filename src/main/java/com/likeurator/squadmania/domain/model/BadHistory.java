package com.likeurator.squadmania.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "BadHistory")
@ToString
public class BadHistory{
    private String commentid;
    private String nickname;

    @Builder
    public BadHistory(String commentid, String nickname) {
        this.commentid = commentid;
        this.nickname = nickname;
    }
}