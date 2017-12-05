package observer;

import java.util.Date;
import java.util.Observable;


public class Montre extends Observable {

	public static Date date;
		
	public Montre() {
	}

	public Date getDate(){
		return date;	
	}

	public void setDate(Date dateParam) {
		date = dateParam;
		setChanged();
		this.notifyObservers(date);
	}
	
}
