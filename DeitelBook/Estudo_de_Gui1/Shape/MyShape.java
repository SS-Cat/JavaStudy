import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private Color myColor;

    public MyShape(int x1, int x2, int y1, int y2, Color myColor) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.myColor = myColor;

    }

    public MyShape() {
        MyShape(0, 0, 0, 0, Color.BLACK);
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    } 

    /**
     * @param y2 the y2 to set
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * @return the y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * @param myColor the myColor to set
     */
    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    /**
     * @return the myColor
     */
    public Color getMyColor() {
        return myColor;
    }

    public int getUpperLeftX(){
        if (getX1() < getX2()) {
            return getX1();
        }else{
            return getX2();
        }
    }

    public int getUpperLeftY(){
        if (getY1() < getY2()) {
            return getY1();
        }else{
            return getY2();
        }
    }

    public int getWidth(){
        int width = getX1() - getX2();
        if(width<0){
            width = -width;
        }
        return width;
    }

    public int getHeight(){
        int height = getY1() - getY2();
        return +height;
    }

    public abstract void draw(Graphics g);

}