package nestedinterface;

public interface nestedinterface implements myinterface.Myinnerinterface {

	@Override
	public void print() {
	System.out.println("inner Interface method");
	
}


}
