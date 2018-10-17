package quoters;

import lombok.Setter;
import my_spring.InjectRandomInt;

/**
 * @author Evgeny Borisov
 */
@Setter
public class ShakespearQuoter implements Quoter {
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
