class CorrectReport extends Report{
	private int numCorrect = 0;

	public CorrectReport(Submission submission){
		this.submission = submission;
	}
	public void update(boolean passed){
		if(passed){
			this.numCorrect += 1;
			System.out.println("Number correct: "+ this.numCorrect);
		}
	}
}