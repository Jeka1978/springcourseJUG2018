package my_spring;

/**
 * @author Evgeny Borisov
 */
public class JugRuServiceImpl implements JugRuService {
    @Override
    public void conference() {
        System.out.println("Joker the BEST!!!");
    }

    @Override
    @Benchmark
    public void afterParty() {
        System.out.println("приходите, будет сюрприз");
    }
}
