/*
find max element in given digit 
let input 111
then max is 1 then 1;
and 221-->111
          110 
          
*/
class Solution {
    public int minPartitions(String n) {
        int max = n.charAt(0)-'0';
        for(int i=0;i<n.length();i++){
            max=Math.max(n.charAt(i)-'0',max);
        }
        return max;
    }
}
