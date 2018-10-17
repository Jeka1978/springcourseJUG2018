package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass());
    }

    public void clean() {
        speaker.speak("Начал работать");
        cleaner.clean();
        speaker.speak("Закончил работать");
    }
}
