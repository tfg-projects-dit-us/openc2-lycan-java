package org.oasis.openc2.lycan.types;

public class Feature {
    private FeatureType type;
    private String value;

    public Feature(FeatureType type, String value) {
        this.type = type;
        this.value = value;
    }

    public FeatureType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}