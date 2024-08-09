class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employee = 0;
        int n=hours.length;
        for(int i=0;i<n;i++){
            if(hours[i]>=target){
                employee++;
            }
        }
        return employee;
    }
}