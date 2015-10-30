import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			divisio();
		} catch (ArithmeticException e) {
			//} catch (FileNotFoundException e) {
			System.out.println("Error no pots dividir per 0");
			if (e.getClass().getName() == "java.lang.ArithmeticException") System.out.println("Divisió invalida");
			e.printStackTrace();
		}
	}
	public static void divisio() throws ArithmeticException {
		int number1 =10;
		int number2 = 0;
		if (number2 == 0) throw new ArithmeticException("Divisor nul!!!!!!!!!!");
			
		int result = (number1 / number2); 
		System.out.println(result);
	}
	
}
