package quoters;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Evgeny Borisov
 */
public class IntegerFactory implements FactoryBean<Integer> {
    @Override
    public Integer getObject() throws Exception {
        return 12;
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
