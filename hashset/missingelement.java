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