package priv.lwj.thinker.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("priv.lwj.thinker.test.mapper")
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        System.out.println("启动成功");
    }

}
