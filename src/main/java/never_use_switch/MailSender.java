package never_use_switch;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public class MailSender {
    @Autowired
    private MailDao mailDao;

    @Autowired
    private Map<String, MailGenerator> map;


    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        String mailCode = String.valueOf(mailDao.getMailCode());
        MailGenerator mailGenerator = map.getOrDefault(mailCode, () -> {
            throw new RuntimeException(mailCode + " not supported yet");
        });
        String html = mailGenerator.generateMail();
        send(html);

    }

    private void send(String html) {
        System.out.println("sending..." + html);
    }
}










