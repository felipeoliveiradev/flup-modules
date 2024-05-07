package com.modulo.base.modules.Auth.modules.Token.application.create;

import com.modulo.base.modules.Flup.system.required.helpers.UseCase;
import com.modulo.base.modules.Flup.system.validation.handlers.Notification;
import io.vavr.control.Either;

public abstract class CreateTokenUseCase extends UseCase<CreateTokenCommand, Either<Notification, CreateTokenOutput>> {

}
