package com.modulo.base.modules.Auth.modules.Token.infra.frameworks.spring;

import com.modulo.base.modules.Auth.modules.Token.application.create.CreateTokenUseCase;
import com.modulo.base.modules.Auth.modules.Token.application.create.DefaultCreateTokenUseCase;
import com.modulo.base.modules.Auth.modules.Token.application.update.DefaultUpdateTokenUseCase;
import com.modulo.base.modules.Auth.modules.Token.application.update.UpdateTokenUseCase;
import com.modulo.base.modules.Auth.modules.Token.domain.TokenGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class TokenUseCaseConfig {
    private final TokenGateway tokenGateway;

    public TokenUseCaseConfig(final TokenGateway tokenGateway) {
        this.tokenGateway = Objects.requireNonNull(tokenGateway);
    }

    @Bean
    public CreateTokenUseCase createTokenUseCase() {
        return new DefaultCreateTokenUseCase(tokenGateway);
    }

    @Bean
    public UpdateTokenUseCase updateTokenUseCase() {
        return new DefaultUpdateTokenUseCase(tokenGateway);
    }
}
