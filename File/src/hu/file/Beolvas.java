package hu.file;

import java.io.*;
import java.util.*;

public class Beolvas {
    private BufferedReader br;
    private char[] tomb;
    private int meret;

    public Beolvas(String fileName) {
        try {
            br = new BufferedReader(new FileReader(fileName));
            meret = 0;
            int c = br.read();
            while (c != -1) {
                meret++;
                c = br.read();
            }
            br.close();
            tomb = new char[meret];
            br = new BufferedReader(new FileReader(fileName));
            for (int i = 0; i < meret; i++) {
                tomb[i] = (char) br.read();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public char[] getTomb() {
        return tomb;
    }

    public void setTomb(char[] tomb) {
        this.tomb = tomb;
    }

    public int getMeret() {
        return meret;
    }

    public void setMeret(int meret) {
        this.meret = meret;
    }
}