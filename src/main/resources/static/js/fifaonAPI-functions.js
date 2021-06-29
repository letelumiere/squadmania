'USE STRICT';

// REST API호출을 위한 함수 선언식 - 유저 정보 검색.
// OverLoading이 가능할까?
/*
class FifaonAPI {
    constructor(){
        this.myInit = {
            credential: 'same-origin',
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                'Authorization': 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50X2lkIjoiMTMyNjIwNzg1OCIsImF1dGhfaWQiOiIyIiwidG9rZW5fdHlwZSI6IkFjY2Vzc1Rva2VuIiwic2VydmljZV9pZCI6IjQzMDAxMTQ4MSIsIlgtQXBwLVJhdGUtTGltaXQiOiI1MDA6MTAiLCJuYmYiOjE2MTY5MDAxMjQsImV4cCI6MTYzMjQ1MjEyNCwiaWF0IjoxNjE2OTAwMTI0fQ.SRbED0xWZjbtlpv6C7PNXf2IamdZSbi9OkaWZUNZuFA'
            },
            mode: 'cors',
            cache: 'default'
        }
    }
    getUserInfo(nickname){
        return await fetch(`https://api.nexon.co.kr/fifaonline4/v1.0/users?nickname=${param.nickname}`, myInit)
                    .then(response => response.json())
                    .catch(error => console.log(error));
    }
    getMatches(){
        return await fetch(`https://api.nexon.co.kr/fifaonline4/v1.0/users/${param.accessId}/matches?matchtype=${param.matchtype}&offset=${param.offset}&limit=${param.limit}`, myInit)
                    .then(response => response.json())
                    .catch(error => console.log(error));
    }
    getMatchDetail(){
        return await fetch(`https://api.nexon.co.kr/fifaonline4/v1.0/matches/${param.matchId}`, myInit)
                    .then(response => response.json())
                    .catch(error => console.log(error));
    }

}
*/
async function getPlayer(name) {
    const param = {
        "name": name
    };
    const result = await fetch(`http://localhost:8080/fifaonline4/api/player/${name}`)
                    .then(response => response.json())
                    .catch(error => console.log(error));
    console.log(result);
}


async function getUserInfo(nickname) {
    const param = {
        "nickname": nickname,
    };
    const myInit = {
        credential: 'same-origin',
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50X2lkIjoiMTMyNjIwNzg1OCIsImF1dGhfaWQiOiIyIiwidG9rZW5fdHlwZSI6IkFjY2Vzc1Rva2VuIiwic2VydmljZV9pZCI6IjQzMDAxMTQ4MSIsIlgtQXBwLVJhdGUtTGltaXQiOiI1MDA6MTAiLCJuYmYiOjE2MTY5MDAxMjQsImV4cCI6MTYzMjQ1MjEyNCwiaWF0IjoxNjE2OTAwMTI0fQ.SRbED0xWZjbtlpv6C7PNXf2IamdZSbi9OkaWZUNZuFA'
        },
        mode: 'cors',
        cache: 'default'
    };
    const result = await fetch(`https://api.nexon.co.kr/fifaonline4/v1.0/users?nickname=${param.nickname}`, myInit)
                    .then(response => response.json())
                    .catch(error => console.log(error));
    getMatches(result.accessId);
}
// REST API호출을 위한 함수 선언식 - 유저 매치 정보(List) 검색.
// List로 출력됨.
async function getMatches(accessId){
    //해당 API호출에 필요한 parameter
    const param = {
        "accessId": accessId,
        "matchtype":50, 
        "offset":0,
        "limit":100,
    }

    //해당 API 호출에 필요한 header
    const myInit = {
        credential: 'same-origin',
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50X2lkIjoiMTMyNjIwNzg1OCIsImF1dGhfaWQiOiIyIiwidG9rZW5fdHlwZSI6IkFjY2Vzc1Rva2VuIiwic2VydmljZV9pZCI6IjQzMDAxMTQ4MSIsIlgtQXBwLVJhdGUtTGltaXQiOiI1MDA6MTAiLCJuYmYiOjE2MTY5MDAxMjQsImV4cCI6MTYzMjQ1MjEyNCwiaWF0IjoxNjE2OTAwMTI0fQ.SRbED0xWZjbtlpv6C7PNXf2IamdZSbi9OkaWZUNZuFA'
        },
        mode: 'cors',
        cache: 'default'
    }

    //fetch()를 활용한 해당 함수의 parameter를 return
    const result = await fetch(`https://api.nexon.co.kr/fifaonline4/v1.0/users/${param.accessId}/matches?matchtype=${param.matchtype}&offset=${param.offset}&limit=${param.limit}`, myInit)
                    .then(response => response.json())
                    .catch(error => console.log(error));

    for(let i=0;i<result.length;i++){        
        searchUl.insertAdjacentHTML('beforeEnd', `<li><a href='#'>${result[i]}</a></li>`);
    }
    const a = searchUl.querySelectorAll('li').item(i);
}

//특정 matchId를 parameter로 하는 상세정보 API
async function getMatchDetail(matchId){
    //해당 API호출에 필요한 parameter
    const param = {
        "matchId": matchId,
    }
    //해당 API 호출에 필요한 header
    const myInit = {
        credential: 'same-origin',
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhY2NvdW50X2lkIjoiMTMyNjIwNzg1OCIsImF1dGhfaWQiOiIyIiwidG9rZW5fdHlwZSI6IkFjY2Vzc1Rva2VuIiwic2VydmljZV9pZCI6IjQzMDAxMTQ4MSIsIlgtQXBwLVJhdGUtTGltaXQiOiI1MDA6MTAiLCJuYmYiOjE2MTY5MDAxMjQsImV4cCI6MTYzMjQ1MjEyNCwiaWF0IjoxNjE2OTAwMTI0fQ.SRbED0xWZjbtlpv6C7PNXf2IamdZSbi9OkaWZUNZuFA'
        },
        mode: 'cors',
        cache: 'default'
    }

    //fetch()를 활용한 해당 함수의 parameter를 return
    const result = await fetch(`https://api.nexon.co.kr/fifaonline4/v1.0/matches/${param.matchId}`, myInit)
                    .then(response => response.json())
                    .catch(error => console.log(error));

    console.log(result);
    temp.insertAdjacentHTML('afterEnd',`<div>${result.matchDate}</div>`);
}

/*

snippet

    let details=[];
    for(let i=0;i<result.length;i++){        
        searchUl.insertAdjacentHTML('beforeEnd', `<a href='#'>${result[i]}</a></li>`);
        const a = searchUl.querySelectorAll('li').item(i);
        details[i] = await getMatchDetail(result[i]);
    }
    console.log(details);
});

    for(let i=0;i<result.length;i++){
        searchUl.insertAdjacentHTML('beforeEnd', `<li class='search-ul-li-${i}'><a href='javascript:void(0);' onclick='getMatchDetail(${result[i]});'>${result[i]}</a></li>`);
        
        const a = searchUl.querySelectorAll('li').item(i);
        console.log(a.firstElementChild);
        a.addEventListener('click', ()=> {
            a.insertAdjacentHTML('beforeend', '<div>aa</div>');
        });

*/