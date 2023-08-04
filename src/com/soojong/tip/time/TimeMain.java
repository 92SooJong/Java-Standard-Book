package com.soojong.tip.time;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeMain {

    public static void main(String[] args) {

        printAlarmStatus("ko");
        printAlarmStatus("jp");
        printAlarmStatus("sg");
        printAlarmStatus("us");

    }

    public static void printAlarmStatus(String countryCode) {

        CountryEnum countryEnum = CountryEnum.findByCode(countryCode);

        ZoneId zoneId = ZoneId.of(countryEnum.getTimeZone());
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);

        System.out.printf("Not allowed time range for alarm in %s is %s\n", zoneId.getId(), countryEnum.getNotAllowedAlramTimePeriod().toString());
        System.out.printf("Current time in %s is %s\n", zoneId.getId(), localDateTime);
        System.out.printf("Is Alarm allowed? : %s\n", !countryEnum.getNotAllowedAlramTimePeriod().isBetween(localDateTime));
        System.out.println("================================================================================================");

    }




}
