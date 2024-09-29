package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private boolean battery;
    private int globRating;
    private LampType style;

    public Lamp(boolean battery, LampType style, int globRating) {
        this.battery = battery;
        this.style = style;
        this.globRating = globRating;
    }

    public Lamp(LampType lampType, boolean b, int globRating) {
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public LampType getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", globRating=" + globRating +
                ", style=" + style +
                '}';
    }
}
