//Robert Crimi
//Sam Beckett
import java.util.*;
public class Driver
{
  public static void main(String[] args)
  {
    Submission a = new Submission();
    Submission b = new Submission();
    Submission c = new Submission();
    Submission d = new Submission();
    Submission e = new Submission();
    Grader g = Grader.getInstance();

    g.add(a);
    g.add(b);
    g.add(c);
    Grader h = Grader.getInstance();
    h.add(d);
    h.add(e);

    h.process();
    System.out.println(h.get());
  }
}