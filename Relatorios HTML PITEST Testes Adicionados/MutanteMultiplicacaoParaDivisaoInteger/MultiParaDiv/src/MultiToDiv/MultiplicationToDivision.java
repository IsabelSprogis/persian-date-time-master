package MultiToDiv;

public class MultiplicationToDivision {
	
	static long simpleToJulianDays(int ano){
		int anobase = ano - 474;
		int anoAtual = 474 + (anobase % 2820);
		return 12 + 15 +(anoAtual * 682 - 110) / 2816 +
						(anoAtual - 1) * 365 + 
						(anobase/ 2820 * 1029983) +
						(1948320 - 1);

	}
	
	public static void main(String[] args) {
		System.out.print(simpleToJulianDays(1029984));
	}

}

/* VERSÃO ALTERADA QUE MATA O A MULTIPLICACAO
 * 
 * public class MultiplicationToDivision {
	
	static double simpleToJulianDays(double ano){
		double anobase = ano - 474;
		double anoAtual = 474 + (anobase % 2820);
		return 12 + 15 +(anoAtual * 682 - 110) / 2816 +
						(anoAtual - 1) * 365 + 
						(anobase/ 2820 * 1029983) +
						(1948320 - 1);

	}
	
	public static void main(String[] args) {
		System.out.print(simpleToJulianDays(0));
	}

}*/
