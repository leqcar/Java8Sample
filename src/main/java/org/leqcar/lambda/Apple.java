package org.leqcar.lambda;

/**
 * Created by JONGT on 6/12/2016.
 */
public class Apple{

    private String color;
    private Integer weight;

    public Apple(String color) {
        this.color = color;
    }

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    
    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                "weight='" + weight + '\'' +
                '}';
    }

}
