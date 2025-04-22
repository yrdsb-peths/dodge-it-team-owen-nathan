import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocket extends Actor
{
    private int z = 3;
    public void act(){
        move(z);
    
        if(getX() >= 590) {  // when it passes 600
        resetRocket();
        }
    }
    
    public void resetRocket(){
        setLocation(50, 200);
    }
}
