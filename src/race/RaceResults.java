package race;

import java.time.Duration;
import java.util.ArrayList;

public class RaceResults {
	String tagCode;
	Duration  duration;
	
	
	/**
	 * @param tagCode
	 * @param duration
	 * Constructor
	 */
	public RaceResults(String tagCode, Duration duration) {
		super();
		this.tagCode = tagCode;
		this.duration = duration;
	}
	
	/**
	 * @return
	 * getters and setters
	 */
	public String getTagCode() {
		return tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	
	/**
	 * @param tagNumber
	 * @param resultTime
	 * Store and recieve results
	 */
	public static void onNewResult(String tagNumber, Duration resultTime) {
		ArrayList list = new ArrayList();
		RaceResults obj = new RaceResults(tagNumber, resultTime);
		list.add(obj);
	}
	
	public static void printResults() {
		ArrayList<RaceResults> list = new ArrayList<RaceResults>();
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).duration.toMinutes();j++) {
				System.out.println("The winner is "+list.get(0).toString());
				System.out.println("-------------------  All the results  -------------------");
				System.out.println(""+list.get(j).toString());
			}
		}
	}
}
