
public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = { 1, 2, 3 };
		try{
			for (int i = 0; i <= v.length; i++) {
				System.out.println(v[i]);
			}
			System.out.println("Hola Món");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error de dimensió d'Array!");
		} finally {
			System.out.println("Final del programa!");
		}
	}
}
