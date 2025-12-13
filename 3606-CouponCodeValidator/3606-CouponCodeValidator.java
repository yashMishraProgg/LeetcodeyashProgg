// Last updated: 12/13/2025, 11:41:09 PM
1class Solution {
2    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
3        
4        //one list to store universal answer
5        List<String> list = new ArrayList<>();
6
7        List<String> lista = new ArrayList<>();
8        List<String> listb = new ArrayList<>();
9        List<String> listc = new ArrayList<>();
10        List<String> listd = new ArrayList<>();
11
12        //check if the coupan is empty or not
13        for(int i = 0; i < code.length; i++){
14
15            String curr = code[i]; //i = coupon 
16
17            if(curr.isEmpty()) continue;
18
19            if(!stringCheck(curr)) continue;
20
21            //check if its active and contains valid business
22            if(businessLine[i].equals("electronics") && isActive[i]) lista.add(curr);
23            if(businessLine[i].equals("grocery") && isActive[i]) listb.add(curr);
24            if(businessLine[i].equals("pharmacy") && isActive[i]) listc.add(curr);
25            if(businessLine[i].equals("restaurant") && isActive[i]) listd.add(curr);
26        }
27
28        //now add these coupans in one place
29        Collections.sort(lista);
30        Collections.sort(listb);
31        Collections.sort(listc);
32        Collections.sort(listd);
33
34        list.addAll(lista);
35        list.addAll(listb);
36        list.addAll(listc);
37        list.addAll(listd);
38
39        return list;
40    }
41
42    public boolean stringCheck(String cur){
43        for(char c : cur.toCharArray()){
44            if(!(Character.isLetterOrDigit(c) || c == '_')){
45                return false;
46            }
47        }
48        return true;
49    }
50}
51