package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */

@Component
public class TalkingRobotImpl implements TalkingRobot {

    @Autowired
    private List<Quoter> quoters = Arrays.asList(() -> System.out.println("THis is default"));

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }

}
