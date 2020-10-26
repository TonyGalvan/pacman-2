import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Phantom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phantom extends Person 
{
    private PhantomState phantomState;
    protected CharacterDirection direction;
    
    //private int movePhantom;
    private int moveX;
    private int moveY;

    
    
    public Phantom()
    {
        phantomState = PhantomState.NORMAL;
        direction = CharacterDirection.getRandomDirection();
    }
    
    public void act() 
    {
        setLocation(getX() + moveX, getY() + moveY);

        if( checkCollisions()){
            direction = CharacterDirection.getRandomDirection();
        } 
        
        movePhantom();
    }
    

    
    void movePhantom()
    {
        moveX = 0;
        moveY = 0;
        
        switch(direction)
        {
            case UP:
            moveY = -1;
            break;
            
            case DOWN:
            moveY = 1;
            break;
            
            case LEFT:
            moveX = -1;
            break;
            
            case RIGHT:
            moveX = 1;
            break;
        }
    }
    
    boolean checkCollisions()
    {
        Wall walls = null;
        
        switch(direction)
        {
             case UP:
            walls = (Wall)getOneObjectAtOffset(0, -40, Wall.class);
            break;
            case DOWN:
            walls = (Wall)getOneObjectAtOffset(0, 40, Wall.class);
            break;
            case RIGHT:
            walls = (Wall)getOneObjectAtOffset(40, 0, Wall.class);
            break;
            case LEFT:
            walls = (Wall)getOneObjectAtOffset(-40, 0, Wall.class);
            break;
        }
        
        return walls != null;
    
    }
}