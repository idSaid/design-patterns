package observer;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

public class AfficheurDigitalAnglais implements Observer {

	Montre montre;
	
	public AfficheurDigitalAnglais(Montre montre) {
		super();
		this.montre = montre;
	}
	
	DateFormat longDateFormatEN = DateFormat.getDateTimeInstance(
			DateFormat.LONG,
			DateFormat.LONG, new Locale("EN","en")
	);

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(longDateFormatEN.format(((Montre)o).getDate()));
	}


}
