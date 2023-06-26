import java.util.Scanner;

public class Testes {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite sua idade: ");
    int idade = sc.nextInt();
	
	
    if (idade >=100 ) {
		 System.out.println("oloco, tudo isso ?");
    
    } else if (idade >=60) 
		System.out.println(" já está na terceira idade.");
    else if (idade >=18 ) {
    	System.out.println("Você é maior de idade.");  	 
    } else {
    	System.out.println("Você é menor de idade.");
    	
    	
    	
    }
	

	
	
	
	
	 sc.close();
}
              
}
    



