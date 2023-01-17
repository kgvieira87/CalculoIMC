import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	
	double peso = 0;
	double altura = 0;
	String nome;
	double IMC;
	
	
	

	
	System.out.println("Informe seu nome:");	
	nome = sc.nextLine();
	
	System.out.println("Informe seu peso:");	
	peso = sc.nextDouble();
	
	System.out.println("Informe sua altura:");	
	altura = sc.nextDouble();
	
	IMC = peso / (altura * altura);
	
	System.out.println("Seu IMC é:" + IMC);	
	IMC = sc.nextDouble();
		
		
	}

}
