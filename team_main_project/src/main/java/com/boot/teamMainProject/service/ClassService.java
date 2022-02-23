package com.boot.teamMainProject.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.boot.teamMainProject.dao.IClassDAO;
import com.boot.teamMainProject.model.ClassVO;

@Service
public class ClassService implements IClassService {
   
   @Autowired
   @Qualifier("IClassDAO")
   IClassDAO dao;

   @Override
   public ArrayList<ClassVO> listAllClassBest() {
      return dao.listAllClassBest();
   }
   
   @Override
   public ArrayList<ClassVO> listAllClassNew() {
      return dao.listAllClassNew();
   }
   
// 모임 검색
	@Override
	public ArrayList<ClassVO> classSearch(HashMap<String, Object> map){
		return dao.classSearch(map);
	}


   
   // 서연
   @Override
   public ArrayList<ClassVO> listClass(String hobbyNo) {
	   return dao.listClass(hobbyNo);
   }

	public ArrayList<ClassVO> listall() {
		return dao.listall();
	}

	public ArrayList<ClassVO> listClassdatemax(String hobbyNo) {
		return dao.listClassdatemax(hobbyNo);
	}

	public ArrayList<ClassVO> listalldatemax() {
		return dao.listalldatemax();
	}
   

}

