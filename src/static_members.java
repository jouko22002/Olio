
import java.util.Scanner;

public class static_members {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Calculate the area of a rectangle or a circle (r/c)");
		String input = in.nextLine();
		
		if (input.equals("r")) {
			
		System.out.println("Length");
		int length = Integer.parseInt(in.nextLine());
		
		System.out.println("Weidth");
		int weidth = Integer.parseInt(in.nextLine());
		
		System.out.println(Laskuri.laskePintaAla(length, weidth));
		}
		if (input.equals("c")) {
			
		System.out.println("Radius?");
		double radius = in.nextDouble();
		
		System.out.println(Laskuri.laskePintaAla(radius));
		}
	}

}
class Laskuri {
		
	//Tämä laskee suorakulmion pinta-alan
	static int laskePintaAla(int pituus, int leveys) {
		int tulos = pituus * leveys;
		return tulos;
		}
	
	//Tämä tulostaa ympyrän pinta-alan
	static double laskePintaAla(double sade) {
		
		double tulos = Math.PI * sade * sade;
		tulos = Math.round(tulos * 100.0) / 100.0;
		return tulos;
	}
}