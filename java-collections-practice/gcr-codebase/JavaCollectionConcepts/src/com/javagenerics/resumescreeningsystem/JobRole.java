package com.javagenerics.resumescreeningsystem;

abstract class JobRole {

    protected String roleName;

    public abstract int minimumExperience();
    public abstract String requiredSkills();
    public String getRoleName() {
        return roleName;
    }
}

