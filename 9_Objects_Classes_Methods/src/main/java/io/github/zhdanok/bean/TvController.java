package io.github.zhdanok.bean;

public class TvController {
    private Tv tv;

    public TvController() {
    }

    public TvController(Tv tv) {
        this.tv = tv;
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }
}
