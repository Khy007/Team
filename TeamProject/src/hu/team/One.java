package hu.team;

public class One {
	private int name;

	public int getName() {
		return name;
	}
		
	public void setName(int name) {
		this.name=name;
	}

	public void displayInfo() {		
		System.out.print("x\t|");
        for (int i = 2; i <= name * 2; i += 2) {
            System.out.print("\t" + i);
        }
        System.out.println("\n-------------------------------------------------------------------------------------------");
        for (int i = 2; i <= name * 2; i += 2) {
            System.out.print(i + "\t|");
            for (int j = 2; j <= name * 2; j += 2) {
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }

	}
}
