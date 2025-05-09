import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rocket extends Actor
{
    public Rocket() {
        setImage("rocket.png");
    }
    private int z = 4;
    public void act(){
        move(z);
    
        if(getX() >= 590) {  // when it passes 600
        resetRocket();
        }
        
        if(isTouching(Wompwomp.class)) {
            Wompwomp womp = (Wompwomp)getOneIntersectingObject(Wompwomp.class);
            
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(womp);
            getWorld().removeObject(this);
        }
    }
    
    public void resetRocket(){
        setLocation(50, 200);
    }
}
