class Solution {
    public String solution(String str1, String str2) {
       char[] c1 = str1.toCharArray();
    	char[] c2 = str2.toCharArray();
    	String answer = "";
    	for(int i = 0; i < c1.length; i++) {
//    		System.out.println(c1[i]);
    		answer += c1[i];
    		answer += c2[i];
//    		System.out.println(answer);
    	}
        return answer;
    }
}