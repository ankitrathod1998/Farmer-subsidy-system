import java.io.*;
import java.util.*;
public class Subsidy {
	public void showsubsidy(){
		System.out.println("Press 1 : Water subsidy ");
		System.out.println("Press 2 : Maintain Farm subsidy ");
		System.out.println("Press 3 : Crop subsidy ");
		System.out.println("Press 4 : Infrastructure subsidy ");
		System.out.println("Press 0 : to go back ");
		System.out.println("...........!!!!!!!!!!!!..........");
		System.out.println("");
	}
	public void subsidytype(int i) {
		switch(i) {
			case 1:
				Watersubsidy w = new Watersubsidy();
				w.showInfo();
			break;
			case 2:
				Maintainfarmsubsidy m = new Maintainfarmsubsidy();
				m.showInfo();
			break;
			case 3:
				Cropsubsidy c = new Cropsubsidy();
				c.showInfo();
			break;
			case 4:
				Infrastructuresubsidy inf = new Infrastructuresubsidy();
				inf.showInfo();
			break;
		}
	}
	public boolean checkavailability(String subsidy, int landarea) {
		switch(subsidy) {
		case "Watersubsidy":
			Watersubsidy w = new Watersubsidy();
			if(w.check(landarea)) {
				return true;
			}
			else {
				return false;
			}
		case "Maintainfarmsubsidy":
			Maintainfarmsubsidy m = new Maintainfarmsubsidy();
			if(m.check(landarea)) {
				return true;
			}
			else {
				return false;
			}
		case "Infrastructuresubsidy":
			Cropsubsidy c = new Cropsubsidy();
			if(c.check(landarea)) {
				return true;
			}
			else {
				return false;
			}
		case "Cropsubsidy":
			Infrastructuresubsidy inf = new Infrastructuresubsidy();
			if(inf.check(landarea)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
