import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Bomb extends Actor
{
    private int y = -10;
    private int num;

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
            
            Cloud cloud = new Cloud();
            Explosion boom = new Explosion();
            if(num == 0) {
                getWorld().addObject(cloud, 100, 100);
                getWorld().addObject(boom, 100, 100);
            } else {
                getWorld().addObject(cloud, 100, 300);
                getWorld().addObject(boom, 100, 300);
            }
            
            getWorld().removeObject(hero); 
            getWorld().removeObject(this);
        }
    }
    
    public void resetBomb(){
        num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600,100);
        } else{
            setLocation(600,300);
        }
        
    }
}