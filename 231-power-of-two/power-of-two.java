class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        else if (n % 2 != 0) {
            return false;
        }
        else {
            while (n > 0) {
                // any odd number as a factor couldn't
                // comprise a power of 2
                if (n % 2 != 0 && n != 1) {
                    return false;
                }
                else if (n == 1) {
                    return true;
                }
                n /= 2;
            }
        }
        return false;
    }
}