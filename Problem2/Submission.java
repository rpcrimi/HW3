/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.*;

public class Submission
{	
    private Random myRandom;
	private boolean lastErrorWasTimeout;
	private List<Report> observers = new ArrayList<Report>();

    // You may add attributes to this class if necessary

	public Submission()
	{
	    myRandom = new Random();
		lastErrorWasTimeout = false;
	}

    public void runTestCase()
	{
	    // For now, randomly pass or fail, possibly due to a timeout
		boolean passed = myRandom.nextBoolean();
		if(!passed)
		{
		    lastErrorWasTimeout = myRandom.nextBoolean();
		}
		notifyAllObservers(passed);
		// You can add to the end of this method for reporting purposes
	}
	
    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}

	public void attach(Report newReport){
		observers.add(newReport);
	}

	public void notifyAllObservers(boolean passed) {
		for(int i = 0; i < observers.size(); i++){
			observers.get(i).update(passed);
		}
	}

	public static void main(String[] args){
		Submission s = new Submission();
		CorrectReport c = new CorrectReport(s);
		TimeoutReport t = new TimeoutReport(s);
		s.attach(c);
		s.attach(t);

		s.runTestCase();
		s.runTestCase();
		s.runTestCase();
		s.runTestCase();
		s.runTestCase();
		s.runTestCase();

	}
}
