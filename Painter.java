import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Painter extends JComponent {

    private int frameWidth;
    private int frameHeight;
    private Axis axis;
    private Path path;
    private Point point;
    private int n;

    public Painter(int frameWidth, int frameHeight, int n) {
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        axis = new Axis(frameWidth, frameHeight);
        path = new Path(frameWidth, frameHeight);
        point = new Point(frameWidth, frameHeight);
        this.n = n;
    }

    protected void paintComponent(Graphics g){
        Graphics2D graphics = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHints(rh);

        axis.drawAxis(graphics);

        for(int i = 1; i < 10; i++){
            n = i;
            int iter = 0;
            while (n != 1){

                path.setStartingPosition(frameWidth/2 + iter*10, frameHeight/2 - n*5);
                iter++;
                n = collatz(n);
                path.setFinalPosition(frameWidth/2 + iter*10, frameHeight/2 - n*5);
                point.setPosition(frameWidth/2 + iter*10, frameHeight/2 - n*5);
                point.drawPoint(graphics);
                path.drawPath(graphics);

            }
        }

    }

    private int collatz(int n){
        if((n % 2) == 0)
            return n / 2;
        return 3*n + 1;
    }

}
