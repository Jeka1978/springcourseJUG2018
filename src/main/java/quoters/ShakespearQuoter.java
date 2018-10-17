package quoters;

import my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static quoters.MediaTypeEnum.BOOK;

/**
 * @author Evgeny Borisov
 */
@MediaType(BOOK)
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
    private String message;
    @InjectRandomInt(min = 2, max = 6)
    private int repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
