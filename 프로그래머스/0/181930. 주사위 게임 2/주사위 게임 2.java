class Solution {
    public int solution(int a, int b, int c) {
    	int answer = 1;
    	int n1 = Integer.compare(a, b);
    	int n2 = Integer.compare(b, c);
    	int n3 = Integer.compare(a, c);
    	int[] n = {n1, n2, n3};
    	int count = 0;
    	for(int i = 0; i < 3; i++) {
    		if(n[i] == 0) count++;
    	}
    	
    	for(int i = 1; i <= count + 1; i++) {
    		if(i == 4) continue;
    		System.out.println(i);
    		int a1 = (int)Math.pow(a, i);
    		int b1 = (int)Math.pow(b, i);
    		int c1 = (int)Math.pow(c, i);
    		answer *=  a1 + b1 + c1;
    		System.out.println(answer);
    	}
    	
    		
        return answer;
    }
}