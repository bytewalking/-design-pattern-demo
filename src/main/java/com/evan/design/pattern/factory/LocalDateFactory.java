package com.evan.design.pattern.factory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface LocalDateFactory {

    // 20200202的整数转换为LocalDate
    static LocalDate fromInt(int yyyyMMdd){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        return LocalDate.parse(String.valueOf(yyyyMMdd),formatter);
    }
}
