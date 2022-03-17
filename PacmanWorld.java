import greenfoot.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
class PacmanWorld extends World
{
    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;
  
    public PacmanWorld()
    {    
    
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {

        Wall wall = new Wall();
        int widthWall = wall.getImage().getWidth();

        for(int x = 50; x < 550; x+= WIDTH_WALL){
            wall = new Wall();
            addObject(wall,x,30);

            wall = new Wall();
            addObject(wall,x,350);
        }

        for(int y = 58; y < 200; y += HEIGHT_WALL){
            wall = new Wall();
            addObject(wall,50,y);

            wall = new Wall();
            addObject(wall,526,y);
        }

        Banana banana = new Banana();
        addObject(banana,266,274);
        banana.setLocation(280,276);
        banana.setLocation(162,292);
        BigBall bigBall = new BigBall();
        addObject(bigBall,215,125);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,340,180);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,413,127);
        BigBall bigBall4 = new BigBall();
        addObject(bigBall4,319,288);
        BigBall bigBall5 = new BigBall();
        addObject(bigBall5,160,212);
        Cherry cherry = new Cherry();
        addObject(cherry,409,181);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,314,76);
        Strowberry strowberry = new Strowberry();
        addObject(strowberry,487,286);
        Strowberry strowberry2 = new Strowberry();
        addObject(strowberry2,53,264);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,225,216);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,423,291);
        Banana banana2 = new Banana();
        addObject(banana2,448,64);
        Banana banana3 = new Banana();
        addObject(banana3,348,243);
        BigBall bigBall6 = new BigBall();
        addObject(bigBall6,477,189);
        BigBall bigBall7 = new BigBall();
        addObject(bigBall7,108,169);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,280,162);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,179,94);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,237,310);
        Ballon ballon = new Ballon();
        addObject(ballon,281,236);
        
        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);
        
        Pacman pacman = new Pacman(hud);
        addObject(pacman, 100, 80);
    }
}
