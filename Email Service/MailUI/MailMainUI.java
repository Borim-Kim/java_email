package kr.ac.kopo.MailUI;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.ui.IBoardUI;

public class MailMainUI extends BaseUI {
	
	private int MailMenu() {
		System.out.println("-------------------- ♬ 원하시는 서비스를 선택해주세용 ♪ --------------------");
		System.out.println();
		System.out.println("1. 메일쓰기");
		System.out.println("2. 받은 메일함 ");
		System.out.println("3. 보낸 메일함");
		System.out.println("4. 로그아웃");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while (true) {
			
			IBoardUI ui = null;
			
			int type = MailMenu();
			
			switch (type) {
			case 1:
				ui = new WriteMailUI();
				break;
			case 2:
				ui = new ReceiverMailUI();
				break;
			case 3:
				ui = new SendMailUI();
				break;
			case 4:
				ui = new LogoutUI();
				break;

			}
			
			if(ui != null) {
				ui.execute();
				
			} else {
				System.out.println("---------- ♬ 잘못 선택하셨습니다 항목을 다시 선택해주세요 ♪ ----------");
			}
		}
	}
}
