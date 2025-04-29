import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Boat extends Actor
{
    private int x = -2;
    public Boat() {
        setImage("boat01.png");
    }
    public void act()
    {
        move(x);
        if(getX() <= 0) {
            resetBoat();
        }
        
        if(isTouching(Skull.class)) {
            Skull skull = (Skull)getOneIntersectingObject(Skull.class);
            
            Cloud cloud = new Cloud();
            getWorld().addObject(cloud, 300, 375);
            getWorld().removeObject(skull);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBoat() {
        setLocation(550, 375);
    }
}
