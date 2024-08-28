package kr.ac.kopo.MailUI;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.ui.IBoardUI;

public class MailMainUI extends BaseUI {
	
	private int MailMenu() {
		System.out.println("-------------------- �� ���Ͻô� ���񽺸� �������ּ��� �� --------------------");
		System.out.println();
		System.out.println("1. ���Ͼ���");
		System.out.println("2. ���� ������ ");
		System.out.println("3. ���� ������");
		System.out.println("4. �α׾ƿ�");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		int type = scanInt("�׸��� �����ϼ��� : ");
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
				System.out.println("---------- �� �߸� �����ϼ̽��ϴ� �׸��� �ٽ� �������ּ��� �� ----------");
			}
		}
	}
}
