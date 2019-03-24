package com.frost.house.support.interfaces;

/**
 * The contract for electric power.
 */
public interface Electricity {

    /**
     * @return - the amperage
     */
    float getAmperage();

    /**
     * @return - the power
     */
    float getPower();

    /**
     * @return - the voltage
     */
    float getVoltage();
}
