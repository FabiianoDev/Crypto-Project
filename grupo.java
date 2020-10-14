package cripto;

import java.util.Scanner;

public class grupo {

	public static void main(String[] args) {
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";
		char letra = ' ';

		String msgI = "" ;
		String cripto = "";
		String descripto = " ";
		String msgF = "";

		Scanner ler = new Scanner(System.in);
		
		System.out.println("O programa que criptografa uma mensagem e tambem descriptografa a mesma.");
		System.out.println("Insira sua mensagem para ser criptografada :)");
		msgI = ler.nextLine().toLowerCase();
	    
	
		
		// i indice que percorrera cada caracter da variavel msgI
		for(int i = 0; i < msgI.length(); i++) { 
			
			//Se caracter da minha variavel msgI for espaço em branco
			if (msgI.charAt(i) == ' ') {
				letra = ' ';
				cripto = cripto + Character.toString(letra);
			}
			
			
			
			// j indice  que percorrera cada caracter da variavel alfabeto
			for(int j = 0; j < alfabeto.length(); j++) {
				
				//Para verificar se o caracter msgI existe dentro percorrendo todo o alfabeto
				// verifica se caracter msgI(i) == caracter alfabeto(j)
				if (msgI.charAt(i) == alfabeto.charAt(j)) {
					
					//Se Caracter alfabeto for = z ele reinicia sua posição(25) para a posição(0)
					if(alfabeto.charAt(j) == 'z') {
						letra = alfabeto.charAt(j-j);
						cripto = cripto + Character.toString(letra);
						
					//Senão o caracter do alfabeto pula 1 posição
					} else{
						letra = alfabeto.charAt(j+1);
						cripto = cripto + Character.toString(letra);
					}
					
				} 
	
			}
				
		}
		System.out.println("\nMensagem criptografada: " + cripto);

		
		
		System.out.println("\nInsira sua mensagem a ser descriptografada");
        descripto = ler.nextLine();
        
        
        // i indice  que percorrera cada caracter da variavel descripto
        for(int i = 0; i < descripto.length(); i++) { 
        	
        	//Se o caracter da minha variavel descripto for espaço em branco
        	if (descripto.charAt(i) == ' ') {
				letra = ' ';
				msgF = msgF + Character.toString(letra);
			}
        	
        	// j indice  que percorrera cada caracter da variavel alfabeto
            for(int j = 0; j < alfabeto.length(); j++) {

            	//Para verificar se o caracter msgI existe dentro percorrendo todo o alfabeto
				// verifica se caracter msgI(i) == caracter alfabeto(j)
                if (descripto.charAt(i) == alfabeto.charAt(j)) {
                	
                	//Se Caracter alfabeto for = a ele reinicia sua posição(0) para a posição(25)
                    if(alfabeto.charAt(j) == 'a'){
                        letra = alfabeto.charAt(j+25);
                        msgF = msgF + Character.toString(letra);
                    
                      //Senão o caracter do alfabeto volta 1 posição
                    } else {
                        letra = alfabeto.charAt(j-1);
                        msgF = msgF + Character.toString(letra);

                    }
                    
                
                }
            }
        
        }
        System.out.println("\nMensagem descriptografada: " + msgF); 
	

	}

}
