import java.awt.Graphics;
import java.awt.Color;

/**
 * DrawRectangle
 */
public class DrawRectangle extends MyShape {

    private boolean filled;

    public DrawRectangle(int x1, int x2, int y1, int y2, Color myColor, boolean filled) {
        super(x1, x2, y1, y2, myColor);
        this.filled = filled;
    }

    @Override
    public void draw( Graphics g ){
        g.setColor( getMyColor() );
        if(filled)
            g.fillRect( getX1(), getY1(), getX2(), getY2() );
        else
            g.drawRect( getX1(), getY1(), getX2(), getY2() );
    }
}