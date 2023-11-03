package com.soojong.tip.time.timezone;

import java.util.Arrays;

public enum CountryEnum {

    KOREA("ko","Asia/Seoul", TimePeriod.from(23,0,2,40)),
    JAPAN("jp", "Asia/Tokyo", TimePeriod.from(18,0,0,30)),
    SINGAPORE("sg", "Asia/Singapore", TimePeriod.from(18,0,0,30)),
    UNITED_STATE("us", "America/New_York", TimePeriod.from(18,0,0,30)),
    ;

    private final String countryCode;
    private final String timeZone;
    private final TimePeriod notAllowedAlramTimePeriod;

    CountryEnum(String countryCode, String timeZone, TimePeriod notAllowedAlramTimePeriod) {
        this.countryCode = countryCode;
        this.timeZone = timeZone;
        this.notAllowedAlramTimePeriod = notAllowedAlramTimePeriod;
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

    public TimePeriod getNotAllowedAlramTimePeriod() {
        return notAllowedAlramTimePeriod;
    }
}
