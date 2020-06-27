package draughtsgame;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        MainFrame frame = new MainFrame();
        frame.initFrame();
        new Music();
        Music.playSound("E:\\draughts\\music\\Mainmusic2.wav").play();
        //Music.playSound("E:\\draughts\\music\\trash.wav").join();
        //Test

    }


}


