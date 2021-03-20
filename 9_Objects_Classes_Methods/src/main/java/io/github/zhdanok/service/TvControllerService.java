package io.github.zhdanok.service;


import io.github.zhdanok.bean.TvController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TvControllerService {

    Logger logger = LoggerFactory.getLogger(TvControllerService.class);

    public TvControllerService() {
    }


    public void switchOn(TvController tvController) {
        tvController.getTv().setSwitchedOn(true);
    }

    public void switchOff(TvController tvController) {
        tvController.getTv().setSwitchedOn(false);
    }

    public void adviseToTurnOnTheTV() {

        logger.info("Turn on the TV");
    }

    public void switchForward(TvController tvController) {
        if (tvController.getTv().isSwitchedOn()) {
            tvController.getTv().setCurrentChannel(tvController.getTv().getCurrentChannel() + 1);
        } else {
            adviseToTurnOnTheTV();
        }

    }

    public void switchBack(TvController tvController) {
        if ((tvController.getTv().isSwitchedOn()) && (tvController.getTv().getCurrentChannel() > 0)) {
            tvController.getTv().setCurrentChannel(tvController.getTv().getCurrentChannel() - 1);
        } else {
            adviseToTurnOnTheTV();
        }
    }

    public void increaseTheVolume(TvController tvController) {
        if (tvController.getTv().isSwitchedOn()) {
            tvController.getTv().setCurrentVolume(tvController.getTv().getCurrentVolume() + 1);
        } else {
            adviseToTurnOnTheTV();
        }
    }

    public void decreaseTheVolume(TvController tvController) {
        if ((tvController.getTv().isSwitchedOn()) && (tvController.getTv().getCurrentVolume() > 0)) {
            tvController.getTv().setCurrentVolume(tvController.getTv().getCurrentVolume() - 1);
        } else {
            adviseToTurnOnTheTV();
        }
    }
}
