import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MobilBiru extends Pendukung
{
    int speed = 3;
    public void act()
    {
        MobilBiru a = new MobilBiru();
        Actor i = getOneIntersectingObject(MobilBiru.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
