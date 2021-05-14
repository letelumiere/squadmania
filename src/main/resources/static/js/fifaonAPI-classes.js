'USE STRICT';

// Nexon의 Dev
class Users {
    constructor(accessId, nickname, level){
        this.accessId = accessId;
        this.nickname = nickname;
        this.level = level;
    }

    get accessId(){
        return this._accessId;
    }
    set accessId(value){
        this._accessId = value;
    }

    get nickname(){
        return this._nickname;
    }
    set nickname(value){
        this._nickname = value;
    }

    get level(){
        return this._level;
    }
    set level(value){
        this._level = value;
    }

    getUsers(){
        return this._accessId, this._nickname, this._level;
    }
}