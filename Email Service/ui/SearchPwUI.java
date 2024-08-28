package kr.ac.kopo.ui;

import kr.ac.kopo.MailUI.MailMainUI;
import kr.ac.kopo.vo.MemberVO;

public class SearchPwUI extends BaseUI {
	
		@Override
		public void execute() throws Exception {

			System.out.println("------------------ �� ��й�ȣ ã�� ȭ�� �� ------------------");
			System.out.println();
			String ID = scanStr("���̵� �Է��ϼ��� : ");
			String NM = scanStr("�̸��� �Է��ϼ��� : ");
			int BD = scanInt("��������� �Է��ϼ��� : ");

			MemberVO member = new MemberVO(ID, NM, BD);
			MemberVO searchpw = new MemberVO();
			searchpw = service.SearchPW(member);
			
			if(searchpw != null) {
				System.out.println("����� ��й�ȣ�� " + searchpw.getPW() + " �Դϴ�.");
				new MailMainUI().execute();
			} else {
				System.out.println("��й�ȣ�� �������� �ʽ��ϴ٤̤Ѥ� �� �� �� Ȯ�� ��Ź����� ");
			}
		}
}