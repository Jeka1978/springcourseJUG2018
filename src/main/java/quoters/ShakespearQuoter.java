package quoters;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
@Setter
public class ShakespearQuoter implements Quoter {
    private String message;
    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
