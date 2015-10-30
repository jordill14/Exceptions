
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int[] v = { 1, 2, 3 };
			for (int i = 0; i <= v.length; i++) {
				System.out.println(v[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Hola Mon");
		}
		
	}
}
