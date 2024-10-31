class Solution {
    public String solution(int[] numLog) {
    	String answer = "";
    	for(int i = 1; i < numLog.length; i++) {
    		int num = Math.abs(numLog[i] - numLog[i-1]);
    		switch(num) {
    		case 1: 
    			if(numLog[i] > numLog[i-1]) {
    				answer += "w"; break;
    			} else {
    				answer += "s"; break;
    			}
    		case 10 : {
    			if(numLog[i] > numLog[i-1]) {
    				answer += "d"; break;
    			} else {
    				answer += "a"; break;
    			}
    			}
    		default: return "";
    		}
    	}
    	return answer;
    }
}