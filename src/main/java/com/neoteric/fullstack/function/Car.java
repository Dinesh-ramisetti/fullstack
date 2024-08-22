package com.neoteric.fullstack.function;

public class Car {

    private String modelName;
    private String brandName;

    public Car (String modelName,String brandName) {
        this.modelName = modelName;
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrandName() {
        return brandName;
    }
}
