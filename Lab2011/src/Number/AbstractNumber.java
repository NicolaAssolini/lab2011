package Number;

public abstract class AbstractNumber implements Number{
	  private final int value;

	  protected AbstractNumber(int value) {
	    if(value < 0)
	    	System.out.println("Errore: numero negativo");
	    this.value = value;
	  }

	  public final int getValue() {
		  return value;
	  }

	  protected abstract int getBase();

	  // restituisce il carattere che rappresenta la cifra "digit" nella base di numerazione
	  // di questo numero. Sarà sempre vero che 0 <= digit < getBase()
	  protected abstract char getCharForDigit(int digit);

	  public String toString() {
		  String s = "";
		  
		  for(int v = value; v>0; v/=this.getBase()) 
			  s += getCharForDigit(v%this.getBase());

		  return new StringBuffer(s).reverse().toString();
	  }

	  public final boolean equals(Object other) {
		  if(this.value == ((AbstractNumber)other).getValue())
			  return true;
		  else
			  return false;
	  }
}
