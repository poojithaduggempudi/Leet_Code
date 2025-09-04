class Solution {
    public boolean isPalindrome(int x) {
      Scanner s=new Scanner (System.in);
        int temp=x;
        int rev=0;
        while(temp>0){
            int ld=temp%10;
            rev=(rev*10)+ld;
            temp=temp/10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }
    }
}