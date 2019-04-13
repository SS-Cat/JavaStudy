import java.awt.Graphics;
import java.awt.Color;

/**
 * DrawLine
 */
public class DrawLine extends MyShape {

    @Override
    public void draw( Graphics g ){
        g.setColor( getMyColor() );
        g.drawLine( getX1(), getY1(), getX2(), getY2() );
    }
}