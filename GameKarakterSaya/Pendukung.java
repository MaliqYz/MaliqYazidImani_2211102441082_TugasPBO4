import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;


public class Pendukung extends Actor
{
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void end(){
        if(getY() >=588||getY() <=0){
            getWorld().removeObject(this);
        }
    }
    
    public void checkdouble(Actor i){
        if(i!=null){
            getWorld().removeObject(i);
        }
    }
    
    public void move(int speed){
        setLocation(getX(), getY() + speed);
    }
}
