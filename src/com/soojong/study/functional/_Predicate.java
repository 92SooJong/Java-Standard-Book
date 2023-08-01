package com.soojong.study.functional;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000098300"));

        System.out.println("=======");

        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000098300"));

        System.out.println("=======");

        System.out.println(isPhoneNumberValidPredicate.and(isContainNumber3).test("09000098300"));
        System.out.println(isPhoneNumberValidPredicate.and(isContainNumber3).test("07000098300"));
        System.out.println(isPhoneNumberValidPredicate.or(isContainNumber3).test("09000098300"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> isContainNumber3 = phoneNumber ->
        phoneNumber.contains("3");


}
