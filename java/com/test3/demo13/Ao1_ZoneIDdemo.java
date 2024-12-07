package com.test3.demo13;

import java.time.ZoneId;
import java.util.Set;

public class Ao1_ZoneIDdemo {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        System.out.println(availableZoneIds.size());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);


        ZoneId of = ZoneId.of("America/Cuiaba");
        System.out.println(of);
    }
}
