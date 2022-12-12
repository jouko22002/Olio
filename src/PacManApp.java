
public class PacManApp {

	public static void main(String[] args) {

		Pacman pacman = new Pacman();
		
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		Fruit fruit3 = new Fruit();
		
		pacman.eat(fruit2);
		
		System.out.println(fruit1.isVisible);
		System.out.println(fruit2.isVisible);
		System.out.println(fruit3.isVisible);
		
		
		Ghost ghost = new Ghost();
		
		ghost.syoPacman(pacman);
		ghost.syoPacman(pacman);
		ghost.syoPacman(pacman);
		
	}

}

class Pacman
{
    public int points;
    public int elamat;
    public Pacman()
    {
    	points = 0;
    	elamat = 5;
    }

    public void printData()
    {
        System.out.println(points);
    }

    public void eat(Fruit eatenFruit)
    {
    	System.out.println("Pac-Man ate fruit");
    	eatenFruit.disappear();
    	elamat++;
    	System.out.println(elamat);
    }
    
    public void vahennaElama() 
    {
    	System.out.println("Pacman syöty");
    	elamat--;
    	System.out.println(elamat);
    }
}


class Fruit
{
    public boolean isVisible;

    public Fruit()
    {
    	isVisible = true;
    }

    public void disappear()
    {
    	isVisible = false;
        System.out.println("Fruit is hidden");
    }
}


class Ghost
{
	public void syoPacman(Pacman syoty)
	{
		syoty.vahennaElama();
	}
	
}
