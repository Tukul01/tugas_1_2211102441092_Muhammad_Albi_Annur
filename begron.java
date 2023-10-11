import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class begron here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class begron extends World
{
    
    /**
     * Constructor for objects of class begron.
     * 
     */
    public begron()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1); 
        prepare();
    }
    public void act()
    {
        {
            addmusuh1();
            addmusuh2();
        }
    }
    public void addmusuh1()
    {
        if(Greenfoot.getRandomNumber(120)<1)
        {
        addObject(new musuh1(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void addmusuh2()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
        addObject(new rumah(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        palyer palyer = new palyer();
        addObject(palyer,295,544);
        palyer.setLocation(270,491);
    }
}
