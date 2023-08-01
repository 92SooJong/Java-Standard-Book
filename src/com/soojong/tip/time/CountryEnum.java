package com.soojong.tip.time;

import java.util.Arrays;

public enum CountryEnum {

    KOREA("ko", "Asia/Seoul", TimePeriod.from(23,0,2,40)),
    SINGAPORE("sg", "Asia/Singapore", TimePeriod.from(18,0,0,30))
    ;

    private final String countryCode;
    private final String timeZone;
    private final TimePeriod timePeriod;

    CountryEnum(String countryCode, String timeZone, TimePeriod timePeriod) {
        this.countryCode = countryCode;
        this.timeZone = timeZone;
        this.timePeriod = timePeriod;
    }

    public static CountryEnum findByCode(String countryCode) {

        return Arrays.stream(CountryEnum.values())
            .filter(countryEnum -> countryEnum.countryCode.equalsIgnoreCase(countryCode))
            .findFirst()
            .orElse(null);
    }

    public String getTimeZone() {
        return timeZone;
    }

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }
}
