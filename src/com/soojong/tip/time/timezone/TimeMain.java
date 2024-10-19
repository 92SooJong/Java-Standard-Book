package com.soojong.tip.time.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TimeMain {

    public static void main(String[] args) {

//        printAlarmStatus("ko");
//        printAlarmStatus("jp");
//        printAlarmStatus("sg");
//        printAlarmStatus("us");

//        LocalDateTime jp = TimeConverter.get6clockOfUTC(CountryEnum.JAPAN);
//        LocalDateTime us = TimeConverter.get6clockOfUTC(CountryEnum.UNITED_STATE);
//
//        List<LocalDateTime> collect = List.of(jp, us).stream()
//            .sorted((wishGoodsVO1, wishGoodsVO2) -> wishGoodsVO2.compareTo(wishGoodsVO1))
//            .collect(Collectors.toList());
//
//        System.out.println(collect);

//        System.out.println(TimeConverter.get6clockOfUTC(CountryEnum.JAPAN));
//        System.out.println(TimeConverter.get6clockOfUTC(CountryEnum.KOREA));
//        System.out.println(TimeConverter.get6clockOfUTC(CountryEnum.UNITED_STATE));

        // Record the start time
        long startTime = System.currentTimeMillis();

        // Perform some task or operation
        performTask();

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate the elapsed time in milliseconds
        long elapsedTimeInMillis = endTime - startTime;

        // Convert milliseconds to seconds
        double elapsedTimeInSeconds = elapsedTimeInMillis / 1000.0;

        // Check if elapsed time is greater than 1 second
        if (elapsedTimeInMillis > 1000) {
            System.out.println("Elapsed Time: " + elapsedTimeInMillis + " seconds");
        }

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

    // Method representing some task or operation
    public static void performTask() {
        // Example task: Sleep for 3 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
