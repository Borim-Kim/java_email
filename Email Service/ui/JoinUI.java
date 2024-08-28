package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("-------------------- ♬ 회원가입 페이지입니다 ♪ --------------------");
		System.out.println();
		String NM = scanStr(" 이름을 입력하세요 : ");
		int BD = scanInt(" 생년월일 8자리를 입력하세요 : ");
		int PN = scanInt(" 휴대전화번호를 입력하세요 : ");
		String ID = scanStr(" 새로운 아이디를 입력하세요 : ");
		String PW = scanStr(" 새로운 비밀번호를 입력하세요 : ");
		String PW2 = scanStr(" 비밀번호를 한 번 더 입력하세요 : ");
		System.out.println();
		System.out.println("-------------------- ♬ 회원가입 페이지입니다 ♪ --------------------");
		
		while (!PW.equals(PW2)) {
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
			System.out.println();
			PW = scanStr("비밀번호를 입력하세요 : ");
			PW2 = scanStr("비밀번호를 한 번 더 입력하세요 : ");
			System.out.println();
		}
		
		MemberVO member = new MemberVO();
		member.setNM(NM);
		member.setBD(BD);
		member.setPN(PN);
		member.setID(ID);
		member.setPW(PW);
		
		service.addMember(member);
		
		System.out.println("-------------------- ♬ 회원가입이 완료되었습니당 ♪ --------------------");
	}

}

