import java.util.HashSet;

public class q10 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
//        int frq[]=new int[arr.length+2];
//        for(int i=0;i<arr.length;i++){
//            frq[arr[i]]++;
//        }
//        for(int i=1;i<frq.length;i++){
//            if(frq[i]==0){
//                System.out.print(i);
//                break;
//            }
//        }

        HashSet<Integer>hs = new HashSet<>();
        for(int i=0;i< arr.length;i++)hs.add(arr[i]);
        for(int i=1;i<=arr.length+1;i++)if(!hs.contains(i)){System.out.print(i);return;}
    }
}
