package labb2;

import java.util.Random;

public class Logik{
	
	private int randomNumber;
	
	public void setRad() {
	Random rand = new Random();
	int upperbound = 36;
	for(int i = 0; i<7; i++) {
	int randomNumber = rand.nextInt(upperbound);
	System.out.println(randomNumber);
	
	
	}
	
	

	}
	

	public int getRad() {
		return randomNumber;
	}

	public static void main (String [] args) {
		Logik l = new Logik();
		System.out.println(l.getRad());
	}
}
