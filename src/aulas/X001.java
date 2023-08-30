package aulas;

    //Diferentes tipos de variáveis	
public class X001 {
	public static void main(String[] args) {

        //Convenção Java
		int idade = 20;
		String nome = "Alan";
		String nomeDoMeuCachorro = "Belinha";
		
		//Aceito, mas não utilizado
		int _idade;
		int $idade;
		String ano2014;
		
		//Não é convenção Java	
		String nome_do_meu_cachorro;
		String Nome_do_meu_cachorr;
		
		//Má prática
		int a = 10;
		String b = "Alan";

		System.out.println("Idade = " + idade);
		System.out.println("Idade = " + b);
    
    }
}