package com.likeurator.squadmania.gameapps.fifaon4.model;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PlayerDatabaseDTO {
    
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
    public PlayerDatabaseDTO(ObjectId _id, String playerid, long seasonid, String name, long mainOvr, String playerPic,
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
    
    public PlayerDatabaseDTO documentToDTO(PlayerDatabase player) {
        PlayerDatabaseDTO playerDto = new PlayerDatabaseDTO();
        playerDto.set_id(player.get_id());
        playerDto.setPlayerid(player.getPlayerid());
        playerDto.setSeasonid(player.getSeasonid());
        playerDto.setName(player.getName());
        playerDto.setMainOvr(player.getMainOvr());
        playerDto.setPlayerPic(player.getPlayerPic());
        playerDto.setSeasonIcon(player.getSeasonIcon());
        playerDto.setPay(player.getPay());
        playerDto.setMainPosi(player.getMainPosi());
        playerDto.setNation(player.getNation());
        playerDto.setNationPic(player.getNationPic());
        playerDto.setLiveStatus(player.getLiveStatus());
        playerDto.setBirth(player.getBirth());
        playerDto.setHeight(player.getHeight());
        playerDto.setWeight(player.getWeight());
        playerDto.setPhysical(player.getPhysical());
        playerDto.setSkill(player.getSkill());
        playerDto.setFoot(player.getFoot());
        playerDto.setMainFoot(player.getMainFoot());
        playerDto.setEtcSeason(player.getEtcSeason());
        playerDto.setSpeed(player.getSpeed());
        playerDto.setAccel(player.getAccel());
        playerDto.setDecision(player.getDecision());
        playerDto.setShootPower(player.getShootPower());
        playerDto.setLongShoot(player.getLongShoot());
        playerDto.setPositioning(player.getPositioning());
        playerDto.setLongShoot(player.getLongShoot());
        playerDto.setPositioning(player.getPositioning());
        playerDto.setVolley(player.getVolley());
        playerDto.setPanelty(player.getPanelty());
        playerDto.setShortPass(player.getShortPass());
        playerDto.setVision(player.getVision());
        playerDto.setCross(player.getCross());
        playerDto.setLongpass(player.getLongpass());
        playerDto.setFreekick(player.getFreekick());
        playerDto.setCurve(player.getCurve());
        playerDto.setDribbling(player.getDribbling());
        playerDto.setBallControl(player.getBallControl());
        playerDto.setAgility(player.getAgility());
        playerDto.setBalance(player.getBalance());
        playerDto.setReaction(player.getReaction());
        playerDto.setMarking(player.getMarking());
        playerDto.setStandingTackle(player.getStandingTackle());
        playerDto.setStrength(player.getStrength());
        playerDto.setStamina(player.getStamina());
        playerDto.setAggression(player.getAggression());
        playerDto.setJumping(player.getJumping());
        playerDto.setComposure(player.getComposure());
        playerDto.setGKDiving(player.getGKDiving());
        playerDto.setGKHandling(player.getGKHandling());
        playerDto.setGKKick(player.getGKKick());
        playerDto.setGKReflexe(player.getGKReflexe());
        playerDto.setGKPositioning(player.getGKPositioning());
        playerDto.setStValue(player.getStValue());
        playerDto.setCfValue(player.getCfValue());
        playerDto.setLwValue(player.getLwValue());
        playerDto.setRwValue(player.getRwValue());
        playerDto.setCamValue(player.getCamValue());
        playerDto.setCmValue(player.getCmValue());
        playerDto.setLmValue(player.getLmValue());
        playerDto.setRmValue(player.getRmValue());
        playerDto.setCdmValue(player.getCdmValue());
        playerDto.setLwbValue(player.getLwbValue());
        playerDto.setRwbValue(player.getRwbValue());
        playerDto.setCbValue(player.getCbValue());
        playerDto.setSwValue(player.getSwValue());
        playerDto.setLbValue(player.getLbValue());
        playerDto.setRbValue(player.getRbValue());
        playerDto.setGkValue(player.getGkValue());
        playerDto.setSkillWraps(player.getSkillWraps());
        playerDto.setClub(player.getClub());

        return playerDto;
    }
    
    public PlayerDatabase toDocumentBuild() {
        PlayerDatabase player = PlayerDatabase.builder()
                                        ._id(_id)
                                        .playerid(playerid)
                                        .seasonid(seasonid)
                                        .name(name)
                                        .mainOvr(mainOvr)
                                        .playerPic(playerPic)
                                        .seasonIcon(seasonIcon)
                                        .pay(pay)
                                        .mainPosi(mainPosi)
                                        .nation(nation)
                                        .nationPic(nationPic)
                                        .liveStatus(liveStatus)
                                        .birth(birth)
                                        .height(height)
                                        .weight(weight)
                                        .physical(physical)
                                        .skill(skill)
                                        .foot(foot)
                                        .mainFoot(mainFoot)
                                        .etcSeason(etcSeason)
                                        .speed(speed)
                                        .accel(accel)
                                        .decision(decision)
                                        .shootPower(shootPower)
                                        .longShoot(longShoot)
                                        .positioning(positioning)
                                        .longShoot(longShoot)
                                        .positioning(positioning)
                                        .volley(volley)
                                        .panelty(panelty)
                                        .shortPass(shortPass)
                                        .vision(vision)
                                        .cross(cross)
                                        .longpass(longpass)
                                        .freekick(freekick)
                                        .curve(curve)
                                        .dribbling(dribbling)
                                        .ballControl(ballControl)
                                        .agility(agility)
                                        .balance(balance)
                                        .reaction(reaction)
                                        .marking(marking)
                                        .standingTackle(standingTackle)
                                        .strength(strength)
                                        .stamina(stamina)
                                        .aggression(aggression)
                                        .jumping(jumping)
                                        .composure(composure)
                                        .gKDiving(GKDiving)
                                        .gKHandling(GKHandling)
                                        .gKKick(GKKick)
                                        .gKReflexe(GKReflexe)
                                        .gKPositioning(GKPositioning)
                                        .stValue(stValue)
                                        .cfValue(cfValue)
                                        .lwValue(lwValue)
                                        .rwValue(rwValue)
                                        .camValue(camValue)
                                        .cmValue(cmValue)
                                        .lmValue(lmValue)
                                        .rmValue(rmValue)
                                        .cdmValue(cdmValue)
                                        .lwbValue(lwbValue)
                                        .rwbValue(rwbValue)
                                        .cbValue(cbValue)
                                        .swValue(swValue)
                                        .lbValue(lbValue)
                                        .rbValue(rbValue)
                                        .gkValue(gkValue)
                                        .skillWraps(skillWraps)
                                        .club(club)
                                        .build();
        return player;
    }
}


