import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class palyer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class palyer extends Actor
{
    /**
     * Act - do whatever the palyer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public palyer()
    {
        setRotation(270);
    }
    public void act()
    {
        moveAround();
        firelaser();
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
    }
    public void firelaser()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Projectile(),getX(),getY()-30);
        }
    }
}
