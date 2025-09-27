class Solution {     
    public double largestTriangleArea(int[][] points) {         
        //triangle has 3 sides         
        //(xi,yi),  (x2,y2) and (x3,y3) => 3 for loops         
        int n = points.length;         
        double maxArea  = 0.0;          

        //for x1,y1        
        for(int i = 0; i<n; i++){         
            //for x2,y2         
            for(int j = i+1; j< n; j++){         
                // for x3,y3             
                for(int k = j+1 ; k<n; k++){                                 
                    double x1 = points[i][0];                 
                    double y1 = points[i][1];                                 

                    double x2 = points[j][0];                 
                    double y2 = points[j][1];                  

                    double x3 = points[k][0];                 
                    double y3 = points[k][1];                                  

                    //side a                 
                    double a = Math.hypot((x2-x1), (y2-y1)); //nothing but sqrt.(x2-x1), (y2-y1)                 
                    //side b                 
                    double b = Math.hypot((x2-x3),(y2-y3));                 
                    //side c                 
                    double c = Math.hypot((x3-x1),(y3-y1));                                  

                    //herons  formula                 
                    double s = (a + b + c) *0.5;                  

                    double heron = Math.sqrt(Math.max(0, s*(s-a)* (s-b)* (s-c)));                  

                    double otherway = 0.5 * Math.abs(x1 * (y2-y3) + x2 * (y3-y1) + x3 *(y1-y2));                  

                    maxArea = Math.max(maxArea, Math.max(heron ,otherway));              
                }         
            }        
        }         
        return maxArea;      
    } 
} 

//So there are 2 ways to calulate triangle area  
// herons formula  
//1/2* abs(x1(y2-y3) + x2(y3-y1) + x3(y1-y2))  
