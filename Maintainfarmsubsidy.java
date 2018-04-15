import java.io.*;
import java.util.*;
public class Maintainfarmsubsidy {
	public int landarea = 15;
	public void showInfo() {
		System.out.println("This is Maintain farm subsidy");
		System.out.println("Minimum land area : 15 acre");
		System.out.println("Available on : wire fancing, tractor  etc");
		System.out.println("Money : 1.5 lakh");
		System.out.println("...........!!!!!!!!!!!!..........");
		System.out.println("");
	}
	public boolean check(int la) {
		if(la >= landarea) {
			return true;
		}
		else {
			return false;
		}
	}
}
