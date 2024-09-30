import java.util.Arrays;;
class TrappingRainwater{

    public static int TrappingRainwaterCalc(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];

        //Edge case
        if(n==1 || n==2){
            return -1;
        }

        //Calculate leftMax boundary
        leftMax[0]=height[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculate RightMax boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        // waterlevel
        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i], rightMax[i]);
            trappedWater+=(waterlevel-height[i])*1;
        }
        return trappedWater;

    }
    public static void main(String[] args) {

        int height[]={9,3,2,4,26,3};
        int result=TrappingRainwaterCalc(height);
        System.out.println(result);
    }
}