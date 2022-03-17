import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PacmanHud extends Actor
{
    private int score;
    private int level;
    private int lifes;
    
    public void refresh(){
        getWorld().showText("Nivel: " + level, 100, 30);
        getWorld().showText("Vidas: " + lifes, 250, 30);
        getWorld().showText("Score: " + score, 364, 30);
    }
    
    public void act()
    {
        refresh();
    }
    
    public void setScore(int score){
        this.score = score;
    }
}
