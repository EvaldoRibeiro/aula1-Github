package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product_[] vect = new Product_[n];
		
		for (int i=0; i< vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product_(nome, preco);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPreco();
		}
		
		double avg = sum /vect.length;
		
		System.out.printf("Altura Media: %.2f%n", avg);
		
		sc.close();
	}

}
