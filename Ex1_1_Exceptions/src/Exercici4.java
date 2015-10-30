
public class Exercici4 {
	
	private int edat;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Exercici4 object = new Exercici4();
			object.setEdat(-2);
		} catch (IllegalArgumentException e) {
			System.out.println("Error no pots tenir menys anys de 0");
			if (e.getClass().getName() == "java.lang.IllegalArgumentException") System.out.println("Ets un extrany entre la població");
			e.printStackTrace();
		}

	}
	
	public void setEdat(int edat) {
		if (edat < 0) throw new IllegalArgumentException("No pot ser negativa l'edat!!!!");
		this.edat = edat;
        
    }

}
