import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
/**
 * Write a description of class MedivalWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedivalWorld extends World
{
    private LinkedList <Person> people;
    private LinkedList <Building> buildings;
    private short time, year;
    /**
     * Constructor for objects of class MedivalWorld.
     * 
     */
    public MedivalWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 640, 1); 
    }

    private void spawnPopulation(){
    }

    private void setup(){
    }
    
    private void plague (){
        //to kill of civilians once ina  while
    }
}
