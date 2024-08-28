package kr.ac.kopo.MailUI;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.vo.MailVO;

public class WriteMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String Receiver = scanStr(" �� �޴� ����� �Է����ּ��� : ");
		String Sender = scanStr(" �� ������ ����� �Է����ּ��� : ");
		String Title = scanStr(" �� ������ �Է����ּ��� : ");
		String Content = scanStr(" �� ������ �Է����ּ��� : ");

		MailVO mail = new MailVO();
		mail.setReceiver(Receiver);
		mail.setSender(Sender);
		mail.setTitle(Title);
		mail.setContent(Content);
		
		mailservice.Remail(mail);


		System.out.println("[" + Receiver + "] �Կ��� ���� ���� �Ϸ� \\���ѤѤ�//");
	}
}
