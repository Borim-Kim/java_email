package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class SearchIDUI extends BaseUI {
	
		@Override
		public void execute() throws Exception {

			System.out.println("------------------ �� ���̵� ã�� ȭ�� �� ------------------");
			System.out.println();
			String NM = scanStr("�̸��� �Է��ϼ��� : ");
			int BD = scanInt("��������� �Է��ϼ��� : ");

			MemberVO member = new MemberVO(NM, BD);
			MemberVO searchid = new MemberVO();
			searchid = service.SearchID(member);
			
			if(searchid != null) {
				System.out.println("����� ���̵�� " + searchid.getID() + " �Դϴ�.");
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ٤̤Ѥ� �� �� �� Ȯ�� ��Ź����� ");
			}
		}
}