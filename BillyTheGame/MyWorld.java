// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 4) {
            addObject( new Bread(), 1, Greenfoot.getRandomNumber(400));
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Billy billy =  new Billy();
        addObject(billy, 151, 332);
        Bread bread =  new Bread();
        addObject(bread, 338, 95);
        Bread bread2 =  new Bread();
        addObject(bread2, 134, 124);
    }
}
