package draughtsgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LogoGame {


    class bg extends JPanel {
        Image LogoTest1;
        Image imgicon;

        public bg() {
            LogoTest1 = Toolkit.getDefaultToolkit().createImage("images/Backgrounds/LOGOBLUE.png");
            imgicon = Toolkit.getDefaultToolkit().createImage("images/Backgrounds/icon.jpg");
        }

        public void paintComponent(Graphics g) {
            g.drawImage(LogoTest1, 0, 0, this);
        }
    }

    public void initFrame() throws IOException {
        JFrame f = new JFrame("Шашки(0.2.5)");
        int vert = 800;
        int hor = 1200;
        bg p = new bg();
        p.setLayout(null);
        f.add(p);
        f.setPreferredSize(new Dimension(hor, vert));
        f.setLocation(360,120);
        f.pack();
        p.setOpaque(false);
        f.setIconImage(p.imgicon);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Timer t = new Timer(4000, new AL(f));
        // 1000 = 1 сек
        t.setRepeats(false);
        t.start();
    }

    class AL implements ActionListener {
        public final JFrame frameToHide;

        @Override
        public void actionPerformed(ActionEvent e) {
            frameToHide.setVisible(false);
        }

        public AL(JFrame target) {
            this.frameToHide = target;
        }

    }
}