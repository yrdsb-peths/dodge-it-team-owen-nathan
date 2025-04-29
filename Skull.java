import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Skull extends Actor
{
    public Skull() {
        setImage("skull.png");
    }
    public void act()
    {
        setLocation(getX(), getY() + 3);
        if(getY() <= 100) {
            setLocation(300, 100);
        }
    }
}


