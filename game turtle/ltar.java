import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ltar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ltar extends World
{

    /**
     * Constructor for objects of class ltar.
     * 
     */
    public ltar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BANANA bANANA = new BANANA();
        addObject(bANANA,416,42);
        BANANA bANANA2 = new BANANA();
        addObject(bANANA2,248,174);
        BANANA bANANA3 = new BANANA();
        addObject(bANANA3,522,295);
        bola bola = new bola();
        addObject(bola,322,41);
        bola bola2 = new bola();
        addObject(bola2,418,165);
        bola.setLocation(299,49);
        bANANA2.setLocation(179,196);
        bANANA.setLocation(463,39);
        bola.setLocation(234,45);
        bANANA.setLocation(364,114);
        bola2.setLocation(493,24);
        bola2.setLocation(464,44);
        bANANA.setLocation(342,97);
        bANANA3.setLocation(553,178);
        bANANA2.setLocation(192,276);
        BANANA bANANA4 = new BANANA();
        addObject(bANANA4,414,301);
        turtle turtle = new turtle();
        addObject(turtle,50,206);
        score score = new score();
        addObject(score,154,42);
        bola2.setRotation(90);
        bola.setRotation(90);
    }
}
