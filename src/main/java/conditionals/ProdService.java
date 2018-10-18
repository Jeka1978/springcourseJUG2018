package conditionals;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@ConditionalOnProd
@Service
public class ProdService {
    @PostConstruct
    public void init(){
        System.out.println("PROD!!!!!");
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("conditionals");
    }
}
