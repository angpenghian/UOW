// What is a time?
//  - hours, minutes and seconds
//  - display format - HH:MM:SS
//
// File name: TestTime_1.java

class Time
{
	//declare instance variables
	private int hours;
	private int minutes;
	private int seconds;
	
	//default constructor
	public Time()
	{
			//by default hours, minutes and seconds are zero
	}
	
	//other constructor
	public Time(int hours, int minutes, int seconds)
	{
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	//copy constructor
	public Time (Time t)
	{
		this.hours = t.hours;
		this.minutes = t.minutes;
		this.seconds = t.seconds;
	}
	
	//accessor method
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public int seconds()
	{
		return seconds;
	}
	
	//mutator method
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}
	
	public void setSeconds(int seconds)
	{
		this.seconds = seconds;
	}
	
	// Increase the timing by 1 second
	public void increment()
	{
		++seconds;
		int temp = seconds / 60;
		seconds = seconds % 60;
		
		minutes = minutes + temp;
		temp = minutes / 60;
		minutes = minutes % 60;
		
		hours = hours + temp;
		hours = hours % 24;
	}
	
	//display info method
	public void displayInfo(String s)
	{
		System.out.printf("%s = %02d:%02d:%02d%n", s, hours, minutes, seconds);
	}
}

class TestTime_1
{
	public static void main (String [ ] args)
	{
		Time t0 = new Time();
		Time t1 = new Time(6, 48, 59);
		Time t2 = new Time(11, 59, 59);
		Time t3 = new Time(23, 59, 59);
		Time t4 = new Time(t3);
		
		t0.displayInfo("t0");
		t1.displayInfo("t1");
		t2.displayInfo("t2");
		t3.displayInfo("t3");
		t4.displayInfo("t4");
		
		System.out.println("\nIncrease the timing by 1 second");
		t0.increment();
		t1.increment();
		t2.increment();
		t3.increment();
		t4.increment();
		
		t0.displayInfo("t0");
		t1.displayInfo("t1");
		t2.displayInfo("t2");
		t3.displayInfo("t3");
		t4.displayInfo("t4");

	}
	
}