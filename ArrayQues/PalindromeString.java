
class PalindromeString{

    public static boolean checkPal(String str){

        char ch[] =str.toCharArray();
        
        for(int i=0,j=ch.length-1; i < j ;i++,j--){

            if(ch[i]!=ch[j]){
                return false;
            }

        }
       

        return true;
    }

    public static void main(String[] args){
        String str="aba";
        System.out.println(checkPal(str));
    }
    
}