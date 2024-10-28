class Solution {
    public String solution(String code) {
    	int mode = 0;
    	String ret = "";
    	char[] c = code.toCharArray();
    	for(int i = 0; i < c.length; i++) {
    		switch (mode) {
				case 0:
					if(c[i] == '1') {
	    				mode = 1;
	    			} else if(i % 2 == 0) {
	    				ret += c[i];
	    			}	break;
				case 1:
					if(c[i] == '1') {
	    				mode = 0;
	    			} else if(i % 2 == 1) {
	    				ret += c[i];
	    			}	break;
				}
    	}
    	return ret == "" ? "EMPTY" : ret;
    }
    
}