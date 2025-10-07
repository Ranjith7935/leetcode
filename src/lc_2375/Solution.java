package lc_2375;

public class Solution {
    public String smallestNumber(String pattern) {

        pattern+="I";
        StringBuilder s= new StringBuilder();
        StringBuilder temp=new StringBuilder();
        int cnt=0;
        for(char ch:pattern.toCharArray()) {
            temp.append(++cnt);
            if(ch=='I') {
                s.append(temp.reverse());
                temp.delete(0, temp.length());
            }
        }
        return s.toString();

    }
}

