package task7;

import java.util.ArrayList;

public class PrimeNumbers {

	private static PrimeNumbers instance = null;

	private ArrayList<Integer> primes;

	private PrimeNumbers() {
		// TODO implement prime numbers
		primes = new ArrayList<Integer>();
	}

	public static PrimeNumbers getInstance() {
		if (instance == null) {
			instance = new PrimeNumbers();
		}
		return instance;
	}

	public int getFirstAfter(int number) {
		return 0;
	}
	
	public int get(int index) {
		
	}
	
	private int nextPrime() {
		
	}

}
