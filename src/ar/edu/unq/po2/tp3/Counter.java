package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numbers;
	
	public Counter() {
		numbers = new ArrayList<>();
	}
	
	public int cantidadPares() {
		int count = 0;
				
		for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
		
		return count;
	}
	
	public int cantidadImpares() {
		int count = 0;
		
		for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
		
		return count;
	}
	
	public int cantidadMultiplos(int num) {
		return 0;
	}
	
	public void addNumber(int number) {
		numbers.add(number);
	}
}
