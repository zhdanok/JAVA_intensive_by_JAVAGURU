package io.github.zhdanok.service;

import io.github.zhdanok.bean.Tv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TvService {

    Logger logger = LoggerFactory.getLogger(TvService.class);

    public TvService() {
    }

    public void switchForward(Tv tv) {
        if (tv.isSwitchedOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        } else {
            adviseToTurnOnTheTV();
        }
    }


    public void switchBack(Tv tv) {
        if ((tv.isSwitchedOn()) && (tv.getCurrentChannel() > 0)) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        } else {
            adviseToTurnOnTheTV();
        }
    }

    public void increaseTheVolume(Tv tv) {
        if (tv.isSwitchedOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        } else {
            adviseToTurnOnTheTV();
        }
    }

    public void decreaseTheVolume(Tv tv) {
        if ((tv.isSwitchedOn()) && (tv.getCurrentVolume() > 0)) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        } else {
            adviseToTurnOnTheTV();
        }
    }

    public void switchOn(Tv tv) {
        tv.setSwitchedOn(true);
    }

    public void switchOff(Tv tv) {
        tv.setSwitchedOn(false);
    }

    public void adviseToTurnOnTheTV() {
        logger.info("Turn on the TV");
    }
}
