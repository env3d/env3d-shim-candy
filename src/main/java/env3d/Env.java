package env3d;

import java.util.Collection;

public class Env {
    public void addObject(Object o){};
    public void removeObject(Object o){};
    public void setCameraXYZ(double x, double y, double z){};
    public void setCameraPitch(double p) {};
    public double getCameraPitch() { return 0; };    
    public void setCameraYaw(double y) {};
    public double getCameraYaw() { return 0; };
    public double getCameraX() { return 0; };
    public double getCameraY() { return 0; };
    public double getCameraZ() { return 0; };    
    public void setDefaultControl(boolean b) {};
    public void setDisplayStr(String str) {} ;
    public void setDisplayStr(String str, int x, int y) {} ;
    public void setDisplayStr(String str, int x, int y, double size, double r, double g, double b, double a) {} ;    
    public <T> Collection<T> getObjects(Class<T> c) { return null; };
    public void advanceOneFrame() {};
    public void advanceOneFrame(int framerate) {};

    public <T> T getObject(Class<T> c) { return null; };    
    public int getMouseButtonClicked() { return 0; };
    public boolean getMouseButtonDown(int button) { return false; };
    public int getMouseX() {return 0;};
    public int getMouseY() {return 0;};
    public int getScreenHeight() {return 0;};
    public int getScreenWidth() {return 0;};
    
    public int getKey() { return 0; };
    public int getKeyDown() { return 0; };
    public boolean getKeyDown(int key) { return false; };    
    public int getMouseDX() { return 0; };
    public int getMouseDY() { return 0; };
    public boolean isMouseGrabbed() { return false; };
    public void setMouseGrab(boolean grabbed) {};
    public Object getPick(int x, int y) { return null; };
    public void setSky(String sky) { };
    public void setRoom(Object r) { };
    public void start() { };
    public void exit() { };
}
