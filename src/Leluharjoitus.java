
public class Leluharjoitus {

	public static void main(String[] args) {
		Lelu lelu = new Lelu("auto",5);
		lelu.tulostin();
		Lelu lelu1 = new Lelu("vieteriauto", 100);
		lelu1.tulostin();
		
	}
}
	class Lelu {
		private String nimi;
		private int paino;
		
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
	
	}
	class Vieteriauto extends Lelu {
		
		int nopeus;
		
	public Vieteriauto() {
		
		nopeus = 0;
		
	}
	public Vieteriauto(int speed) {
		nopeus = speed;
	}
	void kiihdyta() {
		nopeus++;
	}
	@Override
	void tulostin() {
		super.tulostin();
	}

}
