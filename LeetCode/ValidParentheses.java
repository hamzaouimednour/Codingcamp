class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> p = new HashMap<>();
        p.put(')', '(');
        p.put(']', '[');
        p.put('}', '{');
        for(char c : s.toCharArray()) {
            if(p.containsKey(c)) {
                if(stack.isEmpty() == false && stack.lastElement() == p.get(c)) {
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
