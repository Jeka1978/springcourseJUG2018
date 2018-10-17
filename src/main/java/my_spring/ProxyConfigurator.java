package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface ProxyConfigurator {
    Object wrapWithPoxy(Object t, Class type);
}
