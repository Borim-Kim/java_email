package kr.ac.kopo.ui;

public class DeleteUI extends BaseUI {

	public void execute() throws Exception {
		
		int no = scanInt("삭제할 게시물 번호를 입력 : ");
		
		System.out.println("[" + no + "]" );
	}
}
