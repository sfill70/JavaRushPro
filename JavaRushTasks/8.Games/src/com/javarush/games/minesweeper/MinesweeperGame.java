package com.javarush.games.minesweeper;


import com.javarush.engine.cell.*;

/*После этого зайдите в настройки проекта (alt+ctrl+shift+s) -> SDK’s -> Classpath и нажать справа на плюс.
        Выберите файл jfxrt.jar. Он находится в установленой JDK по пути: <JDK_PATH>/jre/lib/ext/jfxrt.jar*/


public class MinesweeperGame extends Game {

    private static final int SIDE = 9;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
    }
}
