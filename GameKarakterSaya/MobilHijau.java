import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MobilHijau extends Pendukung
{
    int speed = -15;
    public void act()
    {
        MobilHijau a = new MobilHijau();
        Actor i = getOneIntersectingObject(MobilHijau.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
