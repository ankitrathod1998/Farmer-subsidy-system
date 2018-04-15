import java.io.*;
import java.util.*;
public class Farmer {
	Scanner in = new Scanner(System.in);
	public void showMethods(){
		System.out.println("Press 1 : view subsidy");
		System.out.println("Press 2 : view nearby help center");
		System.out.println("Press 3 : application of subsidy");
		System.out.println("Press 4 : Feedback press 4");
		System.out.println("press 0 : Logout");
		System.out.println("...........!!!!!!!!!!!!..........");
		System.out.println("");
	}
	public void selectMethod(int i){
		switch(i) {
			case 1: 
				while(true) {
					Subsidy s = new Subsidy();
					s.showsubsidy();
					int tp;
					tp = in.nextInt();
					if(tp == 0) {
						break;
					}
					s.subsidytype(tp);
				}
			break; 
			case 2:
				Helpcenter h = new Helpcenter();
				System.out.println("Enter your village : .............");
				String village = in.next();
				h.nearbyhelpcenter(village);
			break;
			case 3:
				System.out.println("..........Now you have to fill the form........,");
				System.out.println("Enter your name : ........");
				String name = in.next();
				System.out.println("Enter your land area : .........");
				int landarea = in.nextInt();
				System.out.println("Enter your mobile no :........... ");
				String mono = in.next();
				System.out.println("Enter your subsidy choise: ...........");
				String subsidy = in.next();
				Government g = new Government();
				System.out.println(".........Thank you for providing details...........");
				System.out.println("...........!!!!!!!!!!!!..........");
  				System.out.println("");
				g.responseofappl(name, landarea,mono,subsidy);
			break;
			case 4:
				Feedback f = new Feedback();
				f.question();
			break;
		}
	}
}
