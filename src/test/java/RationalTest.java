import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testSubtract(){
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;

        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testMultiply(){
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 1;

        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;

        x.multiply(y);

        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void testDivide(){
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 1;

        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;

        x.divide(y);
        Assert.assertEquals(4, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }


    @Test
    public void testEqual(){
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 1;

        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 2;

        x.equals(y);
        Assert.assertNotEquals(x, y);

        Rational x1 = new Rational();
        x.numerator = 3;
        x.denominator = 2;

        Rational y1 = new Rational();
        y.numerator = 3;
        y.denominator = 2;

        x.equals(y1);
        Assert.assertEquals(x1, y1);
    }


    @Test
    public void testCompare() throws Rational.Illegal {
        // case 1
        Rational x = new Rational(2, 4);
        Rational y = new Rational(1, 2);
        Assert.assertEquals(0, x.compareTo(y)); // 0 Because it's equal

        // case 2
        x = new Rational(3, 4);
        y = new Rational(1, 2);
        Assert.assertEquals(1, x.compareTo(y)); // 1 Because 3/4 > 1/2

        // case 3
        x = new Rational(1,3);
        y = new Rational(1,2);
        Assert.assertEquals(-1, x.compareTo(y)); // -1 Because 1/3 < 1/2
    }

    @Test
    public void testToString() throws Rational.Illegal {
        Rational x = new Rational(2, 4);
        String val = x.toString();
        Assert.assertEquals("1/2", val);
    }

}
