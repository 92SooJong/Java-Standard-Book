package com.soojong.tip.time.timezone;

import java.time.LocalDateTime;

public class TimePeriod {

    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;

    private TimePeriod() {}

    public static TimePeriod from(int startHour, int startMinute, int endHour, int endMinute) {
        TimePeriod timePeriod = new TimePeriod();

        timePeriod.startHour = startHour;
        timePeriod.startMinute = startMinute;
        timePeriod.endHour = endHour;
        timePeriod.endMinute = endMinute;

        return timePeriod;
    }

    public boolean isBetween(LocalDateTime currentLocalDateTime) {


        if (startHour > endHour) { // 다음 날로 넘어가야 하는 경우 처리

            LocalDateTime startLocalDateTime;
            LocalDateTime endLocalDateTime;

            if (currentLocalDateTime.getHour() >= startHour) {
                startLocalDateTime = currentLocalDateTime.withHour(startHour).withMinute(startMinute);
                endLocalDateTime = currentLocalDateTime.plusDays(1).withHour(endHour).withMinute(endMinute); // plus 1일
            } else {
                startLocalDateTime = currentLocalDateTime.minusDays(1).withHour(startHour).withMinute(startMinute); // minus 1일
                endLocalDateTime = currentLocalDateTime.withHour(endHour).withMinute(endMinute);
            }

            return currentLocalDateTime.isAfter(startLocalDateTime) && currentLocalDateTime.isBefore(endLocalDateTime);


        } else { // 다음 날로 넘어가지 않는 경우

            LocalDateTime startLocalDateTime = currentLocalDateTime.withHour(startHour).withMinute(startMinute);
            LocalDateTime endLocalDateTime = currentLocalDateTime.withHour(endHour).withMinute(endMinute);

            return currentLocalDateTime.isAfter(startLocalDateTime) && currentLocalDateTime.isBefore(endLocalDateTime);
        }

    }

    @Override
    public String toString() {

        return this.startHour + ":"+this.startMinute + " ~ " + this.endHour + ":" + this.endMinute;
    }


}
