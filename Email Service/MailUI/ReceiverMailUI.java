package kr.ac.kopo.MailUI;

import java.util.List;

import kr.ac.kopo.ui.BaseUI;
import kr.ac.kopo.vo.MailVO;

public class ReceiverMailUI extends BaseUI {

	public void execute() throws Exception {

		List<MailVO> list = mailservice.ReceiveMail();

		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t \t \t �� ���� ������ �����Դϴ� �� ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("�������\t����           \t\t����");
		System.out.println("-----------------------------------------------------------------------");
		
            if (list.isEmpty()) {
                System.out.println("������ �������� �ʽ��ϴ� ��--��");
            } else {
                for (MailVO mail : list) {
                    System.out.println(mail.getSender() + "\t\t" + mail.getTitle() + "\t\t" + mail.getContent());
                }
            }
            System.out.println("----------------------------------------------------------------------");
        }
}
