package listaexercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); 
        double indice, media, soma = 0, maior=0;
        String data;
        
        for(int i =1; i < 3; i++){
        System.out.println("Digite o dia desta medição:");
        data = s.nextLine();
        s.nextLine();
        System.out.println("Digite o índice pluviométrico captado neste dia em m²:");
        indice = s.nextDouble();
        
        if(indice>maior){
            soma += indice;
            maior = indice;            
        }
        System.out.println("O maior índice pluviométric foi " + indice + "m²");
        }
    }
}
