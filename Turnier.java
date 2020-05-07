import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Map;

public class Turnier {

	private int tournamentMaxLength;
	/** Teilenehmerliste erzeugen */
	private List<Reiter> reiterliste;
	/** Teilnehmer  hinzufügen */
	
	public Turnier(List<Reiter> _reiterliste, int _length) {
		reiterliste = _reiterliste;
		tournamentMaxLength = _length;
	}
	
	public void starten() {
		System.out.println("Beginn des Turniers");		
		int tournamentLength = 0;	
		int currentReiterIndex = -1;
		
		Random r = new Random();		
		
		while(reiterliste.size() != 1 && tournamentMaxLength > tournamentLength) {
			try {
//				System.out.println("Waiting 7ms");
				TimeUnit.MILLISECONDS.sleep(7);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			

			
			currentReiterIndex++;
			if(currentReiterIndex >= reiterliste.size()) currentReiterIndex = 0;
			
			int nextReiterIndex = currentReiterIndex + 1;
			if(nextReiterIndex >= reiterliste.size()) nextReiterIndex = 0;			
			
			double random = r.nextDouble();
				
			System.out.print("Reiter " + reiterliste.get(currentReiterIndex).getSiege() + " stoesst  " + reiterliste.get(nextReiterIndex).getSiege() + " result: ");

			if(( reiterliste.get(nextReiterIndex)).getWahrscheinlichkeit() >= random) {
				System.out.println("Stoesst aus dem Sattel");
				reiterliste.remove(nextReiterIndex);
			} else {
				System.out.println("Trifft nicht");
			}
			
			tournamentLength++;
			
			
			
		}
		
		if(tournamentMaxLength == tournamentLength && reiterliste.size() > 1) {
			System.out.println("Die maximale Laenge des Turniers erreicht");		
			System.out.println("Der Sieger ist unentschlossen");	
		}else {
			System.out.print("Der Sieger ist ");
			System.out.println(reiterliste.get(0).getSiege());	
		}		

		
		System.out.println("Ende des Turniers");

	}
}
