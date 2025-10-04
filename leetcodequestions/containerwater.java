
package leetcodequestions;
public class containerwater {
    public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxWater=0;
        while(i<=j){
            int w=j-i;
            int h=Math.min(height[i], height[j]);
            int area=w*h;
            maxWater=Math.max(maxWater, area);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
