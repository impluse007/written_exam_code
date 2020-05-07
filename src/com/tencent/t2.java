
import java.util.Scanner;

public class t2{
    public static int[] reverse(int[] nums,int len,int[] times,int len1){
        int []r=new int[len1];
        for(int i=0;i<len1;i++){
            int []temp=new int[len];
            int res=0;
            reversecore(nums,times[i]);
            for(int j=1;j<len;j++){
                if(nums[j]<nums[j-1])
                    temp[j]=temp[j-1]+1;
                r[i]+=temp[j];
            }

        }
        return r;
    }
    public static void reversecore(int[]nums,int len){
        int t=nums.length/len;
        for(int i=0;i<t;i++){
            int s=i*len;
            int j=(i+1)*len-1;
            for(int p=0;p<len/2;p++){
                int temp=nums[s+p];
                nums[s+p]=nums[j-p];
                nums[j-p]=temp;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=(int)Math.pow(2,n);
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int len1=sc.nextInt();
        int[] times=new int[len1];
        for(int i=0;i<len1;i++){
            int temp=sc.nextInt();
            times[i]=(int)Math.pow(2,temp);
        }
        int []res=reverse(nums,len,times,len1);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
