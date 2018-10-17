package my_spring;

import org.reflections.ReflectionUtils;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithPoxy(Object t, Class type) {
        boolean methodNeedsBenchmark = !ReflectionUtils.getAllMethods(type, method -> method.isAnnotationPresent(Benchmark.class)).isEmpty();
        if (type.isAnnotationPresent(Benchmark.class) || methodNeedsBenchmark) {

            if (type.getInterfaces().length == 0) {
                return Enhancer.create(type, (org.springframework.cglib.proxy.InvocationHandler) (o, method, args) -> {
                    Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                    return invoke(t, type, method, args, classMethod);
                });
            }


            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> {
                Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                return invoke(t, type, method, args, classMethod);
            });
        }
        return t;
    }

    private Object invoke(Object t, Class type, Method method, Object[] args, Method classMethod) throws IllegalAccessException, InvocationTargetException {
        if (classMethod.isAnnotationPresent(Benchmark.class)||type.isAnnotationPresent(Benchmark.class)) {
            System.out.println("***********BENCHMARK**********");
            System.out.println(method.getName() + " is working");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("***********BENCHMARK**********");
            return retVal;
        }
        else {
            return method.invoke(t, args);
        }
    }
}
