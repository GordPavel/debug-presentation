package com.github.romankh3.debugpresentation;

/**
 * Class represents flower in programmatically way.
 */
public class HoneyPlant {

    private double nectarCapacity;

    public HoneyPlant(double nectarCapacity) {
        this.nectarCapacity = nectarCapacity;
    }

    public double retrieveNectar(double nectar) {
        double leftNectarCapacity = nectarCapacity - nectar;
        if (leftNectarCapacity <= 0) {
            return 0;
        }
        nectarCapacity = leftNectarCapacity;
        return nectar;
    }
}
