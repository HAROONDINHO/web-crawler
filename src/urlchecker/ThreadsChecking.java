package URLChecker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsChecking extends Thread{

    
    String link,text;
    int currentDepth,inputDepth;
    public static Checking validation;
    public ThreadsChecking(int n) {
        validation=new Checking(n);
    }
    public ThreadsChecking(String link, int currentDepth, int inputDepth, String text) {
        this.link = link;
        this.currentDepth = currentDepth;
        this.inputDepth = inputDepth;
        this.text=text;
    }
    @Override
    public void run() {
        try {
            validation.LinkChecking(link, currentDepth, inputDepth);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(ThreadsChecking.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
