package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("-------------------- �� ȸ������ �������Դϴ� �� --------------------");
		System.out.println();
		String NM = scanStr(" �̸��� �Է��ϼ��� : ");
		int BD = scanInt(" ������� 8�ڸ��� �Է��ϼ��� : ");
		int PN = scanInt(" �޴���ȭ��ȣ�� �Է��ϼ��� : ");
		String ID = scanStr(" ���ο� ���̵� �Է��ϼ��� : ");
		String PW = scanStr(" ���ο� ��й�ȣ�� �Է��ϼ��� : ");
		String PW2 = scanStr(" ��й�ȣ�� �� �� �� �Է��ϼ��� : ");
		System.out.println();
		System.out.println("-------------------- �� ȸ������ �������Դϴ� �� --------------------");
		
		while (!PW.equals(PW2)) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
			System.out.println();
			PW = scanStr("��й�ȣ�� �Է��ϼ��� : ");
			PW2 = scanStr("��й�ȣ�� �� �� �� �Է��ϼ��� : ");
			System.out.println();
		}
		
		MemberVO member = new MemberVO();
		member.setNM(NM);
		member.setBD(BD);
		member.setPN(PN);
		member.setID(ID);
		member.setPW(PW);
		
		service.addMember(member);
		
		System.out.println("-------------------- �� ȸ�������� �Ϸ�Ǿ����ϴ� �� --------------------");
	}

}

