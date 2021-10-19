// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Billy here.
 * @author (your name) @version (a version number or a date)
 */
public class Billy extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Billy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* Add your action code here.*/
        checkKeypress();
        eatingBread();
    }

    /**
     * //controls of Billy
     */
    public void checkKeypress()
    {
        /* movements of Billy the Duck*/
        if (Greenfoot.isKeyDown("up")) {
            move(6);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-6);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(6);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-6);
        }
    }

    /**
     * //what happens when Billy touches the bread
     */
    public void eatingBread()
    {
        /* eating bread*/
        if (isTouching(Bread.class)) {
            removeTouching(Bread.class);
        }
        /* when counter reaches 0 the game ends*/
    }
}
