package screen.saver;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@ImportResource("classpath:context.xml")
@Import(CommonConfig.class)
public class ScreenConf {


    @Bean
    @Primary
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color randomColor(Random random){
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }



    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenConf.class);
        while (true) {
            context.getBean(ColorFrame.class).move();
            Thread.sleep(80);

        }
    }
}
