package com.likeurator.squadmania.gameapps.fifaon4.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;

@Document(collection = "players_test") 
@Data @AllArgsConstructor @NoArgsConstructor
public class Player {
    @Id @Indexed(unique = true) private String _id;
    @Indexed(unique = true) @Field(name = "spid") private int spid;
    @Field(name = "information") private Information information;
    @Field(name = "ability") private Ability ability;
    @Field(name = "player_comments") private List<Player> player_comments;
    @Field(name = "perk.skillWraps") private String skillWraps;
    
    @Data @AllArgsConstructor(access = AccessLevel.PROTECTED)
    public class Information{
        @Field(name = "name") private String name;
        @Field(name = "seasonid") private int seasonid;
        @Field(name = "mainOvr") private int mainOvr;
        @Field(name = "playerPic") private String playerPic;
        @Field(name = "seasonIcon") private String seasonIcon;
        @Field(name = "pay") private int pay;
        @Field(name = "mainPosi") private String mainPosi;
        @Field(name = "nation") private String nation;
        @Field(name = "nationPic") private String nationPic;
        @Field(name = "birth") private String birth;
        @Field(name = "height") private int height;
        @Field(name = "weight") private int weight;
        @Field(name = "physical") private String physical;
        @Field(name = "skill") private String skill;
        @Field(name = "foot") private String foot;
        @Field(name = "mainFoot") private String mainFoot;
        @Field(name = "etcSeason") private String etcSeason;        
        @Field(name = "position") private String position;
    }
    @Data
    public class Ability{
        @Field(name = "liveStatus") private String liveStatus;
        @Field(name = "speed") private int speed;
        @Field(name = "accel") private int accel;
        @Field(name = "decision") private int decision;
        @Field(name = "shootPower") private int shootPower;
        @Field(name = "intShoot") private int intShoot;
        @Field(name = "positioning") private int positioning;
        @Field(name = "volley") private int volley;
        @Field(name = "panelty") private int panelty;
        @Field(name = "shortPassshortPass") private int shortPass;
        @Field(name = "vision") private int vision;
        @Field(name = "cross") private int cross;
        @Field(name = "intpass") private int intpass;
        @Field(name = "freekick") private int freekick;
        @Field(name = "curvecurve") private int curve;
        @Field(name = "dribbling") private int dribbling;
        @Field(name = "ballControl") private int ballControl;
        @Field(name = "agility") private int agility;
        @Field(name = "balance") private int balance;
        @Field(name = "reaction") private int reaction;
        @Field(name = "marking") private int marking;
        @Field(name = "standingTackle") private int standingTackle;
        @Field(name = "interception") private int interception;
        @Field(name = "header") private int header;
        @Field(name = "slidingTackle") private int slidingTackle;
        @Field(name = "strength") private int strength;
        @Field(name = "stamina") private int stamina;
        @Field(name = "aggression") private int aggression;
        @Field(name = "jumping") private int jumping;
        @Field(name = "composure") private int composure;
        @Field(name = "GKDiving") private int gKDiving;
        @Field(name = "GKHandling") private int gKHandling;
        @Field(name = "GKKick") private int gKKick;
        @Field(name = "GKReflexe") private int gKReflexe;
        @Field(name = "GKPositioning") private int gKPositioning;
        @Field(name = "stValue") private int stValue;
        @Field(name = "cfValue") private int cfValue;
        @Field(name = "lwValue") private int lwValue;
        @Field(name = "rwValue") private int rwValue;
        @Field(name = "camValue") private int camValue;
        @Field(name = "cmValue") private int cmValue;
        @Field(name = "lmValue") private int lmValue;
        @Field(name = "rmValue") private int rmValue;
        @Field(name = "cdmValue") private int cdmValue;
        @Field(name = "lwbValue") private int lwbValue;
        @Field(name = "rwbValue") private int rwbValue;
        @Field(name = "cbValue") private int cbValue;
        @Field(name = "swValue") private int swValue;
        @Field(name = "lbValue") private int lbValue;
        @Field(name = "rbValue") private int rbValue;
        @Field(name = "gkValue") private int gkValue;
        @Field(name = "skillWraps") private String skillWraps;
        @Field(name = "club") private String club;
    }
}