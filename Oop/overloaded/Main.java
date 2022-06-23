
public class Main
{
    public static void main(String[] args) {
        
        // overloaded constructors = mutiple contrustors within a class with the same name,
        //                           but have different parameters
        //                           name + parameters = signature
        
        Pizza pizza = new Pizza("Thick crust","Tomato","Mozerella");
        System.out.println("Your ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
    }
}
