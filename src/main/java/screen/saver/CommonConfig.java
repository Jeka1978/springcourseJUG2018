package screen.saver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
public class CommonConfig {
    @Bean
    public Random random(){
        return new Random();
    }
}
