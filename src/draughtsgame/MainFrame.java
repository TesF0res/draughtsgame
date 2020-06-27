package draughtsgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class MainFrame implements KeyListener {

    class bg extends JPanel {
        Image imgbackground;
        Image imgdoor;
        Image imgsettings;
        Image imginfo;
        Image imgMOn;
        Image imgMOf;
        Image imgque;
        Image imgtro;
        Image name;
        Image invs;
        Image start;
        Image ng;
        Image settingsn;
        Image exitname;
        Image achiv;
        Image imgicon;

        public bg() {
            imgicon = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Backgrounds\\icon.png");
            imgbackground = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Backgrounds\\mainmenubg.jpg");
            imgdoor = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\door.png");
            imgsettings = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\gear.png");
            imgMOn = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\musicOn.png");
            imgMOf = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\musicOff.png");
            imgque = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\question.png");
            imgtro = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\trophy.png");
            name = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\name.png");
            invs = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\invs_space.png");
            start = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\forward.png");
            imginfo = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\information.png");
            ng = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\start.png");
            settingsn = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\setname.png");
            exitname = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\exit.png");
            achiv = Toolkit.getDefaultToolkit().createImage("E:\\draughts\\images\\Elements\\achi.png");
        }


        public void paintComponent(Graphics g) {
            g.drawImage(imgbackground, 0, 0, this);
            //  g.drawImage(imginfo, 720, 60, this);
            //  g.drawImage(imgMOn, 720, 10, this);
            //  g.drawImage(imgque, 720, 110, this);
            g.drawImage(name, 150, 30, this);
          //  g.drawImage(start, 250, 120, this);
            g.drawImage(ng, 290, 133, this);
        //    g.drawImage(imgsettings, 247, 180, this);
            g.drawImage(settingsn, 291, 193, this);
            //  g.drawImage(imgdoor, 248, 305, this);
            g.drawImage(exitname, 291, 320, this);
            //    g.drawImage(imgtro, 249, 240, this);
            g.drawImage(achiv, 291, 255, this);

        }


    }

    public void initFrame() throws IOException {

        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        int vert = sSize.height;
        int hor = sSize.width;
        JFrame f = new JFrame("Шашки(0.1)");
        bg p = new bg();
        p.setLayout(null);
        f.add(p);
        f.setIconImage(p.imgicon);
        //
        JButton buttonExit = new JButton();
        buttonExit.setSize(45, 45);
        buttonExit.setPreferredSize(new Dimension(10, 10));
        buttonExit.setLocation(250, 306);
        buttonExit.setIcon(new ImageIcon("images/Elements/door.png"));
        buttonExit.setBorder(BorderFactory.createEmptyBorder());
        buttonExit.setContentAreaFilled(false);
        p.add(buttonExit);
        //
        JButton buttonInfo = new JButton();
        buttonInfo.setSize(45, 45);
        buttonInfo.setPreferredSize(new Dimension(10, 10));
        buttonInfo.setLocation(723, 60);
        buttonInfo.setIcon(new ImageIcon("images/Elements/information.png"));
        buttonInfo.setBorder(BorderFactory.createEmptyBorder());
        buttonInfo.setContentAreaFilled(false);
        p.add(buttonInfo);
        //
        JButton buttonHelp = new JButton();
        buttonHelp.setSize(45, 45);
        buttonHelp.setPreferredSize(new Dimension(10, 10));
        buttonHelp.setLocation(723, 110);
        buttonHelp.setIcon(new ImageIcon("images/Elements/question.png"));
        buttonHelp.setBorder(BorderFactory.createEmptyBorder());
        buttonHelp.setContentAreaFilled(false);
        p.add(buttonHelp);
        //
        JButton buttonAchi = new JButton();
        buttonAchi.setSize(45, 45);
        buttonAchi.setPreferredSize(new Dimension(10, 10));
        buttonAchi.setLocation(251, 243);
        buttonAchi.setIcon(new ImageIcon("images/Elements/trophy.png"));
        buttonAchi.setBorder(BorderFactory.createEmptyBorder());
        buttonAchi.setContentAreaFilled(false);
        p.add(buttonAchi);
        //
        JButton buttonMusic = new JButton();
        buttonMusic.setSize(45, 45);
        buttonMusic.setPreferredSize(new Dimension(10, 10));
        buttonMusic.setLocation(722, 10);
        buttonMusic.setIcon(new ImageIcon("images/Elements/musicOn.png"));
        buttonMusic.setBorder(BorderFactory.createEmptyBorder());
        buttonMusic.setContentAreaFilled(false);
        p.add(buttonMusic);
        //
        JButton buttonSettings = new JButton();
        buttonSettings.setSize(45, 45);
        buttonSettings.setPreferredSize(new Dimension(10, 10));
        buttonSettings.setLocation(250, 183);
        buttonSettings.setIcon(new ImageIcon("images/Elements/gear.png"));
        buttonSettings.setBorder(BorderFactory.createEmptyBorder());
        buttonSettings.setContentAreaFilled(false);
        p.add(buttonSettings);
        //
        JButton buttonStart = new JButton();
        buttonStart.setSize(45, 45);
        buttonStart.setPreferredSize(new Dimension(10, 10));
        buttonStart.setLocation(253, 123);
        buttonStart.setIcon(new ImageIcon("images/Elements/forward.png"));
        buttonStart.setBorder(BorderFactory.createEmptyBorder());
        buttonStart.setContentAreaFilled(false);
        p.add(buttonStart);
        //
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        class ClickButtons implements ActionListener {

            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        }
        //
        class ClickButtons1 implements ActionListener {

            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Beta Test Info");
            }
        }
        //
        class ClickButtons2 implements ActionListener {

            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Beta Test Help");
            }
        }
        //
        class ClickButtons3 implements ActionListener {

            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Beta Test Achi");
            }
        }
        //
        class ClickButtons4 implements ActionListener {


            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Beta Test Music");

            }
        }
        //
        class ClickButtons5 implements ActionListener {


            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Beta Test Settings");

            }
        }
        //
        class ClickButtons6 implements ActionListener {


            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Beta Test Start");

            }
        }
        //
        buttonExit.addActionListener(new ClickButtons());
        buttonInfo.addActionListener(new ClickButtons1());
        buttonHelp.addActionListener(new ClickButtons2());
        buttonAchi.addActionListener(new ClickButtons3());
        buttonMusic.addActionListener(new ClickButtons4());
        buttonSettings.addActionListener(new ClickButtons5());
        buttonStart.addActionListener(new ClickButtons6());
        f.setLocation(hor / 3 / 2 + 240, vert / 3 / 2);

        f.setSize(800, 600);


        ;
//

        f.setResizable(false);


    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }


    public void keyReleased(KeyEvent e) {

    }


}