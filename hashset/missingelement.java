class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> li = new ArrayList<>();
        TreeSet<Integer> set =new TreeSet<>();
        for(int i=low;i<=high;i++){
            set.add(i);
        }
        for(int j=0;j<arr.length;j++){
            if(set.contains(arr[j])){
                set.remove(arr[j]);
            }
        }
        for(int ele:set){
            li.add(ele);
        }
        return li;
    }
}
//happy number
class Solution {
    public static int nextNumber(int n){
        int ans=0;
        while(n > 0){
            int rem = n % 10;
            ans+=(rem*rem);
            n/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=nextNumber(n);
            if(n == 1) return true;
        }
        return false;
    }
}
