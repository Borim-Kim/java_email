package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class SearchIDUI extends BaseUI {
	
		@Override
		public void execute() throws Exception {

			System.out.println("------------------ ♬ 아이디 찾는 화면 ♪ ------------------");
			System.out.println();
			String NM = scanStr("이름을 입력하세요 : ");
			int BD = scanInt("생년월일을 입력하세요 : ");

			MemberVO member = new MemberVO(NM, BD);
			MemberVO searchid = new MemberVO();
			searchid = service.SearchID(member);
			
			if(searchid != null) {
				System.out.println("당신의 아이디는 " + searchid.getID() + " 입니다.");
			} else {
				System.out.println("아이디가 존재하지 않습니다ㅜㅡㅜ 한 번 더 확인 부탁드려용 ");
			}
		}
}