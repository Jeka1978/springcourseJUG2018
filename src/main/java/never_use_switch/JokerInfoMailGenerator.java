package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class JokerInfoMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "приходите завтра в 9 вечера, будет сюрприз";
    }



}
