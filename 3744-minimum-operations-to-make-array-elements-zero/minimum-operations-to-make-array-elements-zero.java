class Solution {
    //total steps for all numbers in [l, r]
    private long solve(long l, long r) {
        long L = 1;   // start
        long S = 1;   // step count for this bucket
        long totalSteps = 0;

        while (L <= r) {
            long R = 4 * L - 1;  // end

            long start = Math.max(L, l);
            long end = Math.min(R, r);

            if (start <= end) {
                long count = end - start + 1;
                totalSteps += count * S;
            }

            L *= 4; // move to next 
            S++;    
        }

        return totalSteps;
    }

    public long minOperations(int[][] queries) {
        long result = 0;

        for (int[] query : queries) {
            long l = query[0];
            long r = query[1];

            long steps = solve(l, r);
            result += (steps + 1) / 2; // ceil(steps/2)
        }

        return result;
    }
}

//TLE
// class Solution {
//     //calculate steps
   
//     private int countSteps(int x){ 
//         int count = 0;
//         while(x > 0){
//           x = x / 4;
//           count ++;   
//         }
//     return count;
// }
   
 
    
//     public long minOperations(int[][] queries) {
//         //logic is simple
//         //take 2 numbers a and b => a/4 and b/4 until they become 0
//         //operations? 
//         //so we know 1/4 = 0 - 1step
//         //1 =< x <= 3 -take 1 step and .. so on
//         //each time we take 2 numbers so => one operation => 2 steps
//         // so ceil(total opearations / 2) => ans

//       int total = 0; 

//       for(int[] query : queries){
//         int sumofsteps = 0;
//         //l and r => range of integer thatll be /4
//         int l = query[0] ; int r = query[1];
        
//         for(int num = l ; num <= r; num++){
//             sumofsteps = sumofsteps + countSteps(num);
//         }

//         //each operation process 2 numbers so totalsteps/2
//         int ops = (sumofsteps + 1)/2;  //same as ceil(sumofsteps/2);
//         total += ops;
//       }
        
//       return total; 

//     }
// }




// // Query 1: [1,2]
// // nums = [1,2]
// // Steps per element (how many /4-divisions to reach 0):

// // 1 → 1 step

// // 2 → 1 step
// // Sum = 2 → operations = ceil(2/2) = 1.
// // (Check: pick (1,2) → (0,0) in one operation.)