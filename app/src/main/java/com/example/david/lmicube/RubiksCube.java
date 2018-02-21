package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

import android.util.Log;

import java.util.Random;
import java.util.Stack;

import static android.content.ContentValues.TAG;

public class RubiksCube {
    private static int[][] cube;
    private static Stack<Integer> turns;

    // WHITE - 0
    // GREEN - 1
    // BLUE - 2
    // YELLOW - 3
    // RED - 4
    // ORANGE - 5

    public RubiksCube() {
        cube = new int[6][9];
        turns = new Stack<Integer>();
        Reset();
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


    // These methods define Cube Logic
    // They return the Cube as a string but if this is unneeded, can remove and make void
    public String Turn(int direction, boolean storesTurn) {
        String turn;
        if(storesTurn) {
            turns.push(Integer.valueOf(direction));
            String pushmsg = String.format("We are pushing the turn %d", direction);
            Log.i(TAG, pushmsg);
        }
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
                Turn(1, false);
                Turn(1, false);
                Turn(1, false);
                break;
            case 3: turn = "L";
                Turn(4,false);
                Turn(4,false);
                Turn(4,false);
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
                Turn(5,false);
                Turn(5,false);
                Turn(5,false);
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
                Turn(7,false);
                Turn(7,false);
                Turn(7,false);
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
                Turn(9,false);
                Turn(9,false);
                Turn(9,false);
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
                Turn(11,false);
                Turn(11,false);
                Turn(11,false);
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
                Turn(13,false);
                Turn(13,false);
                Turn(13,false);
                break;
            case 15: turn = "E";
                Turn(16,false);
                Turn(16,false);
                Turn(16,false);
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
                Turn(17,false);
                Turn(17,false);
                Turn(17,false);
                break;
            case 19: turn = "X";
                // R L' M'
                Turn(1,false);
                Turn(4,false);
                Turn(14,false);
                break;
            case 20: turn = "X'";
                // R' L M
                Turn(2,false);
                Turn(3,false);
                Turn(13,false);
                break;
            case 21: turn = "Y";
                // U D' E'
                Turn(5,false);
                Turn(10,false);
                Turn(16,false);
                break;
            case 22: turn = "Y'";
                // U' D E
                Turn(6,false);
                Turn(9,false);
                Turn(15,false);
                break;
            case 23: turn = "Z";
                // F B' S
                Turn(7,false);
                Turn(12,false);
                Turn(17,false);
                break;
            case 24: turn = "Z'";
                // F' B S'x
                Turn(8,false);
                Turn(11,false);
                Turn(18,false);
                break;
            default: turn = "Invalid";
                break;

        }

        return getCube();
    }

    public String Undo() {
        if(turns.empty()) {
            return getCube();
        }
        else {
            int dir = turns.pop();
            String undomsg = String.format("We are undoing the turn %d", dir);
            Log.i(TAG, undomsg);
            if (dir % 2 == 0) {
                this.Turn(dir - 1,false);
            } else {
                this.Turn(dir + 1,false);
            }
            return getCube();
        }
    }

    public String Reset() {
        for(int i = 0; i < 6; i ++) {
            for(int j = 0; j < 9; j++) {
                cube[i][j] = i;
            }
        }
        return getCube();
    }

    public String Shuffle() {
        Random rand = new Random();

        int numTurns = rand.nextInt(10) + 25;
        for(int i = 0; i <= numTurns; i++) {
            int turnNum = rand.nextInt(18) + 1;
            Turn(turnNum,true);
        }

        return getCube();
    }

}