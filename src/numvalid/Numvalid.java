package numvalid;

public class Numvalid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args.length > 0) {
            try {
                Validator v = new Validator(args[0]);
                Converter c = new Converter(args[0]);
                System.out.println(c.getValue());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.exit(0);
            }
        }

        
        
//        try {
//            Validator v = new Validator("MIVX");
//        } catch (Exception ex){
//            System.out.println(ex.getMessage());
//            System.exit(0);
//        }

    }

}
