// The StackRecursion class that implements several methods
// Michael Roy

public class StackRecursion {


    // This method subtracts num2 from num1 (both represented as CharStacks), and
    // saves the result on a stack.
    // Do not create any arrays! Do not use any Java libraries to do the
    // calculation.
    // Doing so will result in points deduction.
    public String subtractBigInteger(CharStack num1, CharStack num2) {
        CharStack stackResult = new CharStack(64); // stack used to store the result of the multiplication
        char borrow = 0;

        // as long as num2 has chars left, we run this loop
        // so we run this loop for num2.size() times
        while (!num2.isEmpty()) {
            // pop both elements and subtract (with borrow if applicable)
            int sub = ((num1.pop() - '0') - (num2.pop() - '0') - borrow);
            // if sub is less than 0 we need to borrow and add 10 to the subtracted value
            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } 
            // otherwise borrow should be 0
            else {
                borrow = 0;
            }
            // add the subtracted value to the resulting stack
            stackResult.push((char) (sub + 48));
        }

        // some numbers might be left in num1
        // we run this loop num1.size() times
        while (!num1.isEmpty()) {
            // logic same as above
            int sub = ((num1.pop() - '0') - borrow);
            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            stackResult.push((char) (sub + 48));
        }

        // we remove all the leading '0's till size doesn't become 0
        while (stackResult.top() == '0' && stackResult.size() > 1) {
            stackResult.pop();
        }

        // return result
        return stackResult.toString(); // return a string representation of the stack
    }

    // This method takes an int as the parameter and estimates the result of the series.
    // The result is then considered as an approximation
    // of pi. The method returns the approximated pi.
    public double computePI(int n) {
        // Base case
        // pi(1) = 4
        if (n == 1)
            return 4;

        // Recursive case
        // pi(n) = pi(n - 1) +/- (1/(2n - 1))
        // + or - will be evaluated based on whether n is even or odd
        // so we either add or subtract the nth term to pi(n - 1)
        // based on whether n is even or odd
        return computePI(n - 1) + (n % 2 == 0 ? -1 : 1) * (4 / ((double) (2 * n - 1)));
    }

    // This method reads a string and returns the string in the reversed order.
    public String reverseStringRec(String s) {
        // Base case
        // reverse of strings with lengths 0 and 1 is the string itself
        if (s.length() == 0 || s.length() == 1)
            return s;
        
        // Recursive case
        // eg: reverse(abcd) = reverse(bcd) + a
        return reverseStringRec(s.substring(1)) + s.charAt(0);
    }

    // This method takes as parameters a reference to the head of a linked list, a
    // position specified by n, and a key. It returns the number of occurrences
    // of the key in the linked list beginning at the n-th node. If n = 0, it means
    // you should search in the entire linked list. If n = 1, then you should skip
    // the first node in the list.
    public int numOccurrencesRec(LNode node, int n, int key) {
        // base case
        // if node is null we return 0
        if (node == null)
            return 0;

        // if n is not 0, we need to go to the next link but with
        // value of n decremented once
        if (n != 0)
            return numOccurrencesRec(node.getLink(), n - 1, key);

        // if n is 0
        // we simply count recursively
        // if current node has key, then we add 1 to the recursive call (from the next node)
        // otherwise we add 0
        return (node.getInfo() == key ? 1 : 0) + numOccurrencesRec(node.getLink(), 0, key);
    }
}