import java.util.Scanner;
public class NumPrimo{

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n=0 ,rest=0, i=1 ,a[],j;
		a= new int[5];
		
		// lendo  cada elemento do vetor  e verificando  se é primo
		
		for (j=0; j<5; j++) {
			rest=0; 
			
			//lendo o numero
			System.out.println("Digite o numero a ser analisado");
			a[j] = in.nextInt();
			
			for (i=1; i<=a[j]; i++) {
				
				if (a[j]%i==0) {
					rest++;
				}
			}
			//verificando se é primo ou não pelo resto
			if(rest>2) {
				System.out.println("não é primo");
			} else {
				System.out.println("é primo");
			}
		}
	}

}