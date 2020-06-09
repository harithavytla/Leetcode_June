class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}




class Solution {
    public boolean isSubsequence(String s, String t) {
        int previous=-1;
        for(int i=0;i<s.length();i++){
            int index=t.indexOf(s.charAt(i),previous+1);
            if(previous>=index){
                return false;
            }
            previous=index;
        }
        return true;
    }
}