package com.annotations;

public class DeprecatedDemo {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // Compiler warning
        api.newFeature();   // Recommended method
    }
}

class LegacyAPI {

    /**
     * @deprecated This method is outdated.
     *             Use newFeature() instead.
     */
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is running");
    }

    public void newFeature() {
        System.out.println("New feature is running");
    }
}

