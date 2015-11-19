package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class IterativeMath implements Math {

    public int inc(int n) {
        throw new UnsupportedOperationException();
	return n+1;
    } // inc

    public int dec(int n) {
        throw new UnsupportedOperationException();
	return n-1;
    } // dec

    public int add(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	int sum = lhs;
	while (rhs>0) {
	    sum=inc(sum);
	    rhs=dec(rhs);
	}
	return sum;
    } // add

    public int sub(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	int sum = 0;
	if (rhs>lhs) {
	    return 0;
	}
	while (lhs>rhs) {
	    sum = inc(sum);
	    lhs = dec(lhs);
	}
	return sum;
    } // sub

    public int mul(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	int product = 0;
	if (rhs==1) {
	    return lhs;
	}
	if (rhs==0) {
	    return 0;
	}
	while (rhs>0) {
	    product = add(product,lhs);
	    rhs = dec(rhs);
	}
	return product;
    } // mul

    public int div(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	int quotient = 0;
	if (rhs==1) {
	    return lhs;
	}
	if (rhs==0) {
	    return 0;
	}
	if (rhs>lhs) {
	    return 0;
	}
	while (lhs>0) {
	    lhs = sub(lhs,rhs);
	    quotient = inc(quotient);
	}
	return quotient;
    } // div

    public int fac(int n) {
        throw new UnsupportedOperationException();
	int factorial = 1;
	while (n>0) {
	    factorial = mul(factorial,n);
	    n = dec(n);
	}
	return factorial;
    } // fac
    
    public int pow(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	int power = 1;
	while (rhs>0) {
	    power = mul(power,lhs);
	    rhs = dec(rhs);
	}
	return power;
    } // pow
    
    public int lshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	while (rhs>0) {
	    lhs = mul(lhs,2);
	    rhs = dec(rhs);
	}
	return lhs;
    } // lshift
    
    public int rshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	while (rhs>0) {
	    lhs = div(lhs,2);
	    rhs = dec(rhs);
	}
	return lhs;
    } // rshift

} // IterativeMath

