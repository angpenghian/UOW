// Full name: Penghian Ang
// Java version: 17.0.7, 64 bit
// Tutorial Group:
// Declaration: I declare that this assignment is my own work and i have not passed this progranm to anyone else.
// I am willing to accept whatever penalty given to you. 
import java.util.ArrayList;
import java.util.Arrays;

class MissWorld {
	public static final int SIZE = 10; // indicating the number of judges, usually is 10. CONSTANT value
	private Country name;
	private double[] score;// Array scores given by judges, each value is less than 10 with two decimal
							// places)
	private double cf;// (carried forward derived from the previous round, obviously starting round
						// has no carried forward score, i.e. 0.00)
	private double fs;// (the final score of the current round).

	// Constructor
	public MissWorld(Country name, double[] score, double cf) {
		this.name = name;
		this.score = score;
		this.cf = cf;

	}

	public Country getCountry() {
		return name;
	}

	public double getCarriedForward() {
		return cf;

	}

	public void setCf(double cf) {
		this.cf = cf;
	}

	// The finalScore method returns the sum of the scores given by the judges by
	// eliminating the two highest and the two lowest scores.
	public double getFinalScore() {
		return getfinalScore();
	}

	public void setScore(double[] score) {
		this.score = score;
	}

	public double[] getScore() {
		return score;
	}

	private ArrayList<Double> getSortedList() {
		ArrayList<Double> sortedList = new ArrayList<Double>();
		Arrays.sort(score);
		for (int i = 0; i < score.length; i++) {
			sortedList.add(score[i]);
		}
		return sortedList;

	}

	private double highest() {
		return getSortedList().get(getSortedList().size() - 1);
	}

	private double secondHighest() {
		return getSortedList().get(getSortedList().size() - 2);
	}

	private double lowest() {
		return getSortedList().get(0);
	}

	private double secondLowest() {
		return getSortedList().get(1);
	}

	private double getfinalScore() {
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		fs = sum - highest() - secondHighest() - lowest() - secondLowest();
		return fs;
	}

	// method is the sum of carried forward score and the final score.
	public double getTotalScore() {
		double totalScore = getfinalScore();
		return totalScore;

	}

	// displays the information of one country, i.e. a lady representing her country
	public void printInfo() {
		System.out.printf("%-20s", name.getName());

		for (int i = 0; i < score.length; i++) {
			System.out.printf(" %-10.2f", score[i]);
		}

		System.out.printf(" %-10.2f %-10.2f %-10.2f", cf, getfinalScore(), getTotalScore());

	}

	public void printTitles() {
		System.out.printf("%-20s %-10s %-10s %-10.2f", name.getName(), name.getMissName(), name.getAge(), cf);
	}
}// end of method

class Country {
	// Declare variables for country, contestant name and age
	private String name, missName;
	private int age;

	// Constructor
	public Country(String name, String missName, int age)

	{
		this.name = name;
		this.missName = missName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getMissName() {
		return missName;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMissName(String missName) {
		this.missName = missName;
	}

	public void setAge(int age) {
		this.age = age;
	}
}// end of class

public class PenghianAng_8376566_A3 {

	private static final String[] Countries = { "China", "Thailand",
			"British Columbia", "South Korea", "Japan", "USA", "Australia", "Venezula", "Russia", "Brazil" };
	private static final String[] Titles = { "Interview event",
			"swimsuit competition event", "evening gown competition event" };

	// generate random score for each judge
	private static void getScore(double[] score) {

		for (int z = 0; z < score.length; z++) {
			score[z] = (double) (Math.random() * 10.0);
		}
	}

	private static int getAge() {
		// Generate age 11-25
		return (int) (Math.random() * 10 + 16);
	}

	private static void displayCountryInfo(ArrayList<MissWorld> alist, double[] cfArray) {
		int a = 0;
		System.out.printf("%-20s %-10s %-10s %-10s", "Country", "Name", "Age", "c/f");
		System.out.println();
		System.out.println();

		for (MissWorld mw : alist) {
			mw.printTitles();
			System.out.println();
		}

		System.out.println();
		System.out.printf("%-20s %-7s %-7s %-7s %-7s %-7s %-7s %-7s %-7s %-7s %-10s %-10s %-10s %-10s%n", "Countries",
				"J 1", "J 2", "J 3", "J 4", "J 5", "J 6", "J 7", "J 8", "J 9", "J 10", "c/f", "Current", "Total");
		System.out.println();

		for (MissWorld mw : alist) {
			System.out.printf(
					"%-20s %-7.2f %-7.2f %-7.2f %-7.2f %-7.2f %-7.2f %-7.2f %-7.2f %-7.2f %-10.2f %-10.2f %-10.2f %-10.2f",
					mw.getCountry().getName(), mw.getScore()[0], mw.getScore()[1], mw.getScore()[2], mw.getScore()[3],
					mw.getScore()[4],
					mw.getScore()[5], mw.getScore()[6], mw.getScore()[7], mw.getScore()[8], mw.getScore()[9],
					cfArray[a], mw.getTotalScore(), cfArray[a] + mw.getTotalScore());

			System.out.println();
			a++;
		}
	}

	private static void displayResultInfo(ArrayList<MissWorld> alist) {
		ArrayList<MissWorld> list = new ArrayList<>(alist);
		System.out.println();
		int f = 0;

		list.sort((g1, g2) -> Double.compare(g2.getTotalScore() + g2.getCarriedForward(),
				g1.getTotalScore() + g1.getCarriedForward()));
		for (MissWorld g : list) {
			System.out.printf("%-5d %-20s %10.2f%n", f + 1, (g.getCountry()).getName(),
					g.getTotalScore() + g.getCarriedForward());
			f++;
		}
	}

	public static void main(String[] args) {

		ArrayList<Country> countryList = new ArrayList<>();
		ArrayList<MissWorld> MissWorldList = new ArrayList<>();
		double[] score;
		double[] cfArray = new double[Countries.length];
		// country array list
		for (int g = 0; g < Countries.length; g++) {
			Country c = new Country(Countries[g], String.format("Name %d", g + 1), getAge());
			countryList.add(c);
		}

		int z = 0;
		// missworld array list
		for (int mw = 0; mw < Countries.length; mw++) {

			score = new double[MissWorld.SIZE];
			getScore(score);
			MissWorld List = new MissWorld(countryList.get(mw), score, 0.0);
			MissWorldList.add(List);
		}
		// Display results
		int mw = 0;
		for (int j = 0; j < 3; j++) {
			System.out.printf("Starting position for event: " + Titles[z]);
			System.out.println();

			for (MissWorld v : MissWorldList) {
				if (j == 0) {
					cfArray[mw] = 0.0;
				} else {
					cfArray[mw] = v.getTotalScore() + cfArray[mw];

					score = new double[10];
					getScore(score);

					v.setScore(score);
					v.setCf(cfArray[mw]);
					mw++;
				}
			}

			mw = 0;
			System.out.println();
			displayCountryInfo(MissWorldList, cfArray);
			System.out.printf("%nThe result after the event: " + Titles[z]);
			System.out.println();
			displayResultInfo(MissWorldList);
			System.out.println();
			z++;

		}
	}

	// for loop to instantaite a bunch of objects and pend each to the array list to
	// display
	// run another for loop to print out info or while ur instantiate the array list
	// with all objects

}
