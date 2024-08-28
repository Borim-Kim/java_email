package kr.ac.kopo.ui;

import kr.ac.kopo.MailUI.MailMainUI;
import kr.ac.kopo.vo.MemberVO;

public class LoginUI extends BaseUI {
	
		@Override
		public void execute() throws Exception {

			System.out.println("------------------ ♬ 로그인 화면 ♪ ------------------");
			System.out.println();
			String ID = scanStr("아이디를 입력하세요 : ");
			String PW = scanStr("비밀번호를 입력하세요 : ");

			
			MemberVO member = service.login(ID, PW);
			if(member != null) {
				System.out.println("로그인 성공");
				new MailMainUI().execute();
			} else {
				System.out.println("아이디 또는 비밀번호를 확인해주세요 ㅜ__ㅜ");
			}
		}
}