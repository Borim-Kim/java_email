package kr.ac.kopo.MailUI;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.ui.BoardUI;

public class LogoutUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.out.println("\t �̸��� ���񽺸� �����մϴ�. �̿����ּż� �����մϴ� ");
		System.out.println("----------------- ���� ȭ������ ���ư��ϴ�. ------------------- ");
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		BoardUI mainUI = new BoardUI(); 
		mainUI.execute();
	}

}
