package my_spring;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min=3,max = 5)
    private int repeat;

    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVvvvvvvvvvvvvv");
        }
    }
}
