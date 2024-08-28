package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.MailDAO;
import kr.ac.kopo.vo.MailVO;

public class MailService {
	private MailDAO maildao;

	public MailService() {
		maildao = new MailDAO();
	}

	public void ReceiveMail(MailVO mail) {
		maildao = new MailDAO();
	}

	public List<MailVO> ReceiveMail() {
		return maildao.ReceiverMail();
	}

	public void Remail(MailVO mail) {
		maildao.insert(mail);
	}
	
	public List<MailVO> sendmail() {
		return maildao.sendmail();
	}
}
