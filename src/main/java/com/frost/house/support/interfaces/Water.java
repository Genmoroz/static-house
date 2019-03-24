package com.frost.house.support.interfaces;

public interface Water {

    /**
     * @return - the quality, facility of Quality
     */
    Quality getQuality();

    enum Quality {
        LOW("Low quality"),
        MEDIUM("Medium quality"),
        HIGH("High quality");

        private String quality;

        Quality(String quality) {
            this.quality = quality;
        }

        public String getQuality() {
            return quality;
        }

        @Override
        public String toString() {
            return getQuality();
        }
    }
}