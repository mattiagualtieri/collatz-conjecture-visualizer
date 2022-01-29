import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class Path {

    private int frameWidth;
    private int frameHeight;
    private int xs;
    private int ys;
    private int xf;
    private int yf;

    public Path(int frameWidth, int frameHeight, int xs, int ys, int xf, int yf) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.xs = xs;
        this.ys = ys;
        this.xf = xf;
        this.yf = yf;
    }

    public Path(int frameWidth, int frameHeight) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.xs = xs;
        this.ys = ys;
        this.xf = xf;
        this.yf = yf;
    }

    public void drawPath(Graphics2D graphics){
        Path2D.Double p = new Path2D.Double();
        p.moveTo(xs, ys);
        p.lineTo(xf, yf);
        graphics.setColor(Color.GRAY);
        graphics.draw(p);
    }

    public void setStartingPosition(int x, int y) {
        this.xs = x;
        this.ys = y;
    }

    public void setFinalPosition(int x, int y) {
        this.xf = x;
        this.yf = y;
    }
}
