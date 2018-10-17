package my_spring;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {
    public void speak(String message) {
        //50 lines of code
        System.out.println(message);
    }
}
