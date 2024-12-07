package com.test3.demo13;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AInstantDemo {
    public static void main(String[] args) {
        Instant now = Instant.now();

        ZonedDateTime zonedDateTime = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}
