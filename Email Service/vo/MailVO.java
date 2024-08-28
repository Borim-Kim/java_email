package kr.ac.kopo.vo;

public class MailVO {

	private String Receiver;
	private String Sender;
	private String Title;
	private String Content;
	
	public MailVO() {
		super();
}

	public MailVO(String Receiver, String Sender, String Title, String Content) {
		super();
		this.Receiver = Receiver;
		this.Sender = Sender;
		this.Title = Title;
		this.Content = Content;
	}

	public String getReceiver() {
		return Receiver;
	}

	public void setReceiver(String Receiver) {
		this.Receiver = Receiver;
	}

	public String getSender() {
		return Sender;
	}

	public void setSender(String sender) {
		this.Sender = sender;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		this.Content = content;
	}
	@Override
	public String toString() {
		return "MailVO [Receiver= " + Receiver + ", Sender = " + Sender + ", Title + " + Title + ","
				+ " Content = " + Content + "]";

	}

	public String getID() {
		return null;
	}
}	