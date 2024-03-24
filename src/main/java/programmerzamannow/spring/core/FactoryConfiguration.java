package programmerzamannow.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.factory.PaymentGatewayFactoryBean;

@Configuration
@Import({
        PaymentGatewayFactoryBean.class
})
public class FactoryConfiguration {
}
