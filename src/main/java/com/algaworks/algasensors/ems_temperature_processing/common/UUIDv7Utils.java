package com.algaworks.algasensors.ems_temperature_processing.common;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.UUID;

public class UUIDv7Utils {

    private UUIDv7Utils(){

    }

    public static OffsetDateTime extractOffsetDateTime(UUID uuid){
        if(uuid == null){
            return null;
        }
        long timeStamp = uuid.getMostSignificantBits() >>> 16;

        return OffsetDateTime.ofInstant(Instant.ofEpochMilli(timeStamp), ZoneId.systemDefault());
    }
}

