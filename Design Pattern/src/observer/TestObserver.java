package observer;

import java.util.ArrayList;

public class TestObserver {

	public static void main(String[] args) {

		Subject subject = new CommentaryObject(new ArrayList<Observer>(),
				"BasketBall Match [2024 JUNE NBA Finals between Dallas vs Bosten]");
		Observer observer = new SMSUser(subject, "Sagar [Mysore Karnataka]");
		observer.subscribe();
		System.out.println();

		Observer observer2 = new SMSUser(subject, "Vidya Bushan [Gaziyabad New Delhi]");
		observer2.subscribe();
		System.out.println();

		Commentary cObject = ((Commentary) subject);
		cObject.setDesc("Welcome to the game 1 NBA finals");
		cObject.setDesc("kyrie and luka magic..");
		cObject.setDesc("after completing 2nd quarter score is 68-38");
		System.out.println();
		
		Observer observer3 = new SMSUser(subject, "Ankit dubay [Kanpur Uttarpradesh]");
		observer3.subscribe();
		
		cObject.setDesc("Complete Domination by Mavericks");
		cObject.setDesc("final score is 108-84");
		System.out.println();
		
		observer2.unSubscribe();
		
		cObject.setDesc("Stay stunned for 2024 Paris Olympics");
		
	}

}
