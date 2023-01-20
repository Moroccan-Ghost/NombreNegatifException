public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel n = new EntierNaturel(1);
            n.decrementer();
            System.out.println(n.getVal());
            //n.decrementer();

            n.setVal(-10);
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
            System.out.println("The Error value is : " + e.getValue());
        }
    }
}
