package com.soojong.tip.time;

import java.time.LocalDateTime;
import java.time.Period;

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

            LocalDateTime startLocalDateTime = currentLocalDateTime.minusDays(1).withHour(startHour).withMinute(startMinute);
            LocalDateTime endLocalDateTime = currentLocalDateTime.withHour(endHour).withMinute(endMinute);

            return currentLocalDateTime.isAfter(startLocalDateTime) && currentLocalDateTime.isBefore(endLocalDateTime);

        } else { // 다음 날로 넘어가지 않는 경우

            LocalDateTime startLocalDateTime = currentLocalDateTime.withHour(startHour).withMinute(startMinute);
            LocalDateTime endLocalDateTime = currentLocalDateTime.withHour(endHour).withMinute(endMinute);

            return currentLocalDateTime.isAfter(startLocalDateTime) && currentLocalDateTime.isBefore(endLocalDateTime);
        }

    }

    public boolean isBetweenOld(LocalDateTime currentLocalDateTime) {


        // 22시 ~ 06시 // 다음날로 넘어가야 하므로 06 + 22 = 28 처리
        if(startHour > endHour) { // 다음 날로 넘어가야 하는 경우 처리

            // 현재 시각 : 00시라면 24시로 변환
            int newCurrentHour = currentLocalDateTime.getHour() == 0 ? 24 : currentLocalDateTime.getHour();
            int currentTotalMinute = (newCurrentHour * 60) + currentLocalDateTime.getMinute();

            int newEndHour = endHour + 24; // 종료 시간이 다음날로 넘어가므로 24를 더한다
            int startTotalMinute = (startHour * 60) + startMinute;
            int endTotalMinute = (newEndHour * 60) + endMinute;

            return currentTotalMinute > startTotalMinute && currentTotalMinute < endTotalMinute;
        } else { // 다음 날로 넘어가지 않는 경우

            int currentTotalMinute = (currentLocalDateTime.getHour() * 60) + currentLocalDateTime.getMinute();
            int startTotalMinute = (startHour * 60) + startMinute;
            int endTotalMinute = (endHour * 60) + endMinute;

            return currentTotalMinute > startTotalMinute && currentTotalMinute < endTotalMinute;
        }






    }


}
