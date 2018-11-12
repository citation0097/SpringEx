package com.kimhank.board.dao;

import java.util.ArrayList;

import com.kimhank.board.dto.BoardDto;

public interface IDao {
	public ArrayList<BoardDto> listBoard();
	public void  writeBoard(String mWriter, String mContent);
	public BoardDto  viewBoard(String mid);
	public void deleteBoard(String mId);
}
