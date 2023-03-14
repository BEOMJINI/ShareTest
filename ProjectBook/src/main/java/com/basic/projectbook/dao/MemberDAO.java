package com.basic.projectbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.basic.projectbook.util.MybatisConfig;
import com.basic.projectbook.vo.Member;

public class MemberDAO {
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public List<Member> getAllMember() {
		SqlSession session = MybatisConfig.getInstance().openSession(true);
		List<Member> list = session.selectList("mapper.member.getAllMember");
		session.close();
		return list;
	}
	
	public Member getOneMember(String id) {
		SqlSession session = MybatisConfig.getInstance().openSession(true);
		Member vo = session.selectOne("mapper.member.getOneMember", id);
		return vo;
	}
	
	public int testnum() {
		int x =3 ;
		return x;
	}
	
}
