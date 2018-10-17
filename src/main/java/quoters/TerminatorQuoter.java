package quoters;


import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@MediaType(MediaTypeEnum.FILM)
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = asList(messages);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    public void killAll(){
        System.out.println("You are terminated...");
    }
}
