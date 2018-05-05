package io.huta.application.application.events;

import java.time.Instant;

public class NewApplication implements DomainEvent {

    private Instant when;

    public NewApplication(Instant when) {
        this.when = when;
    }

    @Override
    public Instant occuredAt() {
        return when;
    }
}
