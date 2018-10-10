import java.util.Scanner;
import java.lang.Integer;

public class IntegerClass {
	public static void main (String[] args) {
		//define an Integer
		Integer num1 = 12;
		//define another one which value is the comparation of an Integer with another number.
		Integer num2 = num1.compareTo(1);
		//it'll say that num1 is bigger
		System.out.println(num2);
		
		//define one integer converting a String into a Integer
		Integer num3 = num1.getInteger("123");
		//print it
		System.out.println(num3);
	
		//we can use it as int using this method:
		int a1 = num1.intValue();
		//print it
		System.out.println(a1);
		
		//we can also do it with other data types:
		short a2 = num1.shortValue();
		System.out.println(a2);
		
		//to convert an Integer into a String we can use this method
		String s1 = num1.toString();
		System.out.println(s1);
		
		//to define a Integer using the value of another data type we use valueOf
		Integer num4 = num1.valueOf(a1);
		System.out.println(num4);
	}
}
