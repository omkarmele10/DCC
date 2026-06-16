class Solution {
    public String processStr(String s) {
        StringBuilder sbr  = new StringBuilder();
        for(char ch : s.toCharArray() ){
            if(ch == '*' && sbr.length() > 0 ) sbr.deleteCharAt(sbr.length()-1);
            else if(ch == '#') sbr.append(sbr);
            else if(ch == '%' )sbr = sbr.reverse();
            else if(ch >='a' && ch<='z') sbr.append(ch);
        }
        return  sbr.toString();
    }
}
