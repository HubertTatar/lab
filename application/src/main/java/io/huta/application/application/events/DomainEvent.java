package io.huta.application.application.events;

import java.time.Instant;

public interface DomainEvent {

    Instant occuredAt();

}
