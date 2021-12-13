

import Funciones.Console;

public class Debugger {

	public static void main(String[] args) {

		
		System.out.println("Dame un numero:");
		
		int num=Console.readInt();
		int fact=1;
		
		
		for (int i = num; i > 0; i--) {
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}
