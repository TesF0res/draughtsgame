package draughtsgame;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        MainFrame frame = new MainFrame();
        LogoGame logo = new LogoGame();
        logo.initFrame();
        frame.initFrame();
        frame.playmusic();

        //Music.playSound("E:\\draughts\\music\\trash.wav").join();
        //Test

    }


}


