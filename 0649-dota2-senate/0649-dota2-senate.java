class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();

        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();

        for(int i=0; i<n; i++){
            if(senate.charAt(i) == 'R'){
                r.add(i);
            }else{
                d.add(i);
            }
        }

        while(!r.isEmpty() && !d.isEmpty()){
            int rInd = r.poll();
            int dInd = d.poll();

            if(rInd < dInd){
                r.add(rInd + n);
            }else{
                d.add(dInd + n);
            }
        }
        return r.isEmpty() ? "Dire" : "Radiant";
    }
}