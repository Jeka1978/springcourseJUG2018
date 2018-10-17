package quoters.bpp;

import my_spring.InjectRandomIntObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomIntAnnotationBeanPotProcessor implements BeanPostProcessor {
    private InjectRandomIntObjectConfigurator configurator = new InjectRandomIntObjectConfigurator();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        configurator.configure(bean);
        return bean;
    }


}
