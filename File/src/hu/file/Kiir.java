package hu.file;

import java.io.*;
import java.util.*;

public class Kiir {
    private Scanner sc;
    private PrintWriter pw;
    private String fileName;

    public Kiir(String fileName) {
        this.fileName = fileName;
        try {
            sc = new Scanner(System.in);
            pw = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public void setPw(PrintWriter pw) {
        this.pw = pw;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void bekerEsKiir() {
        System.out.println("Kérem adjon meg adatokat (kilépés: ENTER):");
        String input = sc.nextLine();
        while (!input.equals("")) {
            pw.println(input);
            input = sc.nextLine();
        }
        pw.close();
    }
}
