package kata.roman.numerals;

import static kata.roman.numerals.Convertisseur.converti;
import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class ConvertisseurTest {

	@Test
	public void peutConvertirDesChiffres() {
		valideLaConversion(1, "I");
		valideLaConversion(5, "V");
		valideLaConversion(10, "X");
		valideLaConversion(50, "L");
		valideLaConversion(100, "C");
		valideLaConversion(500, "D");
		valideLaConversion(1000, "M");
	}

	@Test
	public void peutConvertirLesAdditions() {
		valideLaConversion(3, "III");
		valideLaConversion(8, "VIII");
		valideLaConversion(31, "XXXI");
	}

	@Test
	public void peutConvertirLesSoustractions() {
		valideLaConversion(4, "IV");
		valideLaConversion(9, "IX");
		valideLaConversion(40, "XL");
		valideLaConversion(90, "XC");
		valideLaConversion(400, "CD");
		valideLaConversion(900, "CM");
	}

	@Test
	public void peutConvertir4888() {
		valideLaConversion(4888, "MMMMDCCCLXXXVIII");
	}

	public void valideLaConversion(int arabe, String romain) {
		assertThat(converti(arabe)).isEqualTo(romain);
	}
}
