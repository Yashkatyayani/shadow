package com.alert.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AlertGenerator {

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    private static final List<String> COMMENT_NAME =
            Arrays.asList(
                    "Yash", "Sandeep", "Lokesh", "Harshitha", "Divya",
                    "Harshavardhini", "Teja", "Nikhil", "Ganesh");


    private static final List<String> COMMENT_MESSAGE =
            Arrays.asList(
                    "80-120! Good!",
                    "65-110! Low!",
                    "90-130  High!",
                    "99% spo2  Normal!",
                    "90% spo2 Average!",
                    "80% spo2 Low!",
                    "73 bpm Good!",
                    "103 bpm High!",
                    "45 bpm Low!");

    public static String randomName() {
        return COMMENT_NAME.get(RANDOM.nextInt(COMMENT_NAME.size()));
    }

    public static String randomMessage() {
        return COMMENT_MESSAGE.get(RANDOM.nextInt(COMMENT_MESSAGE.size()));
    }

    public static String getCurrentTimeStamp() {
        return dtf.format(LocalDateTime.now());
    }
}
