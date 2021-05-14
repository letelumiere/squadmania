package com.likeurator.squadmania.game_app.fifaon4;

import java.util.List;

import com.likeurator.squadmania.game_app.fifaon4.model.PlayerDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/fifaonline4")
@AllArgsConstructor
public class Fifaon4RestController {

    @Autowired
    private Fifaon4Service fifaonService;

    @RequestMapping(value = "/findAll")
    public List<PlayerDTO> findAll(){
        return fifaonService.findAll();
    }

    @RequestMapping(value = "/findAllWtihPageble")
    public List<PlayerDTO> findAllWithPageable(){
        return fifaonService.findAllWithPageable();
    }

    @RequestMapping(value = "/findAllByNames")
    public List<PlayerDTO> findAllByNames(String name){
        name = "데이비드 시먼";
        return fifaonService.findByAllNames(name);
    }
}
