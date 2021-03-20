package io.github.zhdanok.bean;

import java.util.Objects;

public class Tv {

    private int currentChannel;
    private int currentVolume;
    private String producer;
    private boolean switchedOn;

    public Tv() {
    }

    public Tv(int currentChannel, int currentVolume, boolean switchedOn) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.switchedOn = switchedOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentVolume == tv.currentVolume && switchedOn == tv.switchedOn && Objects.equals(currentChannel, tv.currentChannel) && Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, producer, switchedOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel='" + currentChannel + '\'' +
                ", currentVolume=" + currentVolume +
                ", producer='" + producer + '\'' +
                ", switchedOn=" + switchedOn +
                '}';
    }
}
