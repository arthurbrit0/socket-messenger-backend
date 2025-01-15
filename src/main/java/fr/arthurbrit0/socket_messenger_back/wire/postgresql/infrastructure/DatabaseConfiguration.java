package fr.arthurbrit0.socket_messenger_back.wire.postgresql.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"fr.arthurbrit0.socket_messenger_back"})
@EnableJpaAuditing
public class DatabaseConfiguration {
}
