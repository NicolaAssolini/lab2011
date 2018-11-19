package Number;

public class BinaryNumber extends AbstractNumber implements Number {
	
	  public BinaryNumber(int value) {
		super(value);
	}

	protected int getBase() {
		  return 2;
	  }

	protected char getCharForDigit(int digit) {
		return (char)('0'+ digit);
	}


}
