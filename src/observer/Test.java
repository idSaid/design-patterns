package observer;

public class Test {

	public static void main(String[] args) {	
		
		Montre montre= new Montre();
		Timer timer= new Timer(montre);
		
		AfficheurDigitalFrancai afficheurDigitalFrancai= new AfficheurDigitalFrancai(montre);
		AfficheurDigitalAnglais afficheurDigitalAnglais= new AfficheurDigitalAnglais(montre);
		
		montre.addObserver(afficheurDigitalAnglais);
		montre.addObserver(afficheurDigitalFrancai);	
		
		timer.start();

	}

}
