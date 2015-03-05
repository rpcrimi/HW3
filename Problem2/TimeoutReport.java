class TimeoutReport extends Report {
	private int numTimeouts = 0;

	public TimeoutReport(Submission submission){
		this.submission = submission;
	}
	public void update(boolean passed){
		if(!passed){
			if(this.submission.wasTimeoutError()){
				this.numTimeouts += 1;
				System.out.println("Number of timeout errors: "+ this.numTimeouts);
			}
		}
	}
}