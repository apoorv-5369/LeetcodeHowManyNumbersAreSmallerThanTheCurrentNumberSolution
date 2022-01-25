// Method-1: using Brute Force.
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]&&j!=i){
                    count++;
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
    }
}

// Method-2: using HashMap.
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] nums1 = nums.clone();
        Arrays.sort(nums1);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=size-1;i>=0;i--){
            hm.put(nums1[i], i);
        }
        for(int i=0;i<size;i++){
           nums[i]=hm.get(nums[i]);
        }
        return nums;
    }
}
