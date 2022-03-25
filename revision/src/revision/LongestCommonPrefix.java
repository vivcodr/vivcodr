package revision;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("Hello LeetCoder");
        //String[] strs = {"abca", "aba", "aaab"};
        String[] strs = {"cir", "car"};
        // System.out.println("Longest prefix "+ longestCommonPrefix(strs));
        System.out.println("Longest prefix "+ longestCommonPrefix2(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        //1 take the first string and compare all the rest of the string if they start             with that string till the first string length is lower then the other                 String in array.
        //2. if you found another String smaller then the first string, then swap the             String in array take the string start comparing
        //  String and start comparing the same with others for prefix  
        if(strs.length == 0)
            return "";
        int i = 0;
        String prefix = "";
        while( i < strs.length) {
            if("".equals(prefix))
                prefix = strs[i].substring(i, i + 1);
            else {
                if(!strs[i].startsWith(prefix))
                    return "No common prefix";
                else {
                    prefix += strs[i].substring(i, i +1);
                    if(!strs[i -1].startsWith(prefix)) {
                    	prefix = prefix.substring(0, prefix.length() -1);
                    }
               }   
            }
            i++;    
        }
        return prefix;
    }
    
    public static String longestCommonPrefix2(String[] strs) {
        //1 take the first string and compare all the rest of the string if they start             with that string till the first string length is lower then the other                 String in array.
        //2. if you found another String smaller then the first string, then swap the             String in array take the string start comparing
        //  String and start comparing the same with others for prefix  
        if(strs.length == 0)
            return "";
        String prefix = "";
        String firstString = strs[0];
        for(int i = 0 ; i < firstString.length(); i++) {
        	prefix += firstString.substring(i, i+1);
        	for(int j = 1; j < strs.length; j++) {
        		if(!strs[j].startsWith(prefix)) {
        			if(prefix.length() > 1)
        				return prefix = prefix.substring(0, prefix.length() -1 );
        			else
        				return "";
        		}
        	}
        }
        return prefix;
    }
}
