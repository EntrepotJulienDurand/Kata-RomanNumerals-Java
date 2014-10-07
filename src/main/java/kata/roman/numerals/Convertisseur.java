package kata.roman.numerals;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class Convertisseur {

	private static Map<Integer, String> correspondanceArabeRomain = new LinkedHashMap<Integer, String>();

	static {
		correspondanceArabeRomain.put(1000, "M");
		correspondanceArabeRomain.put(900, "CM");
		correspondanceArabeRomain.put(500, "D");
		correspondanceArabeRomain.put(400, "CD");
		correspondanceArabeRomain.put(100, "C");
		correspondanceArabeRomain.put(90, "XC");
		correspondanceArabeRomain.put(50, "L");
		correspondanceArabeRomain.put(40, "XL");
		correspondanceArabeRomain.put(10, "X");
		correspondanceArabeRomain.put(9, "IX");
		correspondanceArabeRomain.put(5, "V");
		correspondanceArabeRomain.put(4, "IV");
		correspondanceArabeRomain.put(1, "I");
	}

	public static String converti(int arabe) {
		String romain = StringUtils.EMPTY;
		for (Integer valeur : correspondanceArabeRomain.keySet()) {
			while (arabe >= valeur) {
				romain += correspondanceArabeRomain.get(valeur);
				arabe -= valeur;
			}
		}
		return romain;
	}
}
