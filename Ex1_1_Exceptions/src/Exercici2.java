import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			funcioXorra();
		} catch (IOException e) {
			//} catch (FileNotFoundException e) {
			System.out.println("Error");
			if (e.getClass().getName() == "java.io.FileNotFoundException") System.out.println("fitxer no trobat");
			e.printStackTrace();
		} catch (SecurityException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	public static void funcioXorra() throws IOException /*FileNotFoundException*/, SecurityException {
		FileOutputStream f = new FileOutputStream ("../docs/test.txt");
		f.close();
	}
}
