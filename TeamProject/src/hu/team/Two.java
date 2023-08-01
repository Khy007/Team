package hu.team;

public class Two {
	private int name;

	public int getName() {
		return name;
	}
		
	public void setName(int name) {
		this.name=name;
	}

	public void displayInfo() {		
		int szamlalo = 0;
        for (int i = 2; i <= 100; i++) {
            boolean aSzamPrim = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    aSzamPrim = false;
                    break;
                }
            }
            if (aSzamPrim) {
                System.out.print(i);
                szamlalo++;
                if (szamlalo < name) {
                	System.out.print(", ");
                }
            }
            if (szamlalo == name) {
                
            	break;
            }
        }

	}
}
