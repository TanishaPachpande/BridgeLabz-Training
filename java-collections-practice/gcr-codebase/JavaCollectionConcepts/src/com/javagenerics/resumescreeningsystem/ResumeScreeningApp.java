package com.javagenerics.resumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreeningApp {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Tanisha", 3, new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Amit", 2, new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Riya", 5, new ProductManager());

        ResumeScreeningUtil.screenResume(r1);
        ResumeScreeningUtil.screenResume(r2);
        ResumeScreeningUtil.screenResume(r3);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.processAll(roles);
    }
}

