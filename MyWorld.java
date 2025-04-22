import greenfoot.*;

public class MyWorld extends World {
    private Score score;
    public MyWorld() {
        super(600, 400, 1);
        
        Hero seal = new Hero();
        addObject(seal, 100, 100);
        
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);

        score = new Score();
        addObject(score, 100, 30); 
        
        Rocket decor = new Rocket();
        addObject(decor, 50, 200);
        
        Boat boat = new Boat();
        addObject(boat, 550, 375);
    }
    public Score getScore() {
    return score;
    }  
}