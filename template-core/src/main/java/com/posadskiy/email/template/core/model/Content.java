package com.posadskiy.email.template.core.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Introspected
public record Content(String name, String header, String text, Button button) {
}
