package com.likeurator.squadmania.gameapps.fifaon4.model;

//DTO class Followed by nexon Developer's API Standard. just keeping.
/*
public class NexonDevDTO {
    
    public static class Defence {
        private int blockTry;
        private int blockSuccess;
        private int tackleTry;
        private int tackleSuccess;
    }
}
/*
    @ToString(exclude = "matchInfo")
    @Table(name = "tb_match")
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    public static class Match {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String matchId;
        private String matchDate;
        private int matchType;
        
        @OneToMany(mappedBy = "match")
        private List<MatchInfo> matchInfo;
    }

    public static class MatchDetail {
        private int seasonId;
        private String matchResult;
        private int matchEndType;
        private int systemPause;
        private int	foul;
        private int injury;
        private int redCards;
        private int yellowCards;	
        private int dribble;
        private int cornerKick;
        private int offsideCount;
        private double averageRating;
        private String controller;
        private int possession;
    }


    @Entity
    @ToString(exclude = {"matchDetail", "shoot", "shootDetail", "player", "pass", "defence"})
    @Table(name = "tb_matchInfo")
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    public static class MatchInfo {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String accessId;
        private String nickname;
        
        @OneToMany(mappedBy = "matchInfo")
        private MatchDetail matchDetail;
        private Shoot shoot;
        
        @OneToOne
        private List<ShootDetail> shootDetail;
        
        @OneToMany
        private List<Player> player;
        private Pass pass;
        private Defence defence;
        
        @ManyToOne
        @JoinColumn(name="matchInfo_id")
        private Match match;
        
    }
    public static class MatchInfoDetail {
        private String seasonId;
        private String matchResult;
        private String matchEndType;
        private String systemPause;
        private String foul;
        private String injury;
        private String redCards;
        private String yellowCards;
        private String dribble;
        private String cornerKick;
        private String possession;
        private String offsideCount;
        private String averageRating;
        private String controller;
    }
    @Data
    public static class Pass {
        private int passTry;
        private int passSuccess;
        private int shortPassTry; 
        private int shortPassSuccess; 
        private int longPassTry;
        private int longPassSuccess;
        private int bouncingLobPassTry;
        private int bouncingLobPassSuccess;
        private int drivenGroundPassTry;
        private int drivenGroundPassSuccess;
        private int throughPassTry;
        private int throughPassSuccess;
        private int lobbedThroughPassTry;
        private int lobbedThroughPassSuccess;
    }

    @Data
    @Entity
    public static class Player {
        private int spId;
        private int spPosition;
        private int spGrade;
        
        @OneToOne
        private Status status;
    }

    public static class Shoot {
        private int shootTotal;
        private int effectiveShootTotal;
        private int shootOutScore;
        private int goalTotal;
        private int goalTotalDisplay;
        private int ownGoal;
        private int shootHeading;
        private int goalHeading;
        private int shootFreekick;
        private int goalFreekick;
        private int shootInPenalty;
        private int goalInPenalty;
        private int shootOutPenalty;
        private int goalOutPenalty;
        private int shootPenaltyKick;
        private int goalPenaltyKick;	
    }

    public static class ShootDetail {
        private int goalTime;
        private double x;
        private double y;
        private int type;
        private int result;
        private int spId;
        private int spGrade;
        private int spLevel;
        private boolean spIdType;
        private boolean assist;
        private int assistSpId;
        private double assistX;
        private double assistY;
        private boolean hitPost;
        private boolean inPenalty;
    }

    public static class Status {
        private int shoot;
        private int effectiveShoot;
        private int assist;
        private int goal;
        private int dribble;
        private int intercept;
        private int defending;
        private int passTry;
        private int passSuccess;
        private int dribbleTry;
        private int dribbleSuccess;
        private int ballPossesionTry;
        private int ballPossesionSuccess;
        private int aerialTry;
        private int aerialSuccess;
        private int blockTry;
        private int block;
        private int tackleTry;
        private int tackle;
        private int yellowCards;
        private int redCards;
        private float spRating;
    }

    public static class Users {
        private String nickname;
        private String accessId;
        private String level;
    }
}
  
*/