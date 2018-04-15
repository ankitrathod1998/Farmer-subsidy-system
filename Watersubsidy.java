import java.io.*;
import java.util.*;
public class Watersubsidy {
	public int landarea = 10;
	public void showInfo() {
		System.out.println("This is water subsidy");
		System.out.println("Minimum land area : 10 acre");
		System.out.println("Available on : Water pump, build tank, etc");
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
