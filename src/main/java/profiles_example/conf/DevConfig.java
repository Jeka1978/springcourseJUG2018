package profiles_example.conf;

import org.springframework.context.annotation.*;
import quoters.aop.QuoterAspect;

/**
 * @author Evgeny Borisov
 */
@Configuration
@Profile("DEV")
@ComponentScan(basePackages = "profiles_example.prod")
@PropertySource("classpath:prod.properties")
@EnableAspectJAutoProxy
public class DevConfig {
    @Bean
    public QuoterAspect aspect(){
        return new QuoterAspect();
    }

}
