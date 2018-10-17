package my_spring;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface Config {
    <T> Class<T> getImplClass(Class<T> type);
    List<String> packagesToScan();
}
