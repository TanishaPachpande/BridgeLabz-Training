package com.traincompanion;

public class Main {
    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("C1", false, false);
        train.addCompartment("C2", true, false);
        train.addCompartment("C3", false, true);
        train.addCompartment("C4", false, false);

        train.traverseForward();
        train.traverseBackward();

        train.showAdjacent("C3");

        train.removeCompartment("C2");
        train.traverseForward();
    }
}


