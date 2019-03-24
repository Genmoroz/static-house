package com.frost.house.support.interfaces;

/**
 * The contract for all electrical devices
 */
public interface AbstractElectrical {

    /**
     * The invoking of this method will switch the electrical device on
     *
     * @param electricity - the facility of electricity
     * @return - true if the switching the device on was successfully, false if failed
     */
    boolean onElectric(Electricity electricity);

    /**
     * The invoking of this method will switch the electrical device off
     *
     * @return - true if the switching the device off was successfully, false if failed
     */
    boolean offElectric();

    /**
     * @return - true if the device is turned on
     */
    boolean isOnElectric();

    /**
     * @return - the power
     */
    float getPower();
}
