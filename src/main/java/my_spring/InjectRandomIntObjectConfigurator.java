package my_spring;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomIntObjectConfigurator implements ObjectConfigurator {
    private DataFactory dataFactory = new DataFactory();

    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Set<Field> allFields = ReflectionUtils.getAllFields(type);
        for (Field field : allFields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int value = dataFactory.getNumberBetween(min, max);
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
