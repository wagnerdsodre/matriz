package Application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o valor de linhas");
		int m = sc.nextInt();
		System.out.println("digite o valor de colunas");
		int n = sc.nextInt();
		
		int [][] mat = new int [m][n];
		
		for(int i =0 ; i<mat.length; i++) {
			for(int j=0; j < mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
	
		
		
		
		
		
	char s = 's';
	do {
		
		System.out.println("Search number");
		int number = sc.nextInt();
			
			
			int count = 0;
			for(int i =0 ; i< mat.length; i++) {
				for(int j=0 ;j<mat[i].length; j++) {
					
					
					
						if(mat[i][j]==number) {
							count++;
							//System.out.println("position: "+i+","+j);
						}
				
					
					
					
					
					
					
					
					}
				}
			
			
			System.out.println("Numbers:"+count);
		
		
		
			System.out.println("Deseja continuar");
		   s = sc.next().charAt(0);
		
		
	}while(s =='s');
		
	
		
		
		
		
		
		
		sc.close();

	}

}
