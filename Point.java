import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Point {

    private int frameWidth;
    private int frameHeight;
    private int x;
    private int y;

    public Point(int frameWidth, int frameHeight, int x, int y) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.x = x - 4;
        this.y = y - 4;
    }

    public Point(int frameWidth, int frameHeight) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
    }

    public void drawPoint(Graphics2D graphics){
        Ellipse2D.Double p = new Ellipse2D.Double(x, y, 8, 8);
        graphics.setColor(Color.CYAN);
        graphics.fill(p);
    }

    public void setPosition(int x, int y) {
        this.x = x - 4;
        this.y = y - 4;
    }
}
