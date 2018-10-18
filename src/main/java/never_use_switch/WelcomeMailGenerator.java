package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "welcome new client";
    }



}
