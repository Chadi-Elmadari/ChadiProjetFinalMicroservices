package ma.tnbmaroc;

import ma.tnbmaroc.security.RsaKeys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeys.class)
public class TnbMarocApplication {

    public static void main(String[] args) {
        SpringApplication.run(TnbMarocApplication.class, args);
    }
  /*
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

   */

}
