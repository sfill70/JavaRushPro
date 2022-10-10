package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {

    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();

    }

    private void drawScene() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                setCellColoredNumber(y, x, gameField[x][y]);
            }

        }
    }

    private void createNewNumber() {
        while (true) {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            if (gameField[x][y] == 0) {
                gameField[x][y] = getRandomNumber(10) < 9 ? 2 : 4;
                break;
            }
        }
    }

    private Color getColorByValue(int number) {
        if (number == 0) {
            return Color.ALICEBLUE;
        } else if (number == 2) {
            return Color.AQUA;
        } else if (number == 4) {
            return Color.AZURE;
        } else if (number == 16) {
            return Color.BEIGE;
        } else if (number == 32) {
            return Color.BISQUE;
        } else if (number == 64) {
            return Color.BLUE;
        } else if (number == 128) {
            return Color.BLUEVIOLET;
        } else if (number == 256) {
            return Color.CORAL;
        } else if (number == 512) {
            return Color.DARKBLUE;
        } else if (number == 1024) {
            return Color.GREEN;
        } else if (number == 2048) {
            return Color.GOLD;
        }
        return Color.DARKOLIVEGREEN;
        /*Color[] colors = {Color.ALICEBLUE, Color.AQUA, Color.AZURE, Color.BEIGE, Color.BISQUE,
                Color.BLUE, Color.BLUEVIOLET, Color.CORAL, Color.DARKBLUE, Color.GREEN, Color.GOLD};
        if (number == 0) {
            return colors[0];
        }
        int count = 1;
        while ((number ^ 2) != 0) {
            count++;
//            number = number / 2;
            number = number >> 1;
        }
        return colors[count];*/
    }

    private void setCellColoredNumber(int x, int y, int value) {
        if (value == 0) {
            setCellValueEx(x, y, getColorByValue(value), "");
            return;
        }
        setCellValueEx(x, y, getColorByValue(value), Integer.toString(value));
    }

    private boolean compressRow(int[] row) {
        boolean isSwap = false;
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                for (int j = i; j < row.length; j++) {
                    if (row[j] != 0) {
                        int tmp = row[i];
                        row[i] = row[j];
                        row[j] = tmp;
                        isSwap = true;
                        break;
                    }
                }
            }
        }
        return isSwap;
    }

    private boolean mergeRow(int[] row) {
        boolean result = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] > 0 && row[i] == row[i + 1]) {
                row[i] = row[i] * 2;
                row[i + 1] = 0;
                i++;
                result = true;
            }
        }
        return result;
    }

}
