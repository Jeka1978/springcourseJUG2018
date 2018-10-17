package quoters;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public interface TalkingRobot {
    @PostConstruct
    void talk();
}
