class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        
        //one list to store universal answer
        List<String> list = new ArrayList<>();

        List<String> lista = new ArrayList<>();
        List<String> listb = new ArrayList<>();
        List<String> listc = new ArrayList<>();
        List<String> listd = new ArrayList<>();

        //check if the coupan is empty or not
        for(int i = 0; i < code.length; i++){

            String curr = code[i]; //i = coupon 

            if(curr.isEmpty()) continue;

            if(!stringCheck(curr)) continue;

            //check if its active and contains valid business
            if(businessLine[i].equals("electronics") && isActive[i]) lista.add(curr);
            if(businessLine[i].equals("grocery") && isActive[i]) listb.add(curr);
            if(businessLine[i].equals("pharmacy") && isActive[i]) listc.add(curr);
            if(businessLine[i].equals("restaurant") && isActive[i]) listd.add(curr);
        }

        //now add these coupans in one place
        Collections.sort(lista);
        Collections.sort(listb);
        Collections.sort(listc);
        Collections.sort(listd);

        list.addAll(lista);
        list.addAll(listb);
        list.addAll(listc);
        list.addAll(listd);

        return list;
    }

    public boolean stringCheck(String cur){
        for(char c : cur.toCharArray()){
            if(!(Character.isLetterOrDigit(c) || c == '_')){
                return false;
            }
        }
        return true;
    }
}
