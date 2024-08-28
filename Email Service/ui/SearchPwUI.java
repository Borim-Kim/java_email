package kr.ac.kopo.ui;

import kr.ac.kopo.MailUI.MailMainUI;
import kr.ac.kopo.vo.MemberVO;

public class SearchPwUI extends BaseUI {
	
		@Override
		public void execute() throws Exception {

			System.out.println("------------------ ♬ 비밀번호 찾는 화면 ♪ ------------------");
			System.out.println();
			String ID = scanStr("아이디를 입력하세요 : ");
			String NM = scanStr("이름을 입력하세요 : ");
			int BD = scanInt("생년월일을 입력하세요 : ");

			MemberVO member = new MemberVO(ID, NM, BD);
			MemberVO searchpw = new MemberVO();
			searchpw = service.SearchPW(member);
			
			if(searchpw != null) {
				System.out.println("당신의 비밀번호는 " + searchpw.getPW() + " 입니다.");
				new MailMainUI().execute();
			} else {
				System.out.println("비밀번호가 존재하지 않습니다ㅜㅡㅜ 한 번 더 확인 부탁드려용 ");
			}
		}
}