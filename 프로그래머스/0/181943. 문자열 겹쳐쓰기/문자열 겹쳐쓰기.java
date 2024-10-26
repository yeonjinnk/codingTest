class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
      char[] m = my_string.toCharArray();
    	char[] o = overwrite_string.toCharArray();

    	for(int i = s; i < o.length + s; i++) {

        	m[i] = o[i - s];
        }
    	String answer = "";
    	
    	for(int i = 0 ; i < m.length; i++) {
    		answer += m[i];
    	}
        return answer;
    }
}