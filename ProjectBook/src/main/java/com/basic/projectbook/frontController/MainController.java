package com.basic.projectbook.frontController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basic.projectbook.dao.MemberDAO;
import com.basic.projectbook.vo.Member;

public class MainController implements Controller{

	@Override
	public String service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Member> list = MemberDAO.getInstance().getAllMember();
		System.out.println(list);
		request.setAttribute("list", list);
		
		int x = MemberDAO.getInstance().testnum();
		request.setAttribute("x", x);
		
		
		return "main";
		
		
		
	}

}
