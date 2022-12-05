class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int bottom = stack.peek();
                stack.push(top);
                stack.push(top + bottom);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.valueOf(op));
            }
        }
        
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}