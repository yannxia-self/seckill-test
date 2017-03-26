package info.yannxia.java.test.seckill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SeckillApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SeckillApplication.class, args);
    }
}
