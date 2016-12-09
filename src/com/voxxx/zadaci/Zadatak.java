package com.voxxx.zadaci;

import java.util.Scanner;

public class Zadatak {

	public static void odaberiZadatak(int glava, int zadatak) {

		switch (glava) {

		case 1:
			metoda1(zadatak);
			break;
		case 2:
			metoda2(zadatak);
			break;
		case 3:
			// metoda3(zadatak);
			break;
		case 4:
			// metoda4(zadatak);
			break;
		case 5:
			// metoda5(zadatak);
			break;

		}

	}

	private static void metoda1(int zadatak) {

		switch (zadatak) {

		case 1:
			zadatak11();
			break;
		case 2:
			zadatak12();
			break;
		case 3:
			zadatak13();
			break;
		case 4:
			zadatak14();
			break;
		case 5:
			zadatak15();
			break;

		}

	}

	private static void metoda2(int zadatak) {

		switch (zadatak) {

		case 1:
			zadatak21();
			break;
		case 2:
			zadatak22();
			break;
		case 3:
			zadatak23();
			break;
		case 4:
			// zadatak24();
			break;
		case 5:
			// zadatak25();
			break;

		}

	}

	// 1. OPERATORI

	// 1.1 Zadatak
	private static void zadatak11() {

		System.out.println("Zdravo svete !!!");

	}

	// 1.2 Zadatak
	private static void zadatak12() {

		System.out.print("Unesite prvi broj: ");
		Scanner in = new Scanner(System.in);

		int prviBroj = in.nextInt();

		System.out.print("Unesite drugi broj: ");
		int drugiBroj = in.nextInt();

		System.out.println("Zbir broja " + prviBroj + " i broja " + drugiBroj + " je: " + (prviBroj + drugiBroj));

		in.close();
	}

	// 1.3 Zadatak
	private static void zadatak13() {

		System.out.print("Unesite poluprecnik kruga: ");
		Scanner in = new Scanner(System.in);
		Double poluprecnik = in.nextDouble();

		System.out.println("Obim kruga sa poluprecnikom " + poluprecnik + " je:  " + (2 * Math.PI * poluprecnik)
				+ ", a povrsina tog kruga je: " + (Math.PI * Math.pow(poluprecnik, 2)));

		in.close();

	}

	// 1.4 Zadatak
	private static void zadatak14() {

		Scanner in = new Scanner(System.in);

		System.out.print("Unesite koordinatu prvog temena: ");
		Koordinata t1 = new Koordinata();
		t1.x = in.nextDouble();
		t1.y = in.nextDouble();

		System.out.print("Unesite koordinatu drugog temena: ");
		Koordinata t2 = new Koordinata();
		t2.x = in.nextDouble();
		t2.y = in.nextDouble();

		System.out.print("Unesite koordinatu treceg temena: ");
		Koordinata t3 = new Koordinata();
		t3.x = in.nextDouble();
		t3.y = in.nextDouble();

		double a = Math.sqrt(Math.pow(t2.x - t1.x, 2) + Math.pow(t2.y - t1.y, 2));
		double b = Math.sqrt(Math.pow(t3.x - t1.x, 2) + Math.pow(t3.y - t1.y, 2));
		double c = Math.sqrt(Math.pow(t2.x - t3.x, 2) + Math.pow(t2.y - t3.y, 2));

		a = 5;
		b = 8;
		c = 3;

		double s = (a + b + c) / 2;

		if (a + b > c && a + c > b && b + c > a) {

			double p = Math.sqrt(s * (s - a) * (s - b) * (s - c));

			System.out.println("Povrsina trougla je: " + p);

		} else {

			System.out.println("Unesena temena ne cine trougao!");

		}

		in.close();
	}

	private static class Koordinata {

		private double x;
		private double y;

	}

	// 1.5 Zadatak
	private static void zadatak15() {

		Scanner in = new Scanner(System.in);

		// 11
		System.out.print("Unesite broj godina: ");
		int godina = in.nextInt();
		// 4
		System.out.print("Unesite broj meseci: ");
		int mesec = in.nextInt();
		// 5
		System.out.print("Unesite broj dana: ");
		int dan = in.nextInt();
		// 5
		System.out.print("Unesite broj sati: ");
		int sat = in.nextInt();
		// 6
		System.out.print("Unesite broj minuta: ");
		int minut = in.nextInt();

		int zapakovano;

		zapakovano = godina;

		zapakovano <<= 4;
		zapakovano += mesec;

		zapakovano <<= 5;
		zapakovano += dan;

		zapakovano <<= 5;
		zapakovano += sat;

		zapakovano <<= 6;
		zapakovano += minut;

		System.out.println(zapakovano);

		System.out.println("Godina: " + (zapakovano >>> 20));
		System.out.println("Mesec: " + ((zapakovano >> 16) & 0x0f));
		System.out.println("Dan: " + ((zapakovano >> 11) & 0x1f));
		System.out.println("Sat: " + ((zapakovano >> 6) & 0x1f));
		System.out.println("Minut: " + (zapakovano & 0x3f));

		in.close();

	}

	// 2. NAREDBE

	// 2.1 Zadatak
	private static void zadatak21() {

		Scanner in = new Scanner(System.in);

		System.out.print("Unesite 3 broja: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		double min = a;

		if (b < min)
			min = b;
		if (c < min)
			min = c;

		System.out.println("Najmanji broj od ta tri broja je: " + min);

		in.close();

	}

	// 2.2 Zadatak
	private static void zadatak22() {

		Scanner in = new Scanner(System.in);

		System.out.print("Unesite 3 broja: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();

		if (a > b) {

			double pom = a;
			a = b;
			b = pom;

		}

		if (a > c) {

			double pom = a;
			a = c;
			c = pom;

		}

		if (b > c) {

			double pom = b;
			b = c;
			c = pom;

		}

		System.out.println("Uredjeni brojevi po neopadajucem poretku: " + a + " " + b + " " + c);

		in.close();

	}

	// 2.3 Zadatak
	private static void zadatak23() {

		Scanner in = new Scanner(System.in);

		System.out.print("Unesite koeficijente prve jednacine: ");
		double a1 = in.nextDouble();
		double b1 = in.nextDouble();
		double c1 = in.nextDouble();

		System.out.print("Unesite koeficijente druge jednacine: ");
		double a2 = in.nextDouble();
		double b2 = in.nextDouble();
		double c2 = in.nextDouble();

		double d = a1 * b2 - b1 * a2;
		double dx = c1 * b2 - b1 * c2;
		double dy = a1 * c2 - c1 * a2;

		double x, y;

		if (d != 0) {

			x = dx / d;
			y = dy / d;

			System.out.println("Resenja su: " + x + " " + y);

		} else if (dx == 0 && dy == 0) {

			System.out.println("NEODREDJENO!");

		} else {

			System.out.println("PROTIVRECNO");

		}

		in.close();

	}

}
