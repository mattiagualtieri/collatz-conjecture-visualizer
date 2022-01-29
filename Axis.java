import java.awt.*;
import java.awt.geom.Line2D;

public class Axis {

    private int frameWidth;
    private int frameHeight;

    public Axis(int frameWidth, int frameHeight) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
    }

    public void drawAxis(Graphics2D graphics){
        Line2D.Double line = new Line2D.Double();
        line.setLine(0, frameHeight/2, frameWidth, frameHeight/2);
        graphics.setColor(Color.GRAY);
        graphics.draw(line);
        line.setLine(frameWidth/2, 0, frameWidth/2, frameHeight);
        graphics.setColor(Color.GRAY);
        graphics.draw(line);
    }

}
