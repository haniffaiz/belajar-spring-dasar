package programmerzamannow.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import programmerzamannow.spring.core.data.Foo;

@Slf4j
@Configuration
public class ScopeConfiguration {
    @Bean
    @Scope("prototype") //penentu scope default singleton
    public Foo foo(){
        log.info("");
        return new Foo();
    }
}