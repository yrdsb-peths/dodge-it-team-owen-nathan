import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bomb extends Actor
{
    public int y = -10;
    public void act()
    {
        move(y);
        
        if(getX() <= 0){
            MyWorld world = (MyWorld)getWorld();
            world.getScore().addScore(1);
            resetBomb();
            y = -10 - (int) world.getScore().getScore()/5;
        }
        
        if(isTouching(Hero.class)){
            Wompwomp womp = new Wompwomp();
            getWorld().addObject(womp, 300, 200);
            Hero hero = (Hero)getOneIntersectingObject(Hero.class);
            getWorld().removeObject(hero); 
            getWorld().removeObject(this); 
        }
    }
    
    public void resetBomb(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600,100);
        } else{
            setLocation(600,300);
        }
        
    }
}