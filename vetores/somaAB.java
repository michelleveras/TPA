package vetores;

import  java.util.Scanner ;
public  class  somaAB {
	public  static  void  main ( String [] args ) {
		Scanner in = new Scanner(System.in);
		final  int  TAM  =  10 ;
		int i, a [], b [], c [];
		a =  new  int [ TAM ];
		b =  new  int [ TAM ];
		c =  new  int [ TAM ];
		
		for (i = 0 ; i < TAM ; i ++ ) {
			System.out.println ("Digite o valor do vetor A");
			a [i] = in . nextInt ();
		}	
		for (i = 0 ; i < TAM ; i ++ ) {
			System.out.println ("Digite o valor do vetor B");
			b [i] = in . nextInt ();
			c [i] = a [i] + b [i];
		}
		System.out.println ("C = ");
		for (i = 0 ; i < TAM ; i ++ ) {
			System.out.println (c [i] + " ");
		}

	}

}