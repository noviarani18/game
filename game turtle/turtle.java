import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       
        move(2);
        if(Greenfoot.isKeyDown("left")){
            turn(-2);
    }    
    if(Greenfoot.isKeyDown("right")){
        turn(2);    
    }
    Actor BANANA = getOneObjectAtOffset(0,0, BANANA.class);
    if(BANANA != null){
        getWorld().removeObject(BANANA);
        score.BANANA++;
}
    if(score.BANANA == 3) {
        getWorld().addObject(new menang(), 300, 200);
        Greenfoot.stop();
    }
}
}
