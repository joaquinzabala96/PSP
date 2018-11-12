
package Ejercicio_1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);
		String Cadena="";
		int Cant_a=0,Cant_e=0,Cant_i=0,Cant_o=0,Cant_u=0;	
		
		
		System.out.println("mete la palabra");
		Cadena=cin.nextLine();
		
		for(int i=0;i<Cadena.length();i++) {
			
			if(Cadena.charAt(i)=='a') {
				Cant_a++;
			
			}
			if(Cadena.charAt(i)=='e') {
				Cant_e++;
				
			}
			if(Cadena.charAt(i)=='i') {
				Cant_i++;
				
			}
			if(Cadena.charAt(i)=='o'){
				Cant_o++;
				
			}
			if(Cadena.charAt(i)=='u'){
				Cant_u++;
				
			}
			
		}
		System.out.println("A :"+Cant_a+" E :"+Cant_e+" I :"+Cant_i+" O :"+Cant_o+" U :"+Cant_u);
	}

}