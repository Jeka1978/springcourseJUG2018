package profiles_example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(basePackages = "profiles_example.common")
@ComponentScan(basePackages = "profiles_example.conf")
public class MainConf {

}
