package env3d;

import java.util.Collection;

public class Env {
    /**
     * Add an object to the environment
     */
    public void addObject(Object o){};

    /**
     * Removes an object from the environment
     */    
    public void removeObject(Object o){};

    /**
     * Sets the location of the camera
     */
    public void setCameraXYZ(double x, double y, double z){};

    /**
     * Sets the pitch angle (up / down)
     */
    public void setCameraPitch(double p) {};

    /**
     * @return the current camera pitch
     */
    public double getCameraPitch() { return 0; };

    /**
     * Sets the yaw angle (look left / right)
     */
    public void setCameraYaw(double y) {};

    /**
     * @return the camera yaw
     */
    public double getCameraYaw() { return 0; };

    /**
     * @return the camera X coordinate
     */
    public double getCameraX() { return 0; };

    /**
     * @return the camera Y coordinate
     */
    public double getCameraY() { return 0; };

    /**
     * @return the camera Z coordinate
     */
    public double getCameraZ() { return 0; };

    /**
     * If called with true, allow basic WASD control
     * @param b true to enable WASD control, false to disable 
     */
    public void setDefaultControl(boolean b) {};
    
    /**
     * Displays a string in the middle of the screen
     * @param str the string to display
     */
    public void setDisplayStr(String str) {} ;
    
    /**
     * @todo
     * Displays a string at location x and y
     */
    public void setDisplayStr(String str, int x, int y) {} ;
    
    /**
     * @todo
     * Display a string at a particular location with size and color
     */
    public void setDisplayStr(String str, int x, int y, double size, double r, double g, double b, double a) {} ;
    
    /**
     * Get a list of objects of a certain class from the current environment
     * @param c the class of the objects
     */
    public <T> Collection<T> getObjects(Class<T> c) { return null; };
    
    /**
     * @notrelevant
     * Advances the frame to the next
     */
    public void advanceOneFrame() {};
    
    /**
     * @notrelevant
     * Advances the frame at a particular framerate
     */
    public void advanceOneFrame(int framerate) {};

    /**
     * Get one object of the particular class
     * @param c the class of the object to retrieve
     */
    public <T> T getObject(Class<T> c) { return null; };
    
    /**
     * @return the mouse button that was clicked
     */
    public int getMouseButtonClicked() { return 0; };
    
    /**
     * Check if a mouse button is held down
     * @param button the button (0 is left mouse)
     * @return true if the button is down
     */
    public boolean getMouseButtonDown(int button) { return false; };
    
    /**
     * @return the X location of the mouse
     */
    public int getMouseX() {return 0;};
    
    /**
     * @return the Y location of the mouse
     */
    public int getMouseY() {return 0;};
    
    /**
     * @notrelevant
     */
    public int getScreenHeight() {return 0;};
    
    /**
     * @notrelevant
     */
    public int getScreenWidth() {return 0;};
    
    /**
     * @return the last key that was pressed
     */
    public int getKey() { return 0; };
    
    /**
     * @return the last key that was held down
     */
    public int getKeyDown() { return 0; };
    
    /**
     * Checks if a key is held down
     * @return true if the key is down
     */
    public boolean getKeyDown(int key) { return false; };
    
    /**
     * @return the difference in X since the last time getMouseDX was called
     */
    public int getMouseDX() { return 0; };
    
    /**
     * @return the difference in X since the last time getMouseDX was called
     */
    public int getMouseDY() { return 0; };
    
    /**
     * @notrelevant
     */
    public boolean isMouseGrabbed() { return false; };
    
    /**
     * @notrelevant
     */
    public void setMouseGrab(boolean grabbed) {};
    
    /**
     * Get the object under a particular screen location
     * @param x the x location on screen
     * @param y the y location on screen
     * @return the first object under the x,y location
     */
    public Object getPick(int x, int y) { return null; };
    
    /**
     * Sets the skybox
     * @param sky the URL to a skybox (must have 6 images), 
     * top.png, bottom.png, north.png, east.png, south.png, west.png
     */
    public void setSky(String sky) { };
    
    /**
     * Sets the room to a particular room object
     * @param r the room object
     */
    public void setRoom(Object r) { };
    
    /**
     * Activate the environment (otherwise only a black screen will show)
     */
    public void start() { };
    
    /**
     * @notrelevant
     */
    public void exit() { };
}
