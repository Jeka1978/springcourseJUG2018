package aop_examples;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@RequiredArgsConstructor
public final class OrderCreatorImpl implements OrderCreator {
private final OrderService service;

//    @Override
    @EventListener(ContextRefreshedEvent.class)

    public void createOrder() {
        Order order = new Order("Vasya", 2);
        service.processOrder(order);
    }
}
