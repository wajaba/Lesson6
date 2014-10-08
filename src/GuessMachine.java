public class GuessMachine {
    int number, numguess,plyrguess;
    
    public GuessMachine(){
    number =0;
    numguess = 0;
    plyrguess = 0;
}
    public double getNumber() {
       return Math.random()*100 +1;
    }
    public boolean CheckGuess(int G) {
        boolean Guess = (G >= 1 && G <= 100);
        if (Guess) {
            plyrguess = G;
            return true;
        } else {

            return false;
        }
    }
}
