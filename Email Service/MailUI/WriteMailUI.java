package kr.ac.kopo.MailUI;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.vo.MailVO;

public class WriteMailUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		String Receiver = scanStr(" ♣ 받는 사람을 입력해주세용 : ");
		String Sender = scanStr(" ♧ 보내는 사람을 입력해주세용 : ");
		String Title = scanStr(" ♣ 제목을 입력해주세용 : ");
		String Content = scanStr(" ♧ 내용을 입력해주세용 : ");

		MailVO mail = new MailVO();
		mail.setReceiver(Receiver);
		mail.setSender(Sender);
		mail.setTitle(Title);
		mail.setContent(Content);
		
		mailservice.Remail(mail);


		System.out.println("[" + Receiver + "] 님에게 메일 전송 완료 \\ㅎㅡㅡㅎ//");
	}
}
