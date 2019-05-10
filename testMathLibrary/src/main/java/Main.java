import java.util.Currency;

public class Main {

    static public void main(String[] args){

        System.out.println(CustomMath.pow(2,3));

        try {
            System.out.println(CustomMath.factorial(4));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(CustomMath.log(4,5));

    }

}
