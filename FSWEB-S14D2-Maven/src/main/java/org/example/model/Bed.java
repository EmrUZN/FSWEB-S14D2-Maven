package org.example.model;

public class Bed {
  private String style;
  private int pillows;
  private int height;
  private int sheets;
  private int quilts;

    public Bed(String style, int quilts, int sheets, int height, int pillows) {
        this.style = style;
        this.quilts = quilts;
        this.sheets = sheets;
        this.height = height;
        this.pillows = pillows;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilts=" + quilts +
                '}';
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getQuilt() {
        return quilts;
    }

    public void setQuilt(int quilt) {
        this.quilts = quilt;
    }
}
