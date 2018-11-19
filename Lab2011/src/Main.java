import java.util.Scanner;

import Number.Base58Number;
import Number.BinaryNumber;
import Number.BinaryNumberWithParity;
import Number.DecimalNumber;
import Number.HexNumber;
import Number.OctalNumber;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci numero non negativo: ");
		n = scan.nextInt();
		DecimalNumber dn = new DecimalNumber(n);
		BinaryNumber bn = new BinaryNumber(n);
		BinaryNumberWithParity bcn = new BinaryNumberWithParity(n);
		OctalNumber on = new OctalNumber(n);
		HexNumber hn = new HexNumber(n);
		Base58Number ln = new Base58Number(n);
		
		System.out.println(dn);
		System.out.println(bn);
		System.out.println(bcn);
		System.out.println(on);
		System.out.println(hn);
		System.out.println(ln);
		

	}

}
