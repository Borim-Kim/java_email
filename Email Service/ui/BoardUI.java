package kr.ac.kopo.ui;

public class BoardUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("-------------------- �� ���Ͻô� ���񽺸� �������ּ��� �� --------------------");
		System.out.println();
		System.out.println("1. �α���");
		System.out.println("2. ���̵� ã�� ���� ");
		System.out.println("3. ��й�ȣ ã�� ����");
		System.out.println("4. ȸ������ ����");
		System.out.println("5. ���α׷� ����");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		int type = scanInt("�׸��� �����ϼ��� : ");
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
				System.out.println("�߸� �����ϼ̽��ϴ� �̤ѤѤ� �׸��� �ٽ� �������ּ���");
			}
		}
	}
}
