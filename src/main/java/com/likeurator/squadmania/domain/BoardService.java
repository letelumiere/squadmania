package com.likeurator.squadmania.domain;

import java.util.List;
import java.util.Optional;

import com.likeurator.squadmania.domain.model.Board;
import com.likeurator.squadmania.domain.repository.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor
public class BoardService {
    @Autowired 
    private BoardRepository boardRepository;

    public List<Board> findAll(){
        return boardRepository.findAll();
    }

    public List<Board> findByTitle(String title){
        return boardRepository.findByTitle(title);
    }
    
    public List<Board> findByNickname(String nickname){
        return boardRepository.findByNickname(nickname);
    }
    
    public Board findOneContentsByNo(int board_no){
        return boardRepository.findOneContents(board_no);
    }

    public Board findOneContents(String _id){
        return boardRepository.findOneContents(_id);
    }

    public void writeContents(Board board){
        boardRepository.insert(board);
    }

    public void findAndUpdateContents(Board board, int board_no){
        Board responseBody = boardRepository.findOneContents(board_no);
        responseBody.setContents(board.getContents());
        boardRepository.save(responseBody);
    }

    public void deleteContents(String _id){
        boardRepository.deleteById(_id);
    }
}
