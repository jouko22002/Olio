
public class Periytyminen_harjoitus {

	public static void main(String[] args) {
		esine toiminto1 = new esine("testi1",10);
		toiminto1.print();
		esine2 toiminto = new esine2("testi",5);
		toiminto.getJoku5();
		toiminto.print();
		toiminto.setJoku5(15);
		toiminto.print();
	}

}
	class esine {
		protected String joku;
		protected int joku2;
	
	public esine() {
		joku = "";
		joku2 = 0;
	}
	public esine(String joku3, int joku4) {
		joku = joku3;
		joku2 = joku4;
	}
	void print() {
		System.out.println(joku);
		System.out.println(joku2);
	}
	}
	
	class esine2 extends esine{
		private int joku5;
	
	public esine2() {
		joku = "";
		joku2 = 0;
		joku5 = 0;
	}
	public esine2(String joku3, int joku4) {
		this.joku = joku3;
		this.joku2 = joku4;
		joku5 = 0;
	}
	private void teejotain() {
		joku5++;
		System.out.println(joku5);
	}
	public int getJoku5() {
		return joku5;
	}
	public void setJoku5(int joku5) {
		this.joku5 = joku5;
	}
	@Override
	void print() {
		super.print();
		teejotain();
	}
	}