package kr.ac.kopo.MailUI;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.ui.BoardUI;

public class LogoutUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.out.println("\t 이메일 서비스를 종료합니다. 이용해주셔서 감사합니다 ");
		System.out.println("----------------- 메인 화면으로 돌아갑니다. ------------------- ");
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		BoardUI mainUI = new BoardUI(); 
		mainUI.execute();
	}

}
