package com.junit.junit_practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.junit_practice.TimeOut;

class TimeOutTest {

	TimeOut taskService = new TimeOut();

    @Test
    @Timeout(2) // seconds
    void testLongRunningTaskTimeout() throws InterruptedException {
        taskService.longRunningTask();
    }

}
