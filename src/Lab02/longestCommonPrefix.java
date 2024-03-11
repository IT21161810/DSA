package Lab02;

public class longestCommonPrefix {

	public static void main(String[] args) {

		String[] strs = {"fpower", "fiow", "fmight"};
	    String commonPrefix = null;
		try {
			commonPrefix = longestCommonPrefix(strs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("The longest common prefix is: " + commonPrefix);

	}

	public static String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) {
	        return "";
	    }
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++) {
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) {
	                return "";
	            }
	        }
	    }
	    return prefix;
	}
	
	

}
