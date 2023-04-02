package org.example;

import java.util.ArrayList;

public class Store {
    private ArrayList<String> pickers;
    private String pickingStartTime;
    private String pickingEndTime;

    public Store() {
    }

    public Store(ArrayList<String> pickers, String pickingStartTime, String pickingEndTime) {
        this.pickers = pickers;
        this.pickingStartTime = pickingStartTime;
        this.pickingEndTime = pickingEndTime;
    }

    public ArrayList<String> getPickers() {
        return pickers;
    }

    public void setPickers(ArrayList<String> pickers) {
        this.pickers = pickers;
    }

    public String getPickingStartTime() {
        return pickingStartTime;
    }

    public void setPickingStartTime(String pickingStartTime) {
        this.pickingStartTime = pickingStartTime;
    }

    public String getPickingEndTime() {
        return pickingEndTime;
    }

    public void setPickingEndTime(String pickingEndTime) {
        this.pickingEndTime = pickingEndTime;
    }

    @Override
    public String toString() {
        return "Store{" +
                "pickers=" + pickers +
                ", pickingStartTime='" + pickingStartTime + '\'' +
                ", pickingEndTime='" + pickingEndTime + '\'' +
                '}';
    }
}
