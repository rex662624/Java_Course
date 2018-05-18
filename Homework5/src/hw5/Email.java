package hw5;

public class Email extends Document {
	private String sender;
	private String recipient;
	private String title;

	public String toString() {
		return "From: " + sender + "\nTo: " + recipient + "\nTitle: " + title + "\n" + text;
	}

	public void setSender(String string_a) {
		sender = string_a;
	}

	public String getSender() {
		return sender;
	}

	public void setRecipient(String string_a) {
		recipient = string_a;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setTitle(String string_a) {
		title = string_a;
	}

	public String getTitle() {
		return title;
	}

}
