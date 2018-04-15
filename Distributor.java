import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Distributor {
	public void showMethods(){
		System.out.println("For feedback press 1");
		System.out.println("For logout press 0");
		System.out.println("...........!!!!!!!!!!!!..........");
		System.out.println("");
	} 
	public void selectMethod(int i){
		switch(i) {
			case 1:
				Feedback f = new Feedback();
				f.question();
			break;
		}
	}
}
