
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    // fields
    // syntax: private dataType nameOfField
    private int numerator;
    private int denominator;
    //constructor(s): public NameOfClass()
    public Fraction()
    {
        // the purpose of the constructor is to give initial values to
        // all of the fields.
        // Our class decided the default of a fraction should be 7/14
        numerator = 7; //store the value 7 in the field numerator
        denominator = 14; //store the value 14 in the field denominator, 
        // do not set a data type because then that creates a new local
        // instead of setting the value of the field
            
        
        
        
    }
    // method(s)
    // synatx: public returnType nameOfMethod()
    public double getDecimalValue()
    {
        //to return a value from a method, we use return.
        return numerator / denominator;
    }
    

}
