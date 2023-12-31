import greenfoot.*;


/**
 * The Ping World is where Balls and Paddles meet to play pong.
 * 
 * @author The teachers 
 * @version 1
 */
public class PingWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;

    /**
     * Constructor for objects of class PingWorld.
     */
    public PingWorld(boolean gameStarted)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        if (gameStarted)
        {
            GreenfootImage background = getBackground();
            background.setColor(Color.BLACK);
            background.fill(); //added
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            addObject(new Ball(), WORLD_WIDTH/2, WORLD_HEIGHT/2);
            addObject(new Paddle(100,20), 60, WORLD_HEIGHT - 50);
            addObject(new EnemyPaddle(100,20), Greenfoot.getRandomNumber(350)+50, Greenfoot.getRandomNumber(240)+0);
            addingSpaceStars();
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
