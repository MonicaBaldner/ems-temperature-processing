package com.algaworks.algasensors.ems_temperature_processing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7(){

        UUID uuid1 = IdGenerator.generateTimeBasedUUID();
        UUID uuid2 = IdGenerator.generateTimeBasedUUID();
        UUID uuid3 = IdGenerator.generateTimeBasedUUID();
        UUID uuid4 = IdGenerator.generateTimeBasedUUID();

        System.out.println("UUID1 " + uuid1);
        System.out.println("UUID2 " + uuid2);
        System.out.println("UUID3 " + uuid3);
        System.out.println("UUID4 " + uuid4);

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid1).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidDateTime).isEqualTo(currentDateTime);
       // Assertions.assertThat(uuidDateTime).isNotEqualTo(currentDateTime);

    }

}
