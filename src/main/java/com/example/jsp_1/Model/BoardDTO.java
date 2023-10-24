package com.example.jsp_1.Model;

import java.sql.Date;

public class BoardDTO {
    private int boardNumber;
    private String boardTitle;
    private String boardId;
    private String boardName;
    private String boardCategory;
    private String boardContent;
    private Date boardDate;
    private Date boardEditdate;
    private int boardHits;

    public int getBoardNumber() {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber) {
        this.boardNumber = boardNumber;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardCategory() {
        return boardCategory;
    }

    public void setBoardCategory(String boardCategory) {
        this.boardCategory = boardCategory;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public Date getBoardDate() {
        return boardDate;
    }

    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }

    public Date getBoardEditdate() {
        return boardEditdate;
    }

    public void setBoardEditdate(Date boardEditdate) {
        this.boardEditdate = boardEditdate;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }
}
