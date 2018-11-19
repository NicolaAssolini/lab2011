package Number;

public class HexNumber extends AbstractNumber implements Number {
	private final static char[] c = {'0', '1', '2', '3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	  public HexNumber(int value) {
		super(value);
	}

	protected int getBase() {
		  return 16;
	  }

	protected char getCharForDigit(int digit) {
		return c[digit];
	}


}
