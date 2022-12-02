import java.util.*;
public class Terceiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		final int TAM = 10;
		int pares=0,i, a [] = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println((i+1)+"° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		for (i=0;i<TAM;i++) {
		if(a[i] % 2==0) {
			pares = pares+1;
			System.out.print(a[i]+ " ");
		}
		}
		System.out.println("\n");
		System.out.println("A soma dos elementos pares resultou em: "+pares);
	}

}
