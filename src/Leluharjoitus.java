
public class Leluharjoitus {

	public static void main(String[] args) {
		Lelu lelu = new Lelu("nukke",5);				//Luodaan oliot
		lelu.tulostin();
		Vieteriauto vauto = new Vieteriauto("Vieteriauto",10);
		vauto.tulostin();
		vauto.kiihdyta();
		vauto.kiihdyta();
		vauto.kiihdyta();
		
	}//Mainin lopetus
}
	class Lelu {
		 String nimi;
		 int paino;
		
	public Lelu() {
		nimi = "";
		paino = 0;
	}
	public Lelu(String name, int weight) {
		nimi = name;
		paino = weight;
	}
	 void tulostin() {
		System.out.println(nimi);
		System.out.println(paino);
	}
	
	}	//Lelu luokan loppu
	
	class Vieteriauto extends Lelu {	//Periytyvä luokka
		
		private int nopeus;
		
	public Vieteriauto() {
		nimi = "";
		paino = 0;
		nopeus = 0;
				
	}
	public Vieteriauto(String nimi, int paino) {
		this.nimi = nimi;
		this.paino = paino;
		nopeus = 0;
	}
	void kiihdyta() {
		nopeus++;
		System.out.println("Auto kiihtyy, vauhti on: " +nopeus);
	}
	@Override
	void tulostin() {
		super.tulostin();
		System.out.println(nopeus);
	}

}
