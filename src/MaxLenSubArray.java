public class MaxLenSubArray {
    public static void main(String[] args) {
int [][] i={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(i));
    }


    public static int maximumWealth(int[][] accounts) {
        int sum=0;
        int num=0;
        System.out.println(accounts.length);
for(int i=0;i<accounts.length;i++){
    num=0;
    for(int j=0;j<accounts[0].length;j++){
        num+=accounts[i][j];
    }
    if(num>sum){
        sum=num;
    }
}
return sum;
    }
}
