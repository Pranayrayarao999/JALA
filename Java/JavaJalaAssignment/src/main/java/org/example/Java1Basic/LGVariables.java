package org.example.Java1Basic;

public class LGVariables {
        //global variables can be accessed inside and outside the block
        int a = 10;

        public int hii(){
            System.out.println(a);
//            local variable used within the block
            int a = 12;
            System.out.println(a);
            return a;
        }

        public static void main(String args[]){
            LGVariables LG = new LGVariables();
            //LG.a = 23;
            LG.hii();
        }
}
