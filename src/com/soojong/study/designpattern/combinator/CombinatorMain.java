package com.soojong.study.designpattern.combinator;

import java.time.LocalDate;

import com.soojong.study.designpattern.combinator.CustomerRegistrationValidator.ValidationResult;

public class CombinatorMain {

    public static void main(String[] args) {
        Customer alice = new Customer("Alice",
            "alice@gmail.com",
            "+012319324",
            LocalDate.of(2000, 1, 1));

        // Using Combinator pattern
        ValidationResult result = CustomerRegistrationValidator
            .isEmailValid()
            .and(CustomerRegistrationValidator.isPhoneNumberValid())
            .and(CustomerRegistrationValidator.isAnAdult())
            .apply(alice); // must need "apply"

        if( result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
        System.out.println(result);

//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        boolean valid = validatorService.isValid(alice);
//        System.out.println(valid);


    }

}
