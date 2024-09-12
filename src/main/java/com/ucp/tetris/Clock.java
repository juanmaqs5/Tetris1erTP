package com.ucp.tetris;

public class Clock {
    public int tick = -1;

    public Clock(){
    
    }
    
    public void tick(){
        tick = tick + 1;
    }
}
