package my_spring;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//       ObjectFactory.getInstance().createObject(IRobot.class).clean();

        JugRuServiceImpl jugRuService = ObjectFactory.getInstance().createObject(JugRuServiceImpl.class);
        jugRuService.conference();
        jugRuService.afterParty();
        System.out.println(jugRuService.getClass());
    }
}
