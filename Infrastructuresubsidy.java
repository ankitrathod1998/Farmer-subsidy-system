import java.io.*;
import java.util.*;
public class Infrastructuresubsidy {
	public int landarea = 12;
	public void showInfo() {
		System.out.println("This is Infrastructure subsidy");
		System.out.println("Minimum land area : 12 acre");
		System.out.println("Available on : Greenhouse, etc");
		System.out.println("Money : 2 lakh");
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
