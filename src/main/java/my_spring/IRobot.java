package my_spring;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    private Speaker speaker = new ConsoleSpeaker();
    private Cleaner cleaner = new CleanerImpl();


    public void clean(){


        speaker.speak("Начал работать");
        cleaner.clean();
        speaker.speak("Закончил работать");
    }
}
