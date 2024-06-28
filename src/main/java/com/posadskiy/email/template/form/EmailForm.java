package com.posadskiy.email.template.form;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Introspected
public record EmailForm(String hash, Email email, Recipient recipient, Content content) {
}

