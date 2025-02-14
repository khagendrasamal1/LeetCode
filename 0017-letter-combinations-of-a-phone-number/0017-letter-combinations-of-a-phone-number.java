class Solution {
    String keypad[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits == null || digits.length() == 0)  return list;

        dfs(digits, list, new StringBuilder(), 0);

        return list;
    }

    void dfs(String digits, List<String> list, StringBuilder sb, int index){
        if(index == digits.length()){
            list.add(sb.toString());
            return;
        }

        String str = keypad[digits.charAt(index) - '0'];

        for(char c : str.toCharArray()){
            sb.append(c);
            dfs(digits, list, sb, index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}