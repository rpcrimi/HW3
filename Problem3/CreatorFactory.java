public class CreatorFactory implements Creator {
	public CreatorFactory() {}

	public  Logging getLog(String type){
		Logging logfile;
		if (type.equalsIgnoreCase("text"))
			logfile = new LogText();
		else if (type.equalsIgnoreCase("xml"))
			logfile = new LogXML();
		else if (type.equalsIgnoreCase("html"))
			logfile = new LogHTML();
		else
			logfile = new LogText();
		return logfile;
	}
}