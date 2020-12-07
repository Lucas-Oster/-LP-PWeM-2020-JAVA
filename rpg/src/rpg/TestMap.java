package rpg;

public class TestMap {
	public static void main(String[] args) {
	Map m1 = new Map(15, 10);
	
	m1.placer(3, 5, 'J');
	m1.placer(8, 2, 'O');
	m1.placer(10, 7, 'M');
	m1.placer(3, 6, 'O');
	m1.placer(1, 8, 'M');
	m1.placer(-1, 0, 'M');
	System.out.print(m1.getCase(4, 6) + " = J\n");
	System.out.print(m1.getCase(11, 8) + " = M\n");
	System.out.print(m1.getCase(9, 3) + " = O\n");
	
	
	}
}
