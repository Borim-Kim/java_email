package kr.ac.kopo.MailUI;

import java.util.List;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.vo.MailVO;

public class ReceiverMailUI extends BaseUI {

	public void execute() throws Exception {

		List<MailVO> list = mailservice.ReceiveMail();

		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t \t \t ♬ 받은 메일함 서비스입니다 ♪ ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("보낸사람\t제목           \t\t내용");
		System.out.println("-----------------------------------------------------------------------");
		
            if (list.isEmpty()) {
                System.out.println("메일이 존재하지 않습니다 ㅜ--ㅜ");
            } else {
                for (MailVO mail : list) {
                    System.out.println(mail.getSender() + "\t\t" + mail.getTitle() + "\t\t" + mail.getContent());
                }
            }
            System.out.println("----------------------------------------------------------------------");
        }
}
