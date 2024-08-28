package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.MailService;
import kr.ac.kopo.service.MailServiceFactory;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.service.MemberServiceFactory;

public abstract class BaseUI implements IBoardUI {

	private Scanner sc;

	protected MemberService service;
	protected MailService mailservice;

	public BaseUI() {
		sc = new Scanner(System.in);
		//service = new BoardService();
		service = MemberServiceFactory.getInstance();
		mailservice=MailServiceFactory.getInstance();
	}

	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}

	protected int scanInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());

	}

}
