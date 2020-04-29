package race;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant first1 = Instant.now();
		Instant second1 = Instant.now();
		Duration duration1 = Duration.between(first1, second1);
		RaceResults rr1 = new RaceResults("contestant 1",duration1);
		//-------------------------------------
		Instant first2 = Instant.now();
		Instant second2 = Instant.now();
		Duration duration2 = Duration.between(first2, second2);
		RaceResults rr2 = new RaceResults("contestant 2",duration2);
		//-------------------------------------
		RaceResults.onNewResult(rr1.getTagCode(), rr1.getDuration());
		RaceResults.onNewResult(rr2.getTagCode(), rr2.getDuration());
		//-------------------------------------
		RaceResults.printResults();
		
	}

}
