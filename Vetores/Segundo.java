import java.util.*;
public class Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a [] = new int [TAM];
		int b [] = new int [TAM]; 
		for(int i=0; i<TAM;i++) {
			System.out.println((i+1)+"° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		System.out.println("VETOR A: ");
		for(int i=0; i<TAM;i++) {
			System.out.print(a[i]+ " ");
		} 
		System.out.println("\n");
		System.out.println("VETOR B: ");
		for (int i=(TAM-1); i>=0;i--) {
			b[i] = a[i];
			System.out.print(b[i]+" ");
		}
	}

}
