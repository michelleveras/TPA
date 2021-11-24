import java.util.Scanner;
public  class  quadrado {
	public  static  void  main ( String [] args ) {
		Scanner in = new Scanner(System.in);
		final  int  TAM  =  10 ;
		int i, a [], b [];
		a =  new  int [ TAM ];
		b =  new  int [ TAM ];
		
		for (i = 0 ; i < TAM ; i ++ ) {
			System.out.println( " Digite o "  + (i + 1 ) +  " º valor do vetor A " );
			a [i] = in . nextInt ();
			b [i] = a [i] * a [i];
		}	
		System.out.println ( " a = [ " );
		for (i = 0 ; i < TAM ; i ++ ) {
			System.out.println (b [i] +  "  " );
		}
		System.out.println ( " ] " );
	}
}