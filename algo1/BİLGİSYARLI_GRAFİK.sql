import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.*;

public class Main extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fonksiyon Grafiği");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setSize(1920, 1080);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int width = getWidth();
        int height = getHeight();

        // X ekseni etiketi
        g.setColor(Color.BLACK);
        g.drawLine(50, height/2, width - 50, height/2); // X ekseni
        g.setFont(new Font("Arial", Font.PLAIN, 14));
        for (int i = 0; i <= 10; i++) {
            int x = 50 + i * (width - 100) / 10;
            g.drawString(Integer.toString(i), x, height/2 + 35);
        }
        g.drawString("u", width - 30, height - 45);

        // Y ekseni etiketi
        int j = 5;
 int k = 0;
        g.drawLine(50, 50, 50, height); // Y ekseni
        g.setFont(new Font("Arial", Font.PLAIN, 14));
        for (int i = 0; i <= 5; i++ , j--) {
            int y = height - 50 - i * (height - 100) / 10;
            g.drawString(Integer.toString(-j), 20, y);
        }
        for (int i = 5; i <= 10; i++ , k++) {
            int y = height - 50 - i * (height - 100) / 10;
            g.drawString(Integer.toString(k), 20, y);
        }
        g.drawString("p(u)", 10, 20);


        for (int x = 0; x <  width; x++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            double u = (double) x / width;
            double p = calculateFunction(u);

            int y = (int) (height - p * height+500); // Y eksenini ters çevir

            g.setColor(Color.RED);
            g.drawLine(x, y, x, y);
        }
    }

    private double calculateFunction(double u) {
        double p0 = (2 * u * u * u - 3 * u * u + 1);
        double p1 = (-2 * u * u * u + 3 * u * u * u);
        double p0Prime = (u * u * u - 2 * u * u + u);
        double p1Prime = (u * u * u - u * u);

        double p = p0 + p1 + p0Prime + p1Prime;
      return p;
    }
}