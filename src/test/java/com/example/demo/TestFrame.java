package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFrame {
    @Test
    void UltimateEasyFrameTest(){
        Frame frame = new Frame();
        frame.setKast(1);
        assertTrue(frame.getKast()==1);
    }
}
