package observer;

public class SMSUser implements Observer {

	private final Subject subject;
	private String desc;
	private String userInfo;

	public SMSUser(Subject subject, String userInfo) {

		super();
		if (subject == null) {
			throw new IllegalArgumentException("No Publisher found");
		}
		this.subject = subject;
		this.userInfo = userInfo;
	}

	@Override
	public void update(String desc) {
		this.desc = desc;
		display();

	}

	public void display() {
		System.out.println("["+userInfo+"]: "+desc);
	}

	@Override
	public void subscribe() {
		System.out.println("Subscribing "+userInfo+" to "+subject.subjectDetails()+"...");
		this.subject.subscribeObserver(this);
		System.out.println("Subscribed successfully.");
	}

	@Override
	public void unSubscribe() {
		System.out.println("Unsubscribing "+userInfo+" to "+subject.subjectDetails()+"...");
		this.subject.unSubscribeObserver(this);
		System.out.println("Unsubscribed successfully.");
	}

}
