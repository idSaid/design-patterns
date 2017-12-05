package observer;

import java.text.DateFormat;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;

public class AfficheurDigitalFrancai implements Observer {

	
	public AfficheurDigitalFrancai(Montre montre) {
		super();
	}
	
	DateFormat longDateFormatFR = DateFormat.getDateTimeInstance(
			DateFormat.LONG,
			DateFormat.LONG, new Locale("FR","fr")
	);

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(longDateFormatFR.format(arg));
	}

}
