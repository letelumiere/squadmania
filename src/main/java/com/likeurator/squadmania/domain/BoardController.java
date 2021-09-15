package com.likeurator.squadmania.domain;

import java.util.List;
import java.util.Optional;

import com.likeurator.squadmania.domain.model.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping("/board") @AllArgsConstructor
public class BoardController {
    @Autowired private BoardService boardService;

    @GetMapping("/")
    public ResponseEntity<List<Board>> findAllContents(){
        return ResponseEntity.ok(boardService.findAll());
    }

    @PostMapping("/write")
    public ResponseEntity<Board> WriteContents(@RequestBody Board board){
        boardService.writeContents(board);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{board_no}")
    public ResponseEntity<Board> readContents(@PathVariable int board_no){
        return ResponseEntity.ok(boardService.findOneContentsByNo(board_no));
    }
    
    @GetMapping("/id={_id}")
    public ResponseEntity<Board> readContentsById(@PathVariable String _id){
        return ResponseEntity.ok(boardService.findOneContents(_id));
    }
    

    @GetMapping("/nickname/nickname={nickname}")
    public ResponseEntity<List<Board>> readContents(@PathVariable String nickname){
        return ResponseEntity.ok(boardService.findByNickname(nickname));
    }

    
    @DeleteMapping("/{board_no}")
    public ResponseEntity<Board> deleteContents(@PathVariable int board_no, @RequestBody Board board){
        board = boardService.findOneContentsByNo(board_no);
        boardService.deleteContents(board.get_id());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{board_no}")
    public ResponseEntity<Board> modifyContents(@PathVariable int board_no, @RequestBody Board board){
        boardService.findAndUpdateContents(board, board_no);
        return ResponseEntity.ok().build();
    }


}