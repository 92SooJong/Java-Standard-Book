package com.soojong.tip.time;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TimeMain {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(isBetween("ko", LocalDateTime.now(zoneId)));


    }

    public static boolean isBetween(String countryCode, LocalDateTime localDateTime) {

        CountryEnum countryEnum = CountryEnum.findByCode(countryCode);

        return countryEnum.getTimePeriod().isBetween(localDateTime);

    }




}
