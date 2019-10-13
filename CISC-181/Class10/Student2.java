public class Student2 implements Comparable<Student2> {
	String f,l;
	int g1,g2,g3;
	int total;
	public Student2(String f1, String l1, int g11, int g21, int g31) {
		f = f1;
		l = l1;
		g1 = g11;
		g2 = g21;
		g3 = g31;
		total = getTotal();
	}
	public int compareTo(Student2 s2) {
		System.out.println(total + " " + s2.getTotal());
		if (total > s2.getTotal()) {
			return 1;
		}
		else if (total < s2.getTotal()) {
			return -1;
		}
		else {
			return 0;
	}	}

	private int getTotal() {    return(g1 + g2 + g3);    }
	public String toString() {
		String s = "";
		s += l + " "+f+": "+total;
		return(s);
}	}
