package teclan.wathdog.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: SomeCheckServer
 * @Description: TODO
 * @Author: Teclan
 * @Date: 2019/1/9 15:22
 **/

@Component
@Order(value = 0)
public class SomeCheckServer  implements CommandLineRunner {
    private final static Logger LOGGER = LoggerFactory.getLogger(SomeCheckServer.class);

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("看门狗程序自检开始....");
        LOGGER.info("看门狗程序自检结束....");
    }
}
