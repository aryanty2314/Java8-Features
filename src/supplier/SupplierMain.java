package supplier;

import java.util.function.Supplier;

public class SupplierMain
{
    public static void main(String[] args) {

        //Supplier is a interface which is used to supply something
        // It doesn't take any argument it just supply what we want

        Supplier<Integer> supplier = ()->5 * 5;
        System.out.println(supplier.get());
    }
}
