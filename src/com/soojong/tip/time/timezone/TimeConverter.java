package com.soojong.tip.time.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeConverter {


    public static LocalDateTime get6clockOfUTC(CountryEnum countryEnum) {


        // 입력으로 받은 국가의 시간을 18시로 세팅한다
        ZoneId zoneId = ZoneId.of(countryEnum.getTimeZone());
        ZonedDateTime zonedDateTime = ZonedDateTime
            .of(LocalDateTime.now(), zoneId)
            .withHour(18)
            .withMinute(0)
            .withSecond(0);

        // 해당 시간을 UTC로 환산한다.
        ZoneId utcZoneId = ZoneId.of(ZoneOffset.UTC.getId());
        LocalDateTime utcLocalDateTime = zonedDateTime.withZoneSameInstant(utcZoneId)
            .toLocalDateTime();

        return utcLocalDateTime;
    }


}
