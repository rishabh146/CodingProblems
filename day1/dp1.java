class Solution {
    public static int findFun(int n) {
        if(n==0)return 2;
        if(n==1)return 5;
        if(n==2)return 9;
        if(n==3)return 7;
        
        long mod=1000000007;
        long prev1=2;
        long prev2=5;
        long prev3=9;
        long prev4=7;
        long temp;
            if(i%2==0){
                long temp=(prev3*(i-2))%mod;
                long b=(prev1*(i-4))%mod ;
                temp=(a+b)%mod;
                prev1=prev2;
                prev2=prev3;
                prev3=prev4;
                prev4=temp ;
            }
            else{
                long a=(prev4*(i-1))%mod;
                long b=(prev2*(i-3))%mod;
                temp=(a+b)%mod;
                prev1=prev2;
                prev2=prev3;
                prev3=prev4;
                prev4=temp ;
            }
        return (int)prev4;
    }
}





// class Solution {
//     public static int findFun(int n) {
//         if(n==0)return 2;
//         if(n==1)return 5;
//         if(n==2)return 9;
//         if(n==3)return 7;
        
//         long mod=1000000007;
//         long prev1=2;
//         long prev2=5;
//         long prev3=9;
//         long prev4=7;
//         for(int i=4;i<=n;i++){
//             long temp;
//             if(i%2==0){
//                 long a=(prev3*(i-2))%mod;
//                 long b=(prev1*(i-4))%mod ;
//                 temp=(a+b)%mod;
//                 prev1=prev2;
//                 prev2=prev3;
//                 prev3=prev4;
//                 prev4=temp ;
//             }
//             else{
//                 long a=(prev4*(i-1))%mod;
//                 long b=(prev2*(i-3))%mod;
//                 temp=(a+b)%mod;
//                 prev1=prev2;
//                 prev2=prev3;
//                 prev3=prev4;
//                 prev4=temp ;
//             }
//         }
//         return (int)prev4;
//     }
// }
        
// class Solution {
//     public static int findFun(int n) {
//         // code here
//         if(n==0)return 2;
//         if(n==1)return 5;
//         if(n==2)return 9;
//         if(n==3)return 7;

        
//         long arr[]=new long[n+1];
//         arr[0]=2;
//         arr[1]=5;
//         arr[2]=9;
//         arr[3]=7;
       
//         long mod=1000000007;
//         for(int i=4;i<=n;i++){
//             if(i%2==0){
//                 arr[i]=((arr[i-2]*(i-2))%mod+(arr[i-4]*(i-4))%mod)%mod ;
//             }
//             else{
//                 arr[i]=((arr[i-1]*(i-1))%mod+(arr[i-3]*(i-3))%mod)%mod;
//             }
//         }
//         return (int)arr[n];
//     }
// }
