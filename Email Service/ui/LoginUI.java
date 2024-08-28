package kr.ac.kopo.ui;

import kr.ac.kopo.MailUI.MailMainUI;
import kr.ac.kopo.vo.MemberVO;

public class LoginUI extends BaseUI {
	
		@Override
		public void execute() throws Exception {

			System.out.println("------------------ �� �α��� ȭ�� �� ------------------");
			System.out.println();
			String ID = scanStr("���̵� �Է��ϼ��� : ");
			String PW = scanStr("��й�ȣ�� �Է��ϼ��� : ");

			
			MemberVO member = service.login(ID, PW);
			if(member != null) {
				System.out.println("�α��� ����");
				new MailMainUI().execute();
			} else {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ�����ּ��� ��__��");
			}
		}
}