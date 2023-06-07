public class Main {
    public static void main(String[] args) {
/*
        Sıkıldım bu metodları yapmadım
        lastIndexOf
        toArray
        clear
        contains()
        */
        System.out.println(powK(3, 5));

    }

    static int powK(int n, int p) {
        int counter = 1;// 2^2

        try{
            if(n == 0 || p == 0){
               throw new Exception("n and p should not be zero");

            }
            System.out.println("birinci if blogu");
            if (n < 0 || p < 0){
                throw new Exception("n or p should not be negative.");

            }
            System.out.println("ikinci if blogu");

            for (int i = 0 ; i < p ; i++){
                counter *= n;
            }

        }catch(Exception e){
            System.out.println("java.lang.Exception" + e.getMessage());
        }
        return counter ;
    }

}

















