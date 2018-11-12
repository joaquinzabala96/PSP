<<<<<<< HEAD
package Ejercicio_2;
import java.util.*;

public class Main {

	
	static Scanner cin= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String [] abc= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W",
				"X","Y","Z"};
		
		
		System.out.println("Num:");
		int num=cin.nextInt();
		
		for(int x=0;x<num;x++) {
			String result="";
		int random1= (int) (Math.random()*21);
		for(int i=0;i<random1;i++) {
			int random2= (int) (Math.random()*21);
			result+=abc[random2];
		}System.out.println(result);}
		
		
		

	}

}

}
=======
package Ejercicio_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
>>>>>>> refs/remotes/origin/master
