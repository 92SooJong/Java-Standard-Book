package com.soojong.study.basic.optional;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
        Optional.ofNullable("soojong@naver.com")
            //.orElseGet(() -> "default value");
            //.orElseThrow(() -> new IllegalStateException("exception"));
            //.ifPresent(email -> System.out.println("Sending email to " + email));
            .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                () -> System.out.println("Cannot send email"));



    }

}
