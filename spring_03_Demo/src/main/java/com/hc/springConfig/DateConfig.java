package com.hc.springConfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration //相当于beans
public class DateConfig {

    @Bean("myage")
    public Date getAge(){
        return new Date();
    }

    @Bean("myage1")
    public Date getAge1(){
        return new Date();
    }

//    @Bean("mybirthday")
//    public String getBirthday(Date date){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String birthday = simpleDateFormat.format(date);
//        return birthday;
//    }

    @Bean("mybirthday")
    public String getBirthday(@Qualifier("myage") Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = simpleDateFormat.format(date);
        return birthday;
    }


}
