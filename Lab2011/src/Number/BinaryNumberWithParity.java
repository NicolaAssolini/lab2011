package Number;

public class BinaryNumberWithParity extends BinaryNumber implements Number {
	
	  public BinaryNumberWithParity(int value) {
		super(value);
	  }
	
	  public String toString() {
		  return super.toString() + check1();
	  }
	  
	  private int check1() {
		  int i = 0;
		  
		  for(int v = super.getValue(); v>0; v/=2)
			  i += v%2;
		return i%2;
	}
	  
	
}
