
import java.util.Scanner;
public class pesquisaBusca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b=0, i, j, r=0;
		final int TAM = 10;
		a = new int [TAM];
		
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o número:");
			a[i] = in.nextInt();
		}
		
		System.out.println(" ");
		
		
		for(j=0; j<TAM; j++) {
			System.out.println("Insira o número que queira buscar:");
			b = in.nextInt();
			
			
			for(i=0, j=0; i<TAM; i++, j++) {
				if(a[i]==b) {
					r = 1;
				}
			}
		}
		
		System.out.println(" ");
		
		if(r==1) {
			
			System.out.println(""+b+" está dentro do vetor.");
			
		}else{
			
			System.out.println(""+b+" não está dentro do vetor.");
		}
	}
}