import java.util.Random;


public class Hangman {
  private String[] wordArray = {"tiger", "lion", "lynx"};
  private String word;
  private int arrayPos=0;

  public Hangman () {
    Random myRandomGenerator = new Random();
    arrayPos = myRandomGenerator.nextInt(3);
    word = wordArray[arrayPos];

  }

  public String getword() {
      return word;
    }
  }
