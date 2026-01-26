package com.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@interface BugReport {
    String description();
}

class SoftwareModule {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance slowdown")
    public void processData() {
        System.out.println("Processing data...");
    }
}

public class RepeatableAnnotation {

    public static void main(String[] args) throws Exception {

        Class<SoftwareModule> clazz = SoftwareModule.class;

        Method method = clazz.getDeclaredMethod("processData");

        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        for (BugReport bug : bugReports) {
            System.out.println("Bug: " + bug.description());
        }
    }
}

