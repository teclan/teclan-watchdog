package teclan.wathdog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages="teclan.wathdog",exclude = DataSourceAutoConfiguration.class)
@MapperScan("teclan.springboot.dao")
public class Main {
	public static void main(String[] args) {
		 SpringApplication.run(Main.class, args);
	}
}
