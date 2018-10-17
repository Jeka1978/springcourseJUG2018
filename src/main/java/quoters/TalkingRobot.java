package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobot {


    @Setter
    private List<Quoter> quoters;

    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }

}
