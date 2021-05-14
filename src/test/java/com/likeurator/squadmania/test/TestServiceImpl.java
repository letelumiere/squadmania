package com.likeurator.squadmania.test;


public class TestServiceImpl {
	/*
	@Service("FifaonService")
	implements FifaonService {
	private static final String AUTHORIZATION = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50X2lkIjoiMTMyNjIwNzg1OCIsImF1dGhfaWQiOiIyIiwidG9rZW5fdHlwZSI6IkFjY2Vzc1Rva2VuIiwic2VydmljZV9pZCI6IjQzMDAxMTQ4MSIsIlgtQXBwLVJhdGUtTGltaXQiOiI1MDA6MTAiLCJuYmYiOjE2MDg5NzU0MTgsImV4cCI6MTYyNDUyNzQxOCwiaWF0IjoxNjA4OTc1NDE4fQ.xBWhSNzSc_nkrXTJdTYSmsk8enfADOvoppRhfaCtYQw";
	private RestTemplate restTemplate;
	private JsonParser jParser;
	
	@Autowired
	public void FifaonService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Override
	public Users SearchUserByNickname(String nickname) {
		String base_url = "https://api.nexon.co.kr/fifaonline4/v1.0/users?";
		
		URI uriBuilder = UriComponentsBuilder.fromHttpUrl(base_url)
				.queryParam("nickname", nickname)
				.build("usersInfo");
		
		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.add("Authorization", AUTHORIZATION);
		httpheaders.add("Content-Type","application/json; charset=UTF-8");
		
		RequestEntity<Void> requestEntity = RequestEntity.get(uriBuilder).headers(httpheaders).build();
		ResponseEntity<Users> response = restTemplate.exchange(uriBuilder, HttpMethod.GET, requestEntity, Users.class);
		
		Users users = response.getBody();
		
		return users;
	}

	@Override
	public List<Object> SearchMatchListByAccessId(String accessId) throws JsonParseException {
		String base_url = "https://api.nexon.co.kr/fifaonline4/v1.0/users/";
		
		URI uriBuilder = UriComponentsBuilder.fromHttpUrl(base_url+accessId)				
				.path("/matches")
				.queryParam("matchtype", 50)
				.queryParam("offset", 0)
				.queryParam("limit", 100)
				.build("matchList");

		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.add("Authorization", AUTHORIZATION);
		httpheaders.add("Content-Type","application/json; charset=UTF-8");
				
		RequestEntity<Void> requestEntity = RequestEntity.get(uriBuilder).headers(httpheaders).build();		
		ResponseEntity<String> response = restTemplate.exchange(uriBuilder, HttpMethod.GET, requestEntity, String.class);
		jParser = JsonParserFactory.getJsonParser();
		
		List<Object> matchList = jParser.parseList(response.getBody());

		return matchList;
	}
	
	@Override
	public Match ReadMatchInfoDetail(String matchId) {
		String base_url = "https://api.nexon.co.kr/fifaonline4/v1.0/";

		URI uriBuilder = UriComponentsBuilder.fromHttpUrl(base_url)
				.path("/matches")
				.path("/"+matchId)
				.build("matchInfoDetail");
		
		HttpHeaders httpheaders = new HttpHeaders();
		httpheaders.add("Authorization", AUTHORIZATION);
		httpheaders.add("Content-Type","application/json; charset=UTF-8");
				
		RequestEntity<Void> requestEntity = RequestEntity.get(uriBuilder).headers(httpheaders).build();		
		
		//작성한 entity 클래스(자바빈즈 객체)로 지정하여 response 받음. 괜히 String으로 받아서 parsing고민 하지 말자.
		ResponseEntity<Match> response = restTemplate.exchange(uriBuilder, HttpMethod.GET, requestEntity, Match.class);
		Match match = response.getBody();	
		
		return match;
	}
}



//API를 받아냈으니 여기서 필요한 부분만 Select. 일단은 service에서 처리함. //
/*
List<MatchInfo> list_matchInfos = response_match.getMatchInfo();
Map<String,Object> map_matchInfo = new HashMap<String,Object>();
MatchInfo matchInfo = list_matchInfos.get(0);
matchInfo.getNickname();
matchInfo.getAccessId();
	//

MatchDetail matchDetail = matchInfo.getMatchDetail();
matchDetail.getMatchResult();
matchDetail.getController();
matchDetail.getPossession();
		//
Shoot shoots = matchInfo.getShoot();
shoots.getGoalTotal();
		//
List<Player> list_player = matchInfo.getPlayer();

Player player = list_player.get(0);
player.getSpPosition();
player.getSpId();
player.getStatus();
			//
Status status = player.getStatus();
status.getAssist();
status.getGoal();
status.getSpRating();
*/

}