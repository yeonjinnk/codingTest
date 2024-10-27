class Solution {
    public int solution(int a, int b) {
    	String s1 = a + "" + b;
    	String s2 = b + "" + a;
    	
    	int n1 = Integer.valueOf(s1);
    	int n2 = 2 * a * b;
    	int answer = 0;
    	answer = (n1 > n2 ? n1 : n2);
    	
        return answer;
    }
}