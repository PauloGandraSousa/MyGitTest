/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Paulo Gandra Sousa
 */
public final class Math {

	private Math() {
	}

	/**
	 * determines if a number is odd.
	 *
	 * @param i the number to be tested
	 * @return
	 */
	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}

	/**
	 * determines if a number is even.
	 *
	 * @param i the number to be tested
	 * @return
	 */
	public static boolean isEven(int i) {
		return i % 2 == 0;
	}

	/**
	 * checks whether an int is prime or not.
	 * http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
	 *
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		// check if n is a multiple of 2
		if (n % 2 == 0) {
			return false;
		}
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Permite efectuar a conversão de um valor para outra escala.
	 *
	 * @param oldMin - exemplo 0
	 * @param oldMax - exemplo 100
	 * @param newMin - exemplo 0
	 * @param newMax - exemplo 10
	 * @param oldValue - exemplo 50
	 * @return retorna o novo valor aplicando uma conversão linear - exemplo 5
	 */
	public static float simpleLinearConversion(float oldMin, float oldMax,
											   float newMin, float newMax,
											   float oldValue) {
		float new_value;
		new_value = ((oldValue - oldMin) / (oldMax - oldMin))
				* (newMax - newMin) + newMin;
		return new_value;

	}

	/**
	 * Permite efectuar a conversão de um valor para outra escala.
	 *
	 * @param oldMin - exemplo 0
	 * @param oldMax - exemplo 100
	 * @param newMin - exemplo 0
	 * @param newMax - exemplo 10
	 * @param oldValue - exemplo 50
	 * @return retorna o novo valor aplicando uma conversão linear - exemplo 5
	 */
	public static BigDecimal simpleLinearConversion(BigDecimal oldMin,
													BigDecimal oldMax,
													BigDecimal newMin,
													BigDecimal newMax,
													BigDecimal oldValue) {
		BigDecimal new_value;
		new_value = ((oldValue.subtract(oldMin)).divide(
				oldMax.subtract(oldMin), 1, RoundingMode.HALF_UP))
				.multiply((newMax.subtract(newMin)).add(newMin));
		return new_value;
	}

	public static String format(BigDecimal amount) {
		// TODO use number formatter
		return amount.toString();
	}

	/**
	 * returns a representation of a number as Roman numeral.
	 *
	 * @param number
	 * @return
	 */
	public static String formatAsRomanNumeral(int number) {
		RomanNumeral roman = new RomanNumeral(number);
		return roman.toString();
	}
}
