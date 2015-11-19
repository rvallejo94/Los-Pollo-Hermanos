package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class RecursiveMath implements Math {

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
	if (rhs==0) {
	    return lhs;
	}
	return add(inc(lhs),dec(rhs));
    } // add

    public int sub(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	if (rhs==0) {
	    return lhs;
	}
	if (rhs>lhs) {
	    return 0;
	}
	return sub(dec(lhs),dec(rhs));
    } // sub

    public int mul(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	if (rhs==0) {
	    return 0;
	}
	if (rhs==1) {
	    return lhs;
	}
	return add(lhs,mul(lhs,pred(rhs)));
    } // mul

    public int div(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	if (rhs>lhs) {
	    return 0;
	}
	if (lhs==rhs) {
	    return 1;
	}
	return inc(div(sub(lhs,rhs),rhs));
    } // div

    public int fac(int n) {
        throw new UnsupportedOperationException();
	if (n==0) {
	    return 1;
	}
	return n * fac(dec(n));
    } // fac
    
    public int pow(int lhs, int rhs) {
        throw new UnsupportedOperationException();
	if (rhs==0) {
	    return 1;
	}
	return lhs * pow(lhs,dec(rhs));
    } // pow
    
    public int lshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // lshift
    
    public int rshift(int lhs, int rhs) {
        throw new UnsupportedOperationException();
    } // rshift

} // RecursiveMath


