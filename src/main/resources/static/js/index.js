'USE STRICT';

const DivSearch = document.querySelector('.search-Div');
const searchBtn = document.querySelector('.search-btn');
const searchInput = document.querySelector('.search-input');
const searchUl = document.querySelector('.search-ul');
const temp = document.querySelector('.temp');
const searchLi = searchUl.querySelectorAll('li');

//FifaonAPI-Functions와 결부하여 로직 정리 필요.


searchBtn.addEventListener('click', () => {
    if(searchUl.hasChildNodes()){
        searchUl.innerHTML='';
    }
    getUserInfo(searchInput.value);
    searchInput.value='';
});

temp.addEventListener('click', ()=>{
    getPlayer('데이비드 베컴');
});


/*
temp.addEventListener('click', ()=>{
    getMatchDetail('5d7cac52733bc1e5feac44b2');
});

const a = new FifaonAPI();
*/
