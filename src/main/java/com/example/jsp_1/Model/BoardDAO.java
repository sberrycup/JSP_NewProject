package com.example.jsp_1.Model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO extends JDBC_connect {
   public BoardDAO() {
       super();
   }

   // 전체게시글 조회
    public List<BoardDTO> boardList() {
       List<BoardDTO> boardDTOList = new ArrayList<>();

       String sql = "SELECT board_number, board_title, board_name, board_category, board_hits, board_date " +
               " FROM board ORDER BY board_number DESC ";

       try {
           preparedStatement = connection.prepareStatement(sql);
           resultSet = preparedStatement.executeQuery();

           while (resultSet.next()) {
               BoardDTO boardDTO = new BoardDTO();

               boardDTO.setBoardNumber(resultSet.getInt("board_number"));
               boardDTO.setBoardTitle(resultSet.getString("board_title"));
               boardDTO.setBoardName(resultSet.getString("board_name"));
               boardDTO.setBoardCategory(resultSet.getString("board_category"));
               boardDTO.setBoardHits(resultSet.getInt("board_hits"));
               boardDTO.setBoardDate(resultSet.getDate("board_date"));

               boardDTOList.add(boardDTO);
           }
       }
       catch (SQLException e) {
           System.out.println("전체게시글 조회오류");
           e.printStackTrace();
       }

       return boardDTOList;
    }
}
