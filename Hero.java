import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Hero extends Actor
{
    boolean atTop = true;
    public Hero() {
        setImage("seal.png");
    }
    public void act()
    {
        String key = Greenfoot.getKey();
        if(Greenfoot.mouseClicked(null)){
            atTop = !atTop;
        } else if ("space".equals(key)){
            atTop = !atTop;
        }
        
        if(atTop) {
            setLocation(100, 100);
        } else {
            setLocation(100, 300);
        }
    }
}