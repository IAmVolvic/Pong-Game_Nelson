import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceStars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceStars extends Actor
{
    int x = Greenfoot.getRandomNumber(499)+1;
    int y = Greenfoot.getRandomNumber(699)+1;
        
    public SpaceStars(){
        GreenfootImage image = new GreenfootImage(70, 70);
        image.setColor(Color.WHITE);
        image.drawOval(30, 30, 2, 2);
        image.fillOval(30, 30, 2, 2);
        this.setImage(image);
    }
    public void act()
    {
        turnTowards(x, y);
        move(2);
    }
}
