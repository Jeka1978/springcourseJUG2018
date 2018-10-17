package my_spring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {
    private Map<Class, Class> interface2Class = new HashMap<>();

    public JavaConfig() {
        interface2Class.put(Speaker.class, ConsoleSpeaker.class);
        interface2Class.put(Cleaner.class, CleanerImpl.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return interface2Class.get(type);
    }
}





