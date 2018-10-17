package my_spring;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    private Speaker speaker;
    private Cleaner cleaner;


    public void clean() {
        speaker.speak("Начал работать");
        cleaner.clean();
        speaker.speak("Закончил работать");
    }
}
