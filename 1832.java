class Solution {
    public boolean checkIfPangram(String str) {
        boolean flag = false;
        for(char ch = 'a';ch<='z';ch++){
            boolean panagram = check_panagram (ch, str);
            if(panagram == false){
                flag = false;
                break;
            }else
                flag = true;
        }
          return flag;
    }

    
   public boolean check_panagram(char ch, String str){
        for(char c : str.toCharArray()){
            if (c==ch)
                return true;
            }
            return false;
            
        }

}
