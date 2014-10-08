
public class GuessMachine {

    int number, numguess, plyrguess;

    public GuessMachine() {
        number = (int) (Math.random() * 100) + 1;
        numguess = 0;
        plyrguess = 0;
    }

    public boolean CheckGuess(int G) {
        boolean Guess = (G >= 1 && G <= 100);
        if (Guess) {
            plyrguess = G;
            numguess++;
            return true;
        } else {

            return false;
        }
    }

    public String giveHint(String H) {
        if (plyrguess == number) {
            return "you got it";
        } else if (plyrguess >= number) {
            return "too high";
        } else {
            return "too low";
        }

    }

}
