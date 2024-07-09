
package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        
        System.out.println("Ingrese un texto:");
        String palabra = T.nextLine();
        
        
        if(es_palindromo(palabra)){
            System.out.println("La palabra "+palabra+" es un palindromo");
        }else{
            System.out.println("La palabra "+palabra+" no es un palindromo");
        }
        
    }
    
    public static boolean es_palindromo(String palabra){
        String palabraI = invertir_cadena(palabra);
   
        return palabra.equals(palabraI);
    }
    
    public static String invertir_cadena(String cadena){
        String cadenaI="";
        
        for(int i = cadena.length()-1; i>=0; i--){
            cadenaI += cadena.charAt(i);
        }
        
        return cadenaI;
    }
    
}
