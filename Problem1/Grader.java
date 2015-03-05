/**
* Grader.java
*
* A basic dummy Submission object for use with the auto-grader
*/
import java.util.Queue;
import java.util.LinkedList;

public class Grader
{
  private static Grader grader;
  static Queue<Submission> queue = new LinkedList<Submission>();

  private Grader()
  {

  }

  public static Grader getInstance(){
    if(grader == null){
      grader = new Grader();
    }
    return grader;
  }

  public void add(Submission s)
  {
    queue.add(s);
  }

  public Submission process()
  {
    return (Submission) queue.poll();
  }

  public Queue get(){
    return queue;
  }
}
