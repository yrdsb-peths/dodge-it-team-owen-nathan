import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Score extends Actor
{
    private int score = 0;

    public Score() {
        updateImage();
    }

    public void addScore(int amount) {
        score += amount;
        updateImage();
    }

    private void updateImage() {
        setImage(new GreenfootImage("Score: " + score, 24, Color.BLACK, Color.WHITE));
    }
    
        public int getScore() {
        return score;
    }
}