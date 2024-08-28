package kr.ac.kopo.service;

public class MailServiceFactory {

	private static MailService service;
	
	public static MailService getInstance() {
		if(service == null) {
			service = new MailService();
		}
		return service;
	} 
}
