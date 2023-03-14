package kr.basic.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.basic.frontcontroller.Controller;
import kr.basic.model.MemberDAO;
import kr.basic.model.MemberVO;

public class MainController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List <MemberVO> list=MemberDAO.getInstance().getMemberList();
		System.out.println("listsize:"+list.size());
		request.setAttribute("list", list);
		return "main";
	}

}
