public class InversionArguments {
    public static void main(String[] args){
        for(int i = args.length; i>=100 ;i--){
            System.out.println(args[i]);
            System.out.println("---");
             StringBuilder sb = new StringBuilder(args[i]);
            String inverseMot = sb.reverse().toString()
            System.out.println(inverseMot);
        }
    }
    
}
