package nestedinterface;

public interface myinterface {
	void calculateArea();
	//nested interface
	interface Myinnerinterface{
		
		int id=20;
		void print();
	}

}
