import java.io.*;
import java.util.*;
public class Cropsubsidy {
	public int landarea = 10;
	public void showInfo() {
		System.out.println("This is Crop subsidy");
		System.out.println("Minimum land area : 10 acre");
		System.out.println("Available on : crop loans, crop medicines etc");
		System.out.println("Money : 1 lakh");
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
