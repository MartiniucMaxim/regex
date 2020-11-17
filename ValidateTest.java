import java.util.Scanner;
public class ValidateTest {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your address:");
        String address = input.nextLine();
        System.out.println("Enter your city:");
        String city = input.nextLine();
        System.out.println("Enter your phone");
        String phone = input.nextLine();


        System.out.println("\nValidate Result:");

        if(!Validate.validateName(name))
            System.out.println("Error on typing name");
        else if(Validate.validateAddress(address))
            System.out.println("Error on typing adress");
        else if(Validate.validateCity(city))
            System.out.println("Error on typing city");
        else if(Validate.validatePhone(phone))
            System.out.println("Error on typing phone");

        else
            System.out.println("Input is succes, thank you for information");
    }
}
