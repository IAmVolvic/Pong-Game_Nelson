import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;
    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld(boolean gameStarted)
    {    
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        if (gameStarted)
        {
            GreenfootImage background = getBackground();
            background.setColor(Color.BLACK);
            background.fill(); //added
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            addingSpaceStars();
            addObject(new GameOverText(), 250, 657);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }
    
    
    private void addingSpaceStars(){
        
        for (int i = 0; i < 300; i++){
            int newX = Greenfoot.getRandomNumber(500);
            int newY = Greenfoot.getRandomNumber(700);
            addObject(new SpaceStars(), newX, newY);
        }
        
    }
}
