package com.soojong.designpattern.combinator;

import java.time.LocalDate;

public class CombinatorMain {

    public static void main(String[] args) {
        Customer alice = new Customer("Alice",
            "alice@gmail.com",
            "+012319324",
            LocalDate.of(2000, 1, 1));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        boolean valid = validatorService.isValid(alice);
        System.out.println(valid);


    }

}
