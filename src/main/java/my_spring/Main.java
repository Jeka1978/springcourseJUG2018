package my_spring;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
//       ObjectFactory.getInstance().createObject(IRobot.class).clean();
        JugRuService jugRuService = ObjectFactory.getInstance().createObject(JugRuService.class);
        jugRuService.conference();
        jugRuService.afterParty();
    }
}
