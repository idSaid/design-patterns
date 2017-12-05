package observer;

import java.util.Date;

public class Timer extends Thread {

	Montre montre;
	
	public Timer(Montre montre){
		this.montre=montre;
	}
	
	@Override
	public void run() {		
		while(true){
			try {
				sleep(1000);
				montre.setDate(new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
