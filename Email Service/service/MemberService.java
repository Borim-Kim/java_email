package kr.ac.kopo.service;

import kr.ac.kopo.dao.MemberDAO;
import kr.ac.kopo.vo.MemberVO;

public class MemberService {
	private MemberDAO dao;

	public MemberService() {
		dao = new MemberDAO();
	}

	public void addMember(MemberVO member) {
		dao.insert(member);
	}

	public MemberVO login(String ID, String PW) {
		MemberVO member = dao.select(ID, PW);
		return member;
	}

	public MemberVO SearchID(MemberVO member) {
		MemberVO searchID = dao.SearchID(member);
		return searchID;

	}

	public MemberVO SearchPW(MemberVO member) {
		MemberVO searchPW = dao.SearchPW(member);
		return searchPW;
	}

}

