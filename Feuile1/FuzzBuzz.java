public class FuzzBuzz{
    public static void main(String[] args) {
        for(int i = 0;i<= 100;i++){
            if(i%5 == 0 && i%7 == 0){
                System.out.println("FuzzBuzz");

            }else if(i%5 == 0){
                System.out.println("fuzz") ;
            }else if(i%7 == 0){
                System.out.println("buzz");
            }else{
                  System.out.println(i);
            }
          

        }
    }
}