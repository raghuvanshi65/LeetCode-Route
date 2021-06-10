class Solution {
	public String sortSentence(String s) {
    	String[] arr = s.split("\\s+");
    	String[] arr1 = new String[arr.length+1];

    	for(String s1 : arr){
    		int length = s1.length()-1;
    		String s2 = s1.substring(0,length);
    		arr1[Character.getNumericValue(s1.charAt(length))] = s2;
    	}    


    	StringBuilder sb = new StringBuilder();
    	for(int i=1 ; i<arr1.length-1 ; i++){
    		sb.append(arr1[i]+" ");
    	}

    	sb.append(arr1[arr1.length-1]);
    	return sb.toString();
    }
}