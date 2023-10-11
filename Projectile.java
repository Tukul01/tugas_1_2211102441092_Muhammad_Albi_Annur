import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       ProjectileMove();
       removeFromWorld();
    }
     public void ProjectileMove()
    { 
        setLocation(getX(),getY() - 5);
    }  
    public void removeFromWorld()
    {
    
        Actor  Musuh = getOneIntersectingObject(musuh.class); 
        if (Musuh != null)
        {
            getWorld().removeObject(Musuh);
            getWorld().removeObject(this);
        }
        else if (getY()==0)
        {
            getWorld().removeObject(this);
        }
    }
}
