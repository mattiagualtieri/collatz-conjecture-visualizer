import javax.swing.*;

public class Main {

    public static void main(String[] args){

        int width = 1000, height = 700;
        JFrame frame = new JFrame();

        Painter painter = new Painter(width, height, 20);

        frame.setSize(width, height);
        frame.setTitle("Title");

        frame.add(painter);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
