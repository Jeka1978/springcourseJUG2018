package quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import quoters.bfpp.BeanDefinitionAnalyzerBeanFactoryPostProcessor;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
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
