public class Q18PatternMatching {



    public static boolean patternmatching(String ab, String value){
        int a = 0;
        int b = 0;
        int firsta = -1;
        int firstb = -1;


        for(int i = ab.length() - 1; i >= 0; i--) {
            if(ab.charAt(i) == 'a') {
                a++;
                firsta = i;
            } else {
                b++;
                firstb = i;
            }
        }

        if(a==0|b==0) return true;

        int lengthb = 0;
        for(int lengtha = value.length()/a; lengtha >= 0; lengtha--) {
            lengthb = (value.length() - lengtha*a)/ b;
            System.out.println(lengtha + " " + firsta + " " + firstb);
            if((lengthb * b + lengtha * a) == value.length()) {
                String ac = value.substring(firsta * lengthb, (firsta*lengthb)+lengtha);
                String bc =  value.substring(firstb * lengtha, (firstb*lengtha)+lengthb);
                System.out.println(ac + " " + bc);
                StringBuilder abtovalue = new StringBuilder();
                for(int i = 0; i < ab.length(); i++) {
                    if(ab.charAt(i) =='a') {
                      abtovalue.append(ac);
                    } else {
                        abtovalue.append(bc);
                    }
                }
                if(abtovalue.toString().equals(value)) return true;
            }
        }
        return false;
    }



    public static void main(String[] args ) {

       System.out.print(patternmatching("abbab", "jpapajpa"));
    }
}
