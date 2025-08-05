class Comparator{
    boolean compare(int a, int b){
        if (a == b)return true;
        else return false;
    }

    boolean compare(String a, String b){
        if (a.equals(b))return true;
        else return false;
    }
    boolean compare(int[] a, int[] b){
        if (a.length != b.length)return false;
        else{
            for (int i=0;i<a.length;i++)
                if (a[i] != b[i])return false;
            return true;
        }

    }
}


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

 public static String decryptMessage(String encryptedMessage) {
        encryptedMessage= encryptedMessage.replaceAll(" ", "");
            int l = encryptedMessage.length(),row, col;
            if(Math.sqrt(l) == (int) Math.sqrt(l)){
                row = col = (int) Math.sqrt(l);
            }else{
                row = (int) Math.sqrt(l);
                col = row+1;
            }
            if(col * row < l) row++;
            char[][] arr = new char[row][col];
            int index = 0;
            for(int i = 0; i < row;i++){
                for(int j = 0; j < col;j++){
                    if(index < l)arr[i][j] = encryptedMessage.charAt(index);
                    else arr[i][j] = '0';
                    
                    index++;
                }
            }
            String ans = "";
            for(int i = 0; i < col;i++){
                for(int j = 0; j < row;j++)ans+= arr[j][i];
                ans += " ";
            }
            ans = ans.replaceAll("0","");
            return ans;
    }

}
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\