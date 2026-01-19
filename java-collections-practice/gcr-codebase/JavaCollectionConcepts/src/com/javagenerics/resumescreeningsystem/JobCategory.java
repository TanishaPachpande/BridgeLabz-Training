package com.javagenerics.resumescreeningsystem;

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        roleName = "Software Engineer";
    }

    @Override
    public int minimumExperience() {
        return 2;
    }

    @Override
    public String requiredSkills() {
        return "Java, DSA, OOPs";
    }
}

class DataScientist extends JobRole {

    public DataScientist() {
        roleName = "Data Scientist";
    }

    @Override
    public int minimumExperience() {
        return 3;
    }

    @Override
    public String requiredSkills() {
        return "Python, ML, Statistics";
    }
}

class ProductManager extends JobRole {

    public ProductManager() {
        roleName = "Product Manager";
    }

    @Override
    public int minimumExperience() {
        return 4;
    }

    @Override
    public String requiredSkills() {
        return "Leadership, Strategy, Communication";
    }
}

