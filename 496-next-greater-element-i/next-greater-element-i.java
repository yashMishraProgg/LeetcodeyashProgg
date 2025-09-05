class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //here this is slightly different from next greater element
        //we have to find the next greater element from num2 0f num1
        //we use stack to keep  a track and element and a hashmap to map the greater element from num 1 like  map num(4) -> -1(next greater)

        Map<Integer , Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        for(int i= 0;i < nums2.length ;i++){
            
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(),nums2[i]); //we dont need less number
            }
            //else push the element in the stack
            stack.push(nums2[i]);
        }

        //if no greater element push -1
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }

        //get the numbers map with next greater from num1
        int[] result = new int[nums1.length];
        
        for(int i=0; i< nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}