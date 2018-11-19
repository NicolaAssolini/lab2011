package Number;

public class OctalNumber extends AbstractNumber implements Number {
	
	  public OctalNumber(int value) {
		super(value);
	}

	protected int getBase() {
		  return 8;
	  }

	protected char getCharForDigit(int digit) {
		return (char)('0'+ digit);
	}

}


