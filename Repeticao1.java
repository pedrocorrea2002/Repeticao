import java.util.Scanner;


public class Repeticao1 {
		public static void main(String[] args){
			
		Scanner code = new Scanner(System.in);	
			
		int N=0,valor=0;
		
		do{
		System.out.println("Digite um número");
		{while(valor == 0){	
			try{
			 valor = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		if (valor>0){
			System.out.println("Valor Positivo");}
		else{
			System.out.println("Valor Negativo");
		}
			N++;
			valor=0;
		}
		}while(N!=10);
		
}}
