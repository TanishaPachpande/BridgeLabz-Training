package com.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TimeOutTest {

	TimeOut taskService = new TimeOut();

    @Test
    @Timeout(2) // seconds
    void testLongRunningTaskTimeout() throws InterruptedException {
        taskService.longRunningTask();
    }

}
