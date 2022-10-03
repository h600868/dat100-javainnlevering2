package no.hvl.dat100.lab6.matriser;

public class Matriser {
   
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		int[][] mat = matrise;

		for (int i = 0; i < mat.length; i++ ) {
			for (int j = 0; j < mat.length; j++ ) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String ut = "";
		String a = "";
		int[][] mat = matrise;
		
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat.length; j++) {
				a = Integer.toString(mat[i][j]);
				ut = ut + a + " ";
		        ut = ut+"\n";
			}
		}
		return ut;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] mat = matrise;

        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j<mat.length; j++) {
            	mat[i][j] = mat[i][j] * tall;
           }
        }
        return mat;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		int [][] mata = a;
		int [][] matb = b;
		boolean lik = false;
		
        for (int i = 0; i<mata.length; i++) {
            for (int j = 0; j<mata.length; j++) {
            	if (mata[i][j] == matb[i][j]) lik = true;
           }
            }
        return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
