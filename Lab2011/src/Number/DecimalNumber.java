package Number;

public class DecimalNumber extends AbstractNumber implements Number {
	
	  public DecimalNumber(int value) {
		super(value);
	}

	protected int getBase() {
		  return 10;
	  }

	protected char getCharForDigit(int digit) {
		return (char)('0'+ digit);
	}

}
