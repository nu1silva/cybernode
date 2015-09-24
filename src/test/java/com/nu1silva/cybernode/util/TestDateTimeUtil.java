package com.nu1silva.cybernode.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateTimeUtil {

    DateTimeUtil dateTimeUtil = new DateTimeUtil();

    @Test(testName = "Current Timestamp Test")
    void testGetCurrentTimestamp() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();

        String currentTimestamp = dateTimeUtil.getCurrentTimestamp();
        Assert.assertEquals(currentTimestamp, dateFormat.format(date), "Timestamps don't match");
    }
}
