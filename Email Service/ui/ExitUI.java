package kr.ac.kopo.ui;

public class ExitUI extends BaseUI {

	@Override
	public void execute() throws Exception {
		
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.out.println("\t 이메일 서비스를 종료합니다. 안녕히 계세용 ~..~ ");
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.exit(0);
	}

}
