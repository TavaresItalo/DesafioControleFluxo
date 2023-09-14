import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = leitor.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = leitor.nextInt();

        try {	
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroDois < parametroUm){
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
    

