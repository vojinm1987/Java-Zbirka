package com.voxxx.zadaci;

import java.util.Scanner;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Unesite broj zeljene glave: ");
		Scanner in = new Scanner(System.in);
		int glava = in.nextInt();
		System.out.print("Unesite broj zeljenog zadatka: ");
		int brZadatka = in.nextInt();
		
		if (glava != 0 && brZadatka != 0) {
			
			Zadatak.odaberiZadatak(glava, brZadatka);
			
			
		}
		
		in.close();


	}

}
