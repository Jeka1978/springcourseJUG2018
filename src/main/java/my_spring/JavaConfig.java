package my_spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {
    private Map<Class, Class> interface2Class = new HashMap<>();

    public JavaConfig() {
        interface2Class.put(Speaker.class, ConsoleSpeaker.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return interface2Class.get(type);
    }

    @Override
    public List<String> packagesToScan() {
        return asList("my_spring");
    }
}





