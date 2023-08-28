package com.soojong.tip.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeMain {

    public static void main(String[] args) {

//        printAlarmStatus("ko");
//        printAlarmStatus("jp");
//        printAlarmStatus("sg");
//        printAlarmStatus("us");

        System.out.println(TimeConverter.get6clockOfUTC(CountryEnum.JAPAN));
        System.out.println(TimeConverter.get6clockOfUTC(CountryEnum.KOREA));
        System.out.println(TimeConverter.get6clockOfUTC(CountryEnum.UNITED_STATE));
    }

    public static void printAlarmStatus(String countryCode) {

        CountryEnum countryEnum = CountryEnum.findByCode(countryCode);

        ZoneId zoneId = ZoneId.of(countryEnum.getTimeZone());
        LocalDateTime localDateTime = LocalDateTime.now(zoneId).withHour(18).withMinute(0);



        System.out.printf("Not allowed time range for alarm in %s is %s\n", zoneId.getId(), countryEnum.getNotAllowedAlramTimePeriod().toString());
        System.out.printf("Current time in %s is %s\n", zoneId.getId(), localDateTime);
        System.out.printf("Is Alarm allowed? : %s\n", !countryEnum.getNotAllowedAlramTimePeriod().isBetween(localDateTime));
        System.out.println("================================================================================================");

    }




}
