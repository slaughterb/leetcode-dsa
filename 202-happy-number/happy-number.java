class Solution {

    public int sumSquaredDigits(int num) {
        int res = 0;
        while (num > 0) {
            int dig = num % 10;
            res += Math.pow(dig, 2);
            num /= 10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        // Tortoise and hare method is applicable here because
        // we are testing for the existence of a cycle

        int slow = sumSquaredDigits(n);
        int fast = sumSquaredDigits(sumSquaredDigits(n));

        while (slow != fast) {
            slow = sumSquaredDigits(slow);
            fast = sumSquaredDigits(sumSquaredDigits(fast));
        }

        return slow == 1;
    }
}