package behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {

    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

    public static void main(String[] args) {

        //level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();
        //level to publish at
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging"); //This one won't print
        logger.finer("Finer level, < finest");
        logger.fine("Fine level, < finer < finest");

    }
}
