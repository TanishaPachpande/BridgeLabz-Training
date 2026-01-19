package com.javagenerics.resumescreeningsystem;

import java.util.List;

class ScreeningPipeline {

    public static void processAll(List<? extends JobRole> jobRoles) {

        System.out.println("Processing Job Roles in AI Pipeline:");
        for (JobRole role : jobRoles) {
            System.out.println("- " + role.getRoleName());
        }
        System.out.println("-----------------------------------");
    }
}

