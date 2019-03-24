package com.frost.house.support.interfaces;

/**
 * The contract for all sanitary things
 */
public interface AbstractSanitary {

    /**
     * The invoking of this method will turn delivery water on
     *
     * @param water - the facility of water
     * @return - true if the turning delivery water on was successfully, false if failed
     */
    boolean onDeliveryWater(Water water);

    /**
     * The invoking of this method will turn delivery water off
     *
     * @return - true if the turning delivery water off was successfully, false if failed
     */
    boolean offDeliveryWater();

    /**
     * @return - true if the delivery water is turned on
     */
    boolean isOnWater();
}
