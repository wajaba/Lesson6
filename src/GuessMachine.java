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
    
}
