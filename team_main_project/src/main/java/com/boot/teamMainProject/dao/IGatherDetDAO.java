
package com.boot.teamMainProject.dao;

import java.util.ArrayList;

import com.boot.teamMainProject.model.GatherDetVO;
import com.boot.teamMainProject.model.MemberVO;

public interface IGatherDetDAO {
	String gatdetLoad(int gatDetNo);
	GatherDetVO detailViewBoard(int gatDetNo);
	void insertGatherDet(GatherDetVO gat);
	MemberVO MoveinsertGather(String memNick);
	
	// 서연-소모임게시판 전체화면
	ArrayList<GatherDetVO> gatcommulist(int gatNo);
}