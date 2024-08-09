class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> dis = new HashSet<>();
        HashSet<String> dup = new HashSet<>();

        for(String str : arr){
            if(dup.contains(str)){
                continue;
            }
            if(dis.contains(str)){
                dis.remove(str);
                dup.add(str);
            }else{
                dis.add(str);
            }
        }

        for(String str : arr){
            if(!dup.contains(str)){
                k--;
            }
            if(k==0){
                return str;
            }
        }
        return "";
    }
}