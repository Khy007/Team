package hu.file;

public class Megjelenit {
    private Beolvas beolvas;

    public Megjelenit(Beolvas beolvas) {
        this.beolvas = beolvas;
    }

    public Beolvas getBeolvas() {
        return beolvas;
    }

    public void setBeolvas(Beolvas beolvas) {
        this.beolvas = beolvas;
    }

    public void visszafeleKiir() {
        System.out.println("A tömb elemei visszafelé:");
        for (int i = beolvas.getMeret() - 1; i >= 0; i--) {
            System.out.print(beolvas.getTomb()[i]);
        }
    }
}