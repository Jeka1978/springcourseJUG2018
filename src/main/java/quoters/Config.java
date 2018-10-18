package quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import quoters.bfpp.BeanDefinitionAnalyzerBeanFactoryPostProcessor;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
@EnableAspectJAutoProxy
public class Config {


   @Bean
   public Integer i(){
       return 2;
   }


    @Bean(name = "abc")
    public static BeanDefinitionAnalyzerBeanFactoryPostProcessor configurer() {
        return new BeanDefinitionAnalyzerBeanFactoryPostProcessor();
    }
}



