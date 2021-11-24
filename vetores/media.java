package vetores;

import   java.util.Scanner ;
public  class  media {
	public  static  void  main ( String [] args ) {
		Scanner in = new Scanner(System.in);
		int a [], media = 0 , i;
	
		a =  new  int [ 10 ];
		
		for (i = 0 ; i < 10 ; i ++ ) {
			System.out.println("Digite o valor do vetor A");
			a [i] = in . nextInt ();
			media = media + a [i];
			
		}	
		media = media / 10 ;
		
		System.out.println("A média é igual a: " + media);
		
	}

}
