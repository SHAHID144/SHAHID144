package Day4;

public class Test {

	public static void main(String[] args) {
		Permanent p=new Permanent(2021,"shahid",20000,"Ananlyst",4);
		p.calculatesalaryHike();
		Temporary t=new Temporary(2021,"shahid",10000,1.5);
		t.calculatesalaryHike();

	}

}
