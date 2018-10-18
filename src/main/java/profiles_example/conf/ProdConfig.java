package profiles_example.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Evgeny Borisov
 */
@Configuration
@Profile("PROD")
@ComponentScan(basePackages = "profiles_example.prod")
@PropertySource("classpath:prod.properties")
public class ProdConfig {

}
