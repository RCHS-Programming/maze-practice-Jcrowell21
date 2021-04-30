import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author Jeremy 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{
    /**
     * Constructor for objects of class MazeWorld.
     * 
     */

    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 12);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 12, 25 + 50*i);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 587);
        }
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 787, 12 + 50*i);
        }
        //Partial wall in the top left of the maze
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 150);
        }
        //Partial wall in the top of the maze
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge2.png"), 550, 12 + 50*i);
        }
        //Partial wall in the bottom right of the maze
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 500 + 50*i, 500);
        }
        //Partial wall in the top right of the maze
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 580 + 50*i, 210);
        }
                //Partial wall in the top of the maze
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge2.png"), 100, 400 + 50*i);
        }
    }
}
