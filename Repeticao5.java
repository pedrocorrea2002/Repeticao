import java.text.DecimalFormat;
import java.util.Scanner;


public class Repeticao5 {
		public static void main(String[] args){
			
		Scanner code = new Scanner(System.in);	
		DecimalFormat df =  new DecimalFormat("0.00");
		
		int N=0,valor=0,mulher=0,AlturaMaior=0,AlturaMenor=1999999999,altura=0,genero=0;
		double media=0;
		
		do{
			do{
				System.out.println("Qual o g�nero do funcion�rio?");
				System.out.println("1-Homem");
				System.out.println("2-Mulher");
				try{
					 genero = Integer.parseInt(code.nextLine());
					} catch (NumberFormatException e){
						System.out.println("S� n�meros, por favor");
					}
			}while ((genero !=1)&(genero !=2));	
			
		if (genero==1){
			System.out.println("O funcion�rio � um homem!");
		}
		else {
			System.out.println("O funcion�rio � uma mulher!");
		}
		System.out.println("Digite o salario desse funcion�rio:");
		{while(valor == 0){	
			try{
			 valor = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor!!");
			}}
		System.out.println("O funcion�rio recebe R$"+df.format(valor)+" de sal�rio!");
		
		System.out.println("Digite a altura(cm) desse funcion�rio:");
		{while(altura == 0){	
			try{
			 altura = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, par favor!!");
			}}}
		System.out.println("O funcion�rio tem "+altura+" cm de altura!");
		
		if (AlturaMaior<altura){
		AlturaMaior=altura;
		}
		if(AlturaMenor>altura){
			AlturaMenor=altura;
			}
		if ((genero==2)&(valor<=1000)){
			mulher++;
			}
		media=media+valor;
			N++;
			valor=0;
			altura=0;
			genero=0;
		}
		}while(N!=20);
		System.out.println("");
		System.out.println("RELAT�RIO");
		System.out.println("A m�dia de todos os sal�rios fornecidos foi de R$"+df.format(media/20)+";");
		System.out.println("O funcion�rio mais alto mede "+AlturaMaior+"cm de altura;");
		System.out.println("O funcion�rio mais baixo mede "+AlturaMenor+"cm de altura;");
		System.out.println("Existem na empresa "+mulher+" mulher(es) ganhando R$1000,00 ou menos.");
		
		}}