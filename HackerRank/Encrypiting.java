package Java.HackerRank;

public class Encrypiting{
    public static String encryption(String s) {
        // Write your code here
        // StringBuilder str = new StringBuilder();
        // for(int i=0;i<s.length();i++){  
        //     if(s.charAt(i)!=' '){
        //         str.append(s.charAt(i));
        //     }
        // }
        s = s.replaceAll("\\s","");
        int row =(int) Math.sqrt(s.length());
        int col = row+1;
        if(row*col<s.length()){
            row=row+1;
        }
        char[] arr = s.toCharArray();
        char[][] x = new char[row][col];
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(k==s.length()) break;
                x[i][j] = arr[k];
                k++;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){ 
                str.append(x[j][i]);                
            }
            if(i==col) break;
            str.append(" ");
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)==' '){
                str.deleteCharAt(i);
            }
        }
        System.out.println(str.length());
        String ans = str.toString();
        ans = ans.trim();
        System.out.println(ans.length());
        // System.out.println(s);
        // System.out.println(row+" "+col +" " + s.length());
        // for(char[] item:x){
        //     System.out.println(item);
        // }
        
        return ans;
    }
        
    public static void main(String[] args) {
        String str = "feed the dog";
        System.out.println(encrypt(str));
    }

    public static String encrypt(String s){
        s = s.replaceAll("\\s","");
        int row = (int)Math.floor(Math.sqrt(s.length()));
        int col = (int)Math.ceil(Math.sqrt(s.length()));
        if(row*col < s.length()) row++;
        // System.out.println(row + " " + col + " " + s.length());

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i <col; i++){
            for(int j = 0; j <s.length(); j++){
                if(i+j<s.length()){
                    ans.append(s.charAt(i+j));
                    j+=col-1;
                }
            }
            ans.append(" ");
        }
        String str = ans.toString();
        return str;
    }
}