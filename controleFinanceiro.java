package controle;

import java.util.Scanner;

public class controlefinanceiro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int menu = 0;
		int cont = 0;
		String[]desc=new String[50];
		double[]valor= new double[30];
		int[] dia = new int[20];
		int[] mes = new int[30];

		System.out.println("CONTROLE FINANCEIRO");

		do {
			System.out.println("1-Cadastro");
			System.out.println("2-Relatorios");
			System.out.println("0-Sair");
			menu = input.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Cadastro :");
				System.out.println("1-Recebidos");
				System.out.println("2-gastos");
				int opc=input.nextInt();
				
				if(opc==1) {
					System.out.println("cadastro de recebimentos");
					
					System.out.println("Valor recebido:");
					valor[cont] = input.nextDouble();
					
					System.out.println("Descrição do recebimentos:");
					desc[cont] = input.next();

					System.out.println("Data do recebimentos feito:");
					System.out.println("Dia");
					dia[cont] = input.nextInt();

					System.out.println("MÊS em numero inteiro");
					mes[cont] = input.nextInt();

				}else if(opc==2) {
					System.out.println("Valor gasto:");
					valor[cont] = input.nextDouble();
					valor[cont]=valor[cont]*(-1);

					System.out.println("Descrição do gasto:");
					desc[cont]=input.next();

					System.out.println("Data do gasto feito:");
					System.out.println("Dia");
					dia[cont] = input.nextInt();

					System.out.println("MÊS em numero inteiro");
					mes[cont] = input.nextInt();
				}
				
				cont++;

			break;	
			case 2:
				System.out.println("Relatorio do mÊs");
				double saldo=0;
				double gastos=0;
				double rendimento=0;
				int i=0;

				System.out.println("Digite a opção do mÊs para relatorio:");
			    int escolha=input.nextInt();
				
				
				for(i=0;i<cont;i++) {
						if(mes[i]==escolha) {
							
							
							if(valor[i]<0) {
								
								gastos=gastos+valor[i];
							
								
							}if(valor[i]>=0){
								
								rendimento=rendimento+valor[i];
							}
				
							
						}
						
				}
					saldo=rendimento+gastos;
					System.out.println("O faturamento do mês é  : " + saldo);
					System.out.println("Os gastos é de: " + gastos);
					System.out.println("Total de recebimentos:  " + rendimento);
			
			case 0:
				System.out.println("Obrigada!!");
				break;

			}
		} while (menu != 0);

		input.close();
	}

}
