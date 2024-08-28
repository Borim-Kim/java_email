package kr.ac.kopo.ui;

public class BoardUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("-------------------- ♬ 원하시는 서비스를 선택해주세용 ♪ --------------------");
		System.out.println();
		System.out.println("1. 로그인");
		System.out.println("2. 아이디 찾기 서비스 ");
		System.out.println("3. 비밀번호 찾기 서비스");
		System.out.println("4. 회원가입 서비스");
		System.out.println("5. 프로그램 종료");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while (true) {
			
			IBoardUI ui = null;
			
			int type = choiceMenu();
			
			switch (type) {
			case 1:
				ui = new LoginUI();
				break;
			case 2:
				ui = new SearchIDUI();
				break;
			case 3:
				ui = new SearchPwUI();
				break;
			case 4:
				ui = new JoinUI();
				break;
			case 5:
				ui = new ExitUI();
				break;
			}
			
			if(ui != null) {
				ui.execute();
				
			} else {
				System.out.println("잘못 선택하셨습니다 ㅜㅡㅡㅜ 항목을 다시 선택해주세요");
			}
		}
	}
}
