package draughtsgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class MainFrame implements KeyListener {
    static public Music a;


    public void playmusic() {
        //1. Сделать рандомный плейлист 2.Сделать нормальную остановку и продолжение 3. Разобраться с размером и портом
        a = Music.playSound("E:\\draughtsgame\\music\\Mainmusic2.wav");
        a.play();
    }



    class bg extends JPanel {
        Image  imgbackground;
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
            imgicon = Toolkit.getDefaultToolkit().createImage("images/Backgrounds/icon.jpg");
            imgbackground = Toolkit.getDefaultToolkit().createImage("images/Backgrounds/test2.jpg");

            //
            imgdoor = Toolkit.getDefaultToolkit().createImage("images/Elements/door.png");
            imgsettings = Toolkit.getDefaultToolkit().createImage("images/Elements/gear.png");
            imgMOn = Toolkit.getDefaultToolkit().createImage("images/Elements/musicOn.png");
            imgMOf = Toolkit.getDefaultToolkit().createImage("images/Elements/musicOff.png");
            imgque = Toolkit.getDefaultToolkit().createImage("images/Elements/question.png");
            imgtro = Toolkit.getDefaultToolkit().createImage("images/Elements/trophy.png");
            name = Toolkit.getDefaultToolkit().createImage("images/Elements/name.png");
            invs = Toolkit.getDefaultToolkit().createImage("images/Elements/invs_space.png");
            start = Toolkit.getDefaultToolkit().createImage("images/Elements/forward.png");
            imginfo = Toolkit.getDefaultToolkit().createImage("images/Elements/information.png");
            ng = Toolkit.getDefaultToolkit().createImage("images/Elements/start.png");
            settingsn = Toolkit.getDefaultToolkit().createImage("images/Elements/setname.png");
            exitname = Toolkit.getDefaultToolkit().createImage("images/Elements/exit.png");
            achiv = Toolkit.getDefaultToolkit().createImage("images/Elements/achi.png");
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

    class bg1 extends JPanel {
        Image imgINFOICON;

        public bg1() {
            imgINFOICON = Toolkit.getDefaultToolkit().createImage("images/Elements/INFOICON.png");

        }
    }
        public void initFrame() throws IOException {

            final int[] off = {0};
            Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
            int vert = sSize.height;
            int hor = sSize.width;
            JFrame f = new JFrame("Шашки(0.2.5)");
            bg1 p1 = new bg1();
            bg p = new bg();
            p.setLayout(null);
            f.add(p);
            f.setIconImage(p.imgicon);
            //
            Timer t = new Timer(4000, new AL(f));
            t.setRepeats(false);
            t.start();
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
            f.setVisible(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            buttonExit.addActionListener((a1) -> {
                System.exit(0);
            });
            buttonInfo.addActionListener((a1) -> {

       /*   System.out.println("Beta Test Info");
            JOptionPane.showMessageDialog(f,
                    "Версия:0.2.1\n"
                            + "Создатель:TesF0res\n" +
                            "GitHub:https://github.com/TesF0res",
                    "Информация",
                    JOptionPane.PLAIN_MESSAGE);
            */
                //1.Настроить размер и позицию +; 2. Добавить иконку+; 3. Добавить фон-; 4. Добавить текст/Активные ссылки-;
                JFrame frameinfo = new JFrame("Information");
            //    f.setVisible(false);
                frameinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameinfo.setPreferredSize(new Dimension(800, 600));
                frameinfo.setLocation(hor / 3 / 2 + 240, vert / 3 / 2);
                frameinfo.add(p1);
                p1.setLayout(null);
                p1.removeAll();
                frameinfo.setIconImage(p1.imgINFOICON);
                JLabel label = new JLabel("Version:0.2.5");
                frameinfo.getContentPane().add(label);
                frameinfo.pack();
                frameinfo.setVisible(true);
            });
            buttonHelp.addActionListener((a1) -> {
                System.out.println("Beta Test Help");
                //1.ДЕЛАТЬ  ПОСЛЕ МУЗЫКИ И ИНФО-ТАБЛИЦЫ
            });
            buttonAchi.addActionListener((a1) -> {
                System.out.println("Beta Test Achi");
                //1.ДЕЛАТЬ  ПОСЛЕ ПОМОЩИ
            });
            buttonMusic.addActionListener((a1) -> {

                System.out.println("Beta Test Music");
                if (off[0] == 0) {
                    a.stop();
                    buttonMusic.setIcon(new ImageIcon("images/Elements/musicOff.png"));
                    off[0] += 1;
                } else if (off[0] == 1) {
                    a.play();
                    buttonMusic.setIcon(new ImageIcon("images/Elements/musicOn.png"));
                    off[0] -= 1;
                }


            });
            buttonSettings.addActionListener((a1) -> {
                System.out.println("Beta Test Settings");
                //1.ДЕЛАТЬ ПОСЛЕ ДОСТИЖЕНИЙ
            });
            buttonStart.addActionListener((a1) -> {
                System.out.println("Beta Test Start");
                //1.ДЕЛАТЬ ПОСЛЕ НАСТРОЕК
            });
            f.setLocation(360,120);

            f.setSize(1200, 800);


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
    class AL implements ActionListener {
        public final JFrame frameToHide;

        @Override
        public void actionPerformed(ActionEvent e) {
            frameToHide.setVisible(true);
            playmusic();
        }

        public AL(JFrame target) {
            this.frameToHide = target;
        }

    }

    }