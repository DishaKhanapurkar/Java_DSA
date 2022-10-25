public class palinperm {
    public static void main(String args[]){
System.out.println(isperm("tact coa"));
    }

    static boolean isperm(String phrase){
        int [] table=buildcharfreq(phrase);
        return checkmaxoneodd(table);
    }
    static boolean checkmaxoneodd(int [] table){
        boolean foundodd=false;
        for(int count :table){
            if(count%2==1){
                if(foundodd){
                    return false;
                }
                foundodd=true;
            }
        }
        return true;
    }
    static int getCharNumber(Character c){
        int a =Character.getNumericValue('a');
        int z=Character.getNumericValue('z');
        if(a<=c && c<=z){
            return c-a;
        }
        return -1;
    }
   static int [] buildcharfreq(String phrase){
        int [] table=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for(char c: phrase.toCharArray()){
            int x=getCharNumber(c);
            if(x!=-1)
            table[x]++;
        }
    
    return table;
}
}
