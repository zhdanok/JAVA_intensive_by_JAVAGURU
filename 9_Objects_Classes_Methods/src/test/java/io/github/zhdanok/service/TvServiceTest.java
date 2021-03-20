package io.github.zhdanok.service;

import io.github.zhdanok.bean.Tv;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvServiceTest {

    TvService tvService;
    Tv tv;

    @BeforeEach
    void setUp() {
        tv = new Tv();
        tvService = new TvService();
    }

    @Test
    void switchForwardTestPositive() {
        tvService.switchOn(tv);
        tv.setCurrentChannel(5);
        tvService.switchForward(tv);
        assertEquals(6, tv.getCurrentChannel());

    }

    @Test
    void switchForwardTestNegative() {
        tvService.switchOff(tv);
        tv.setCurrentChannel(5);
        tvService.switchForward(tv);
        assertEquals(5, tv.getCurrentChannel());

    }

    @Test
    void switchBackTestPositive() {
        tvService.switchOn(tv);
        tv.setCurrentChannel(5);
        tvService.switchBack(tv);
        assertEquals(4, tv.getCurrentChannel());

    }

    @Test
    void switchBackTestNegative() {
        tvService.switchOff(tv);
        tv.setCurrentChannel(5);
        tvService.switchBack(tv);
        assertEquals(5, tv.getCurrentChannel());

    }

    @Test
    void increaseTheVolumeTestPositive() {
        tvService.switchOn(tv);
        tv.setCurrentVolume(5);
        tvService.increaseTheVolume(tv);
        assertEquals(6, tv.getCurrentVolume());

    }

    @Test
    void increaseTheVolumeTestNegative() {
        tvService.switchOff(tv);
        tv.setCurrentVolume(5);
        tvService.increaseTheVolume(tv);
        assertEquals(5, tv.getCurrentVolume());

    }

    @Test
    void decreaseTheVolumeTestPositive() {
        tvService.switchOn(tv);
        tv.setCurrentVolume(5);
        tvService.decreaseTheVolume(tv);
        assertEquals(4, tv.getCurrentVolume());

    }

    @Test
    void decreaseTheVolumeTestNegative() {
        tvService.switchOff(tv);
        tv.setCurrentVolume(5);
        tvService.decreaseTheVolume(tv);
        assertEquals(5, tv.getCurrentVolume());

    }

    @Test
    void switchOnTest() {
        tvService.switchOn(tv);
        assertTrue(tv.isSwitchedOn());
    }

    @Test
    void switchOffTest() {
        tvService.switchOff(tv);
        assertFalse(tv.isSwitchedOn());
    }

}