/**
 * This class represents a fraction. Within this class there are methods to multiply and divide fractions,
 * as well as ones that get the numerator and denominator of the fraction.
 *
 * @Author Wallace Z. McCarthy
 * @UUID u0838487
 * @Version February 14, 2023
 */

package assignment06;

// This class represents a fraction. Within this class there are methods to multiply and divide fractions,
public class Fraction
{
    // The variables below are instance variables accessible by any method in this class.
    // They are the numerator and denominator of the fraction.
    private int numerator;
    private int denominator;

    /**
     * This is the constructor for the Fraction class. It takes in two integers, the numerator and denominator.
     * @param n numerator
     * @param d denominator
     */
    public Fraction (int n, int d)
    {
        this.numerator   = n;
        this.denominator = d;
    }

    /**
     * This method multiplies two fractions together.
     * @param rightHandSide the fraction that is being multiplied by the fraction that is calling this method.
     * @return the product of the two fractions.
     */
    public Fraction multiply (Fraction rightHandSide)
    {
        // Create a variable to hold the result
        Fraction result;

        // Build a new Fraction object - send the products to the constructor.
        result = new Fraction (this.numerator * rightHandSide.numerator,
                this.denominator * rightHandSide.denominator);

        // Pass the resulting fraction back to the caller.
        return result;
    }

    /**
     * This method divides two fractions.
     * @param rightHandSide The fraction that is being divided by the fraction that is calling this method.
     * @return The quotient of the two fractions.
     */
    public Fraction divide (Fraction rightHandSide)
    {
        // Create a variable to hold the result
        Fraction result;

        // Build a new Fraction object - send the products to the constructor.
        result = new Fraction (this.numerator * rightHandSide.denominator,
                this.denominator * rightHandSide.numerator);

        // Pass the resulting fraction back to the caller.
        return result;
    }

    /**
     * This method gets the numerator of the fraction.
     * @return numerator
     */
    public int getNumerator()
    {
        return numerator;
    }

    /**
     * This method gets the denominator of the fraction.
     * @return denominator
     */
    public int getDenominator()
    {
        return denominator;
    }

    /**
     * This method returns the fraction as a string.
     * @return The fraction
     */
    @Override
    public String toString ()
    {
        return this.numerator + "/" + this.denominator;
    }
}
