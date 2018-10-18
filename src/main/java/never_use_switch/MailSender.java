package never_use_switch;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MailSender {
    private final MailDao mailDao;

    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        int mailCode = mailDao.getMailCode();
        if (mailCode == 1) {
            //50 lines of code
            System.out.println("Welcome mail was sent");
        } else if(mailCode==2) {
            System.out.println("email callback sent");
            //80 lines of code
        }
    }
}




