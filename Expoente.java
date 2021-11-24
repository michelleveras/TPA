import java.util.Scanner;
public class Expoente {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a[], i=0, ii, rest;
		final int TAM =11;
		a= new  int [TAM];
		
		for(i=0; i<10 ; i++) {
			 rest = 1;
			  System.out.println("Insira  o expoente:");
			  a[i]= input.nextInt();
			  for(ii=0; ii<a[i];ii++) {
			  rest = (2*rest);
		}
			  System.out.println(" 2 elevado a" +(i+1)+"= "+rest+"\n");
	}
	
 }
}
