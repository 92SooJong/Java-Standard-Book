package com.soojong.study.functional;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());

    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:1234/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
        List.of("jdbc://localhost:1234/users","jdbc://localhost:1234/users");

}
