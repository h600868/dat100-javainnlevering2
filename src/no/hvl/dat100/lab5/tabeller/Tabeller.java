package no.hvl.dat100.lab5.tabeller;

import java.lang.Integer;

public class Tabeller {

	
	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println();
		for (int i = 0; i < tabell.length; i++) {
			
			int tall = tabell[i];
			System.out.print(tall + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
				
		System.out.print("[");
		
		for (int i = 0; i < tabell.length; i++) {
		
		int num = tabell[i];
		
        String tall = Integer.toString(num);
        System.out.print(tall);
        if (i < tabell.length - 1) {
        	System.out.print(",");
        } else {	
        }
		}
        System.out.print("]");
        return null;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;	
		
		for (int i = 0; i < tabell.length; i++) {
			int tall = tabell[i];
			sum = sum + tall;
			
		}
		return sum;
	}	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int i = 0;
		boolean funnet = false;
		
		while (!funnet && i < tabell.length) {
			if (tall == tabell[i]) {
				funnet = true;
			}
			i++;
		}
		
		return funnet;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int indeks = 0;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				System.out.println(i);
				indeks = i;
				
			} else {
			}
			
		}
		return indeks;
}

	// f) 6, 4, 1  til 1, 4, 6
	public static int[] reverser(int[] tabell) {
		 	int [] rev;
		 	rev = new int [tabell.length];
		 	
		    for(int i = 0; i < tabell.length; i++) {
            int j = tabell[i];
            tabell[i] = tabell[tabell.length - i - 1];
            rev[tabell.length - i - 1] = j;
            
	        }  
		return rev;
	    }  

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 1;
		
		while (sortert && i < tabell.length - 1) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			}
			i++;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] res = new int[tabell1.length+tabell2.length];
        int i = 0;
        for(int a = 0; a<tabell1.length; a++) {
            res[a] = tabell1[a];
            i++;
        }
        for(int b = 0; b<tabell2.length; b++) {
            res[i++] = tabell2[b];
        }
		return res;
		
	}
}
