package io.github.zhdanok.service;

import io.github.zhdanok.bean.Tv;
import io.github.zhdanok.bean.TvController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvControllerServiceTest {

    TvControllerService tvControllerService;
    TvController tvController;
    Tv tv;
    TvService tvService;

    @BeforeEach
    void setUp() {
        tv = new Tv(5, 5, true);
        tvController = new TvController(tv);
        tvControllerService = new TvControllerService();
        tvService = new TvService();
    }

    @Test
    void switchOnTest() {
        tvControllerService.switchOn(tvController);
        assertTrue(tv.isSwitchedOn());
    }

    @Test
    void switchOffTest() {
        tvControllerService.switchOff(tvController);
        assertFalse(tv.isSwitchedOn());
    }

    @Test
    void switchForwardTestPositive() {
        tvControllerService.switchOn(tvController);
        tvControllerService.switchForward(tvController);
        assertEquals(6, tvController.getTv().getCurrentChannel());

    }

    @Test
    void switchForwardTestNegative() {
        tvControllerService.switchOff(tvController);
        tvControllerService.switchForward(tvController);
        assertEquals(5, tvController.getTv().getCurrentChannel());

    }

    @Test
    void switchBackTestPositive() {
        tvControllerService.switchOn(tvController);
        tvControllerService.switchBack(tvController);
        assertEquals(4, tvController.getTv().getCurrentChannel());

    }

    @Test
    void switchBackTestNegative() {
        tvControllerService.switchOff(tvController);
        tvControllerService.switchBack(tvController);
        assertEquals(5, tvController.getTv().getCurrentChannel());

    }

    @Test
    void increaseTheVolumeTestPositive() {
        tvControllerService.switchOn(tvController);
        tvControllerService.increaseTheVolume(tvController);
        assertEquals(6, tvController.getTv().getCurrentVolume());

    }

    @Test
    void increaseTheVolumeTestNegative() {
        tvControllerService.switchOff(tvController);
        tvControllerService.increaseTheVolume(tvController);
        assertEquals(5, tvController.getTv().getCurrentVolume());

    }

    @Test
    void decreaseTheVolumeTestPositive() {
        tvControllerService.switchOn(tvController);
        tvControllerService.decreaseTheVolume(tvController);
        assertEquals(4, tvController.getTv().getCurrentVolume());

    }

    @Test
    void decreaseTheVolumeTestNegative() {
        tvControllerService.switchOff(tvController);
        tvControllerService.decreaseTheVolume(tvController);
        assertEquals(5, tvController.getTv().getCurrentVolume());

    }

}