package lc_134;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gastotal=0;
        int costtotal=0;

        for(int i=0;i<gas.length;i++){
            gastotal+=gas[i];
            costtotal+=cost[i];
        }
        // if sum of array cost is greater than sum of array gas it is not possible
        if(gastotal<costtotal){
            return -1;
        }
        int total=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i];
            total-=cost[i];
            if(total<0){
                total=0;
                index=i+1;
            }
        }
        return index;
    }
}
