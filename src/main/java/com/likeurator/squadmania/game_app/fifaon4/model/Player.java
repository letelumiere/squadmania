package com.likeurator.squadmania.game_app.fifaon4.model;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Document(collection = "playerdatabases")
@ToString
public class Player {
    
    @MongoId
    private ObjectId _id;
    private String playerid;
    private long seasonid;
    private String name;
    private long mainOvr;
    private String playerPic;
    private String seasonIcon;
    private long pay;
    private String mainPosi;
    private String nation;
    private String nationPic;
    private String liveStatus;
    private String birth;
    private long height;
    private long weight;
    private String physical;
    private String skill;
    private String foot;
    private String mainFoot;
    private String etcSeason;
    private long speed;
    private long accel;
    private long decision;
    private long shootPower;
    private long longShoot;
    private long positioning;
    private long volley;
    private long panelty;
    private long shortPass;
    private long vision;
    private long cross;
    private long longpass;
    private long freekick;
    private long curve;
    private long dribbling;
    private long ballControl;
    private long agility;
    private long balance;
    private long reaction;
    private long marking;
    private long standingTackle;
    private long interception;
    private long header;
    private long slidingTackle;
    private long strength;
    private long stamina;
    private long aggression;
    private long jumping;
    private long composure;
    private long GKDiving;
    private long GKHandling;
    private long GKKick;
    private long GKReflexe;
    private long GKPositioning;
    private long stValue;
    private long cfValue;
    private long lwValue;
    private long rwValue;
    private long camValue;
    private long cmValue;
    private long lmValue;
    private long rmValue;
    private long cdmValue;
    private long lwbValue;
    private long rwbValue;
    private long cbValue;
    private long swValue;
    private long lbValue;
    private long rbValue;
    private long gkValue;
    private String skillWraps;
    private String club;
    
    @Builder
    public Player(ObjectId _id, String playerid, long seasonid, String name, long mainOvr, String playerPic,
            String seasonIcon, long pay, String mainPosi, String nation, String nationPic, String liveStatus,
            String birth, long height, long weight, String physical, String skill, String foot, String mainFoot,
            String etcSeason, long speed, long accel, long decision, long shootPower, long longShoot, long positioning,
            long volley, long panelty, long shortPass, long vision, long cross, long longpass, long freekick,
            long curve, long dribbling, long ballControl, long agility, long balance, long reaction, long marking,
            long standingTackle, long interception, long header, long slidingTackle, long strength, long stamina,
            long aggression, long jumping, long composure, long gKDiving, long gKHandling, long gKKick, long gKReflexe,
            long gKPositioning, long stValue, long cfValue, long lwValue, long rwValue, long camValue, long cmValue,
            long lmValue, long rmValue, long cdmValue, long lwbValue, long rwbValue, long cbValue, long swValue,
            long lbValue, long rbValue, long gkValue, String skillWraps, String club) {
        this._id = _id;
        this.playerid = playerid;
        this.seasonid = seasonid;
        this.name = name;
        this.mainOvr = mainOvr;
        this.playerPic = playerPic;
        this.seasonIcon = seasonIcon;
        this.pay = pay;
        this.mainPosi = mainPosi;
        this.nation = nation;
        this.nationPic = nationPic;
        this.liveStatus = liveStatus;
        this.birth = birth;
        this.height = height;
        this.weight = weight;
        this.physical = physical;
        this.skill = skill;
        this.foot = foot;
        this.mainFoot = mainFoot;
        this.etcSeason = etcSeason;
        this.speed = speed;
        this.accel = accel;
        this.decision = decision;
        this.shootPower = shootPower;
        this.longShoot = longShoot;
        this.positioning = positioning;
        this.volley = volley;
        this.panelty = panelty;
        this.shortPass = shortPass;
        this.vision = vision;
        this.cross = cross;
        this.longpass = longpass;
        this.freekick = freekick;
        this.curve = curve;
        this.dribbling = dribbling;
        this.ballControl = ballControl;
        this.agility = agility;
        this.balance = balance;
        this.reaction = reaction;
        this.marking = marking;
        this.standingTackle = standingTackle;
        this.interception = interception;
        this.header = header;
        this.slidingTackle = slidingTackle;
        this.strength = strength;
        this.stamina = stamina;
        this.aggression = aggression;
        this.jumping = jumping;
        this.composure = composure;
        this.GKDiving = gKDiving;
        this.GKHandling = gKHandling;
        this.GKKick = gKKick;
        this.GKReflexe = gKReflexe;
        this.GKPositioning = gKPositioning;
        this.stValue = stValue;
        this.cfValue = cfValue;
        this.lwValue = lwValue;
        this.rwValue = rwValue;
        this.camValue = camValue;
        this.cmValue = cmValue;
        this.lmValue = lmValue;
        this.rmValue = rmValue;
        this.cdmValue = cdmValue;
        this.lwbValue = lwbValue;
        this.rwbValue = rwbValue;
        this.cbValue = cbValue;
        this.swValue = swValue;
        this.lbValue = lbValue;
        this.rbValue = rbValue;
        this.gkValue = gkValue;
        this.skillWraps = skillWraps;
        this.club = club;
    }
}


