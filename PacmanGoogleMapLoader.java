/**
 * Write a description of class PacmanGoogleMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanGoogleMapLoader implements StaticMapLoader 
{
    public Map loadMap()
    {
        Map map = new Map();

        addWalls(map);

        addSmallItems(map);

        addPowerItems(map);

        map.addObject(new PacMan(), 50, 150);

        map.addObject(new RedPhantom(), map.getWidth()/2, 210);

        map.addObject(new BluePhantom(), map.getWidth()/2 - 50, map.getHeight()/2);

        map.addObject(new PinkPhantom(), map.getWidth()/2, map.getHeight()/2);

        map.addObject(new OrangePhantom(), map.getWidth()/2 + 50, map.getHeight()/2);
        


        return map;
    }

    void addWalls(Map map)
    {
       
        for(int x = 200; x < 320; x+=10) {
            map.addObject(new Wall(), x, 100);
        }
        
        for(int x = 80; x < 290; x+=10) {
            map.addObject(new Wall(), x, 420);
        }
        
        for(int x = 400; x < 500; x+=10) {
            map.addObject(new Wall(), x, 420);
        }
        
        for(int x = 180; x < 230; x+=10) {
            map.addObject(new Wall(), x, 550);
        }
        
        for(int x = 600; x < 650; x+=10) {
            map.addObject(new Wall(), x, 500);
        }
        
        for(int x = 500; x < 580; x+=10) {
            map.addObject(new Wall(), x, 100);
        }
        

        for(int x = 0; x < 800; x+=20) {
            map.addObject(new Wall(), x, 0);
        }

        for(int x = 0; x < 800; x+=20) {
            map.addObject(new Wall(), x, 700);
        }

        for(int y = 0; y < 700; y+=20) {
            map.addObject(new Wall(), 0, y);
        }

        for(int y = 0; y < 700; y+=20) {
            map.addObject(new Wall(), 800, y);
        }
        
        for(int y = 100; y < 250; y+=10) {
            map.addObject(new Wall(), 400, y);
        }
        
        for(int y = 100; y < 300; y+=10) {
            map.addObject(new Wall(), 650, y);
        }
        
        for(int y = 550; y < 650; y+=10) {
            map.addObject(new Wall(), 500, y);
        }
    }

    void addSmallItems(Map map)
    {
        for(int x = 50; x < 600; x+=20) {
            map.addObject(new SmallPoint(), x, 320);
        }
    }

    void addPowerItems(Map map)
    {
        map.addObject(new PowerPoint(), 50, 350);
        map.addObject(new PowerPoint(), 100, 550);
        map.addObject(new PowerPoint(), 650, 350);
        map.addObject(new PowerPoint(), 650, 550);
        map.addObject(new PowerPoint(), 700, 100);

    }

}
