class Solution {
    public boolean isPalindrome(String st) {
        st=st.replaceAll("[^a-zA-Z0-9]", "");
        st=st.toLowerCase();
        int len=st.length();
        for(int i=0;i<len/2;i++){
            if(st.charAt(i)!=st.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
