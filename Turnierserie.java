import java.util.HashMap;
import java.util.List;
import java.util.Map;
//результаты каждой серии тернира
// не уверена, правильно ли я реализую этот класс
//условие консультанта преподавателя использовать Collections для получения результата отдельныхсерий турнира
public class Turnierserie {
	Map<Integer, Turnier> turnieren;
	List<Reiter> reiter;
	int limits;
	int anzahlTurniere;
	public Turnierserie(Map<Integer, Turnier> turnieren, List<Reiter> reiter, int limits) {
	
	}
	public void startSerie (int anzahlTurniere) {
		 Map<Integer, Turnier> turnieren = new HashMap<Integer, Turnier>();
		  for (int i = 1; i <=anzahlTurniere; i++) {
		   Turnier turnier = new Turnier( reiter , limits); 
		   turnieren.put(i, turnier);

		  }

	}

}
