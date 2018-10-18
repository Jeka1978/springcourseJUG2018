package aop_examples;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class EncryptionAspect {

    @SneakyThrows
    @Around("execution(* aop_examples..*.*(Order))")
    public void encrypt(ProceedingJoinPoint pjp) {

        Order order = (Order) pjp.getArgs()[0];
        order.setAmount(order.getAmount()*100);
        pjp.proceed();
    }

}
