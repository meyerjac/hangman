import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void newGame_GameStart_false() {
    Hangman testGame = new Hangman();
    assertEquals(true, testGame instanceof Hangman);
  }

  @Test
  public void GameStart_getWord_tiger() {
    Hangman testGame = new Hangman();
    assertEquals(testGame.getword);
  }
}
