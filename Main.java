import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Beginn");
		
		if(args.length < 3) {
			System.out.println("Minimale Anzahl der Reiter ist 3");
			System.exit(1);
		}			
		
		Integer RiderCount = Integer.parseInt(args[0]);
		Integer TournamentLimit = Integer.parseInt(args[args.length-1]);
		
		System.out.print("Anzahl der Reiter:  ");
		System.out.println(RiderCount);
		System.out.print("Anzahl der Turniere:  ");
		System.out.println(TournamentLimit);
		
		NumberFormat defaultFormat = NumberFormat.getPercentInstance();
		List<Reiter> listReiters = new ArrayList<Reiter>();
		for (int i = 1; i < args.length-1; i++) {
			try {
				listReiters.add(new Reiter(i, defaultFormat.parse(args[i]).floatValue(), true));
			} catch (ParseException e) {
				System.out.println("falscher Prozentsatz!"); 
				System.exit(2);
			}
		}
		
		Turnier turnier = new Turnier(listReiters, TournamentLimit);
		turnier.starten();
				
		
		System.out.println("Ende");
	}

}
