package com.javagenerics.resumescreeningsystem;

class Resume<T extends JobRole> {

    private String candidateName;
    private int experience;
    private T jobRole;

    public Resume(String candidateName, int experience, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.jobRole = jobRole;
    }

    public boolean isEligible() {
        return experience >= jobRole.minimumExperience();
    }

    public void displayResult() {
        System.out.println("Candidate Name : " + candidateName);
        System.out.println("Job Role       : " + jobRole.getRoleName());
        System.out.println("Experience     : " + experience + " years");
        System.out.println("Status         : " +
                (isEligible() ? "Shortlisted" : "Rejected"));
        System.out.println("-----------------------------------");
    }
}

