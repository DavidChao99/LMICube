package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

public class RubiksCube {
    static int[][] cube;

    // WHITE - 0
    // GREEN - 1
    // BLUE - 2
    // YELLOW - 3
    // RED - 4
    // ORANGE - 5

    public RubiksCube() {
        cube = new int[6][9];
        for(int i = 0; i < 6; i ++) {
            for(int j = 0; j < 9; j++) {
                cube[i][j] = i;
            }
        }
    }

    public String getCube() {
        String returnString = "";

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 9; j ++) {
                returnString+= ""+cube[i][j];
            }
        }
        return returnString;
    }

    public int getCube(int face, int piece) {
        return cube[face][piece];
    }


    public String Turn(int direction) {
        String turn;
        int[] temp = new int[3];
        int temp1;
        switch (direction) {
            case 1: turn = "R";
                temp[0] = cube[0][2];
                temp[1] = cube[0][5];
                temp[2] = cube[0][8];
                cube[0][2] = cube[2][2];
                cube[0][5] = cube[2][5];
                cube[0][8] = cube[2][8];
                cube[2][2] = cube[3][2];
                cube[2][5] = cube[3][5];
                cube[2][8] = cube[3][8];
                cube[3][2] = cube[1][2];
                cube[3][5] = cube[1][5];
                cube[3][8] = cube[1][8];
                cube[1][2] = temp[0];
                cube[1][5] = temp[1];
                cube[1][8] = temp[2];

                temp1 = cube[5][0];
                cube[5][0] = cube[5][6];
                cube[5][6] = cube[5][8];
                cube[5][8] = cube[5][2];
                cube[5][2] = temp1;

                temp1 = cube[5][1];
                cube[5][1] = cube[5][3];
                cube[5][3] = cube[5][7];
                cube[5][7] = cube[5][5];
                cube[5][5] = temp1;

                break;
            case 2: turn = "R'";
                Turn(1);
                Turn(1);
                Turn(1);
                break;
            case 3: turn = "L";
                Turn(4);
                Turn(4);
                Turn(4);
                break;
            case 4: turn = "L'";
                temp[0] = cube[0][0];
                temp[1] = cube[0][3];
                temp[2] = cube[0][6];
                cube[0][0] = cube[2][0];
                cube[0][3] = cube[2][3];
                cube[0][6] = cube[2][6];
                cube[2][0] = cube[3][0];
                cube[2][3] = cube[3][3];
                cube[2][6] = cube[3][6];
                cube[3][0] = cube[1][0];
                cube[3][3] = cube[1][3];
                cube[3][6] = cube[1][6];
                cube[1][0] = temp[0];
                cube[1][3] = temp[1];
                cube[1][6] = temp[2];

                temp1 = cube[4][0];
                cube[4][0] = cube[4][2];
                cube[4][2] = cube[4][8];
                cube[4][8] = cube[4][6];
                cube[4][6] = temp1;

                temp1 = cube[4][1];
                cube[4][1] = cube[4][5];
                cube[4][5] = cube[4][7];
                cube[4][7] = cube[4][3];
                cube[4][3] = temp1;

                break;
            case 5: turn = "U";
                temp[0] = cube[0][0];
                temp[1] = cube[0][1];
                temp[2] = cube[0][2];
                cube[0][0] = cube[5][0];
                cube[0][1] = cube[5][1];
                cube[0][2] = cube[5][2];
                cube[5][0] = cube[3][8];
                cube[5][1] = cube[3][7];
                cube[5][2] = cube[3][6];
                cube[3][8] = cube[4][0];
                cube[3][7] = cube[4][1];
                cube[3][6] = cube[4][2];
                cube[4][0] = temp[0];
                cube[4][1] = temp[1];
                cube[4][2] = temp[2];

                temp1 = cube[1][0];
                cube[1][0] = cube[1][6];
                cube[1][6] = cube[1][8];
                cube[1][8] = cube[1][2];
                cube[1][2] = temp1;

                temp1 = cube[1][1];
                cube[1][1] = cube[1][3];
                cube[1][3] = cube[1][7];
                cube[1][7] = cube[1][5];
                cube[1][5] = temp1;

                break;
            case 6: turn = "U'";
                Turn(5);
                Turn(5);
                Turn(5);
                break;
            case 7: turn = "F";
                temp[0] = cube[1][6];
                temp[1] = cube[1][7];
                temp[2] = cube[1][8];
                cube[1][6] = cube[4][8];
                cube[1][7] = cube[4][5];
                cube[1][8] = cube[4][2];
                cube[4][8] = cube[2][2];
                cube[4][5] = cube[2][1];
                cube[4][2] = cube[2][0];
                cube[2][2] = cube[5][0];
                cube[2][1] = cube[5][3];
                cube[2][0] = cube[5][6];
                cube[5][0] = temp[0];
                cube[5][3] = temp[1];
                cube[5][6] = temp[2];

                temp1 = cube[0][0];
                cube[0][0] = cube[0][6];
                cube[0][6] = cube[0][8];
                cube[0][8] = cube[0][2];
                cube[0][2] = temp1;

                temp1 = cube[0][1];
                cube[0][1] = cube[0][3];
                cube[0][3] = cube[0][7];
                cube[0][7] = cube[0][5];
                cube[0][5] = temp1;

                break;
            case 8: turn = "F'";
                Turn(7);
                Turn(7);
                Turn(7);
                break;
            case 9: turn = "D";
                temp[0] = cube[0][6];
                temp[1] = cube[0][7];
                temp[2] = cube[0][8];
                cube[0][6] = cube[4][6];
                cube[0][7] = cube[4][7];
                cube[0][8] = cube[4][8];
                cube[4][6] = cube[3][2];
                cube[4][7] = cube[3][1];
                cube[4][8] = cube[3][0];
                cube[3][2] = cube[5][6];
                cube[3][1] = cube[5][7];
                cube[3][0] = cube[5][8];
                cube[5][6] = temp[0];
                cube[5][7] = temp[1];
                cube[5][8] = temp[2];

                temp1 = cube[2][0];
                cube[2][0] = cube[2][6];
                cube[2][6] = cube[2][8];
                cube[2][8] = cube[2][2];
                cube[2][2] = temp1;

                temp1 = cube[2][1];
                cube[2][1] = cube[2][3];
                cube[2][3] = cube[2][7];
                cube[2][7] = cube[2][5];
                cube[2][5] = temp1;

                break;
            case 10: turn = "D'";
                Turn(9);
                Turn(9);
                Turn(9);
                break;
            case 11: turn = "B";
                temp[0] = cube[1][0];
                temp[1] = cube[1][1];
                temp[2] = cube[1][2];
                cube[1][0] = cube[5][2];
                cube[1][1] = cube[5][5];
                cube[1][2] = cube[5][8];
                cube[5][2] = cube[2][8];
                cube[5][5] = cube[2][7];
                cube[5][8] = cube[2][6];
                cube[2][8] = cube[4][6];
                cube[2][7] = cube[4][3];
                cube[2][6] = cube[4][0];
                cube[4][6] = temp[0];
                cube[4][3] = temp[1];
                cube[4][0] = temp[2];

                temp1 = cube[3][0];
                cube[3][0] = cube[3][6];
                cube[3][6] = cube[3][8];
                cube[3][8] = cube[3][2];
                cube[3][2] = temp1;

                temp1 = cube[3][1];
                cube[3][1] = cube[3][3];
                cube[3][3] = cube[3][7];
                cube[3][7] = cube[3][5];
                cube[3][5] = temp1;

                break;
            case 12: turn = "B'";
                Turn(11);
                Turn(11);
                Turn(11);
                break;
            // based upon ruwix.com/the-rubiks-cube/notation/ notation
            case 13: turn = "M";
                temp[0] = cube[0][1];
                temp[1] = cube[0][4];
                temp[2] = cube[0][7];
                cube[0][1] = cube[2][1];
                cube[0][4] = cube[2][4];
                cube[0][7] = cube[2][7];
                cube[2][1] = cube[3][1];
                cube[2][4] = cube[3][4];
                cube[2][7] = cube[3][7];
                cube[3][1] = cube[1][1];
                cube[3][4] = cube[1][4];
                cube[3][7] = cube[1][7];
                cube[1][1] = temp[0];
                cube[1][4] = temp[1];
                cube[1][7] = temp[2];

                break;
            case 14: turn = "M'";
                Turn(13);
                Turn(13);
                Turn(13);
                break;
            case 15: turn = "E";
                Turn(16);
                Turn(16);
                Turn(16);
                break;
            case 16: turn = "E'";
                temp[0] = cube[0][3];
                temp[1] = cube[0][4];
                temp[2] = cube[0][5];
                cube[0][3] = cube[5][3];
                cube[0][4] = cube[5][4];
                cube[0][5] = cube[5][5];
                cube[5][3] = cube[3][5];
                cube[5][4] = cube[3][4];
                cube[5][5] = cube[3][3];
                cube[3][5] = cube[4][3];
                cube[3][4] = cube[4][4];
                cube[3][3] = cube[4][5];
                cube[4][3] = temp[0];
                cube[4][4] = temp[1];
                cube[4][5] = temp[2];
                break;
            case 17: turn = "S";
                temp[0] = cube[1][3];
                temp[1] = cube[1][4];
                temp[2] = cube[1][5];
                cube[1][3] = cube[4][7];
                cube[1][4] = cube[4][4];
                cube[1][5] = cube[4][1];
                cube[4][7] = cube[2][5];
                cube[4][4] = cube[2][4];
                cube[4][1] = cube[2][3];
                cube[2][5] = cube[5][1];
                cube[2][4] = cube[5][4];
                cube[2][3] = cube[5][7];
                cube[5][1] = temp[0];
                cube[5][4] = temp[1];
                cube[5][7] = temp[2];

                break;
            case 18: turn = "S'";
                Turn(17);
                Turn(17);
                Turn(17);
                break;
            case 19: turn = "X";
                break;
            case 20: turn = "X'";
                break;
            case 21: turn = "Y";
                break;
            case 22: turn = "Y'";
                break;
            case 23: turn = "Z";
                break;
            case 24: turn = "Z'";
                break;
            default: turn = "Invalid";
                break;

        }

        return getCube();
    }




}