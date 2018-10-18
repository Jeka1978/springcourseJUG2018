package aop_examples;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class OrderService {

    public void processOrder(Order order) {
        System.out.println(order+" was handled");
    }

}
