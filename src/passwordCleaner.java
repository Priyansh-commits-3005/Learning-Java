import java.util.Scanner;
public class passwordCleaner {
    /*
    this will be a password cleaner for the purpose of checking user inputted password at login page and not signup

    so things i want to do
    - trim whitespaces
    - check for empty or blank
    - check for forbidden words - like admin , password
    - replace a,e,i,o,u, to *
    - print in uppercase


     */
    public static void main(String[] args) {
        String password;
        char vowels[] = {'a','e','i','o','u'};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password : ");
        password = scanner.nextLine();

        if(!password.isEmpty()){
            password = password.trim();
            if(!password.isEmpty()){
                if(!password.equalsIgnoreCase("admin") && !password.equalsIgnoreCase("Password")){
                    for (char vowel : vowels) {
                        password = password.replace(vowel, '*');
                    }
                    System.out.println(password.toUpperCase());
                }
                else{
                    System.out.println("Password cannot be Admin or Password");
                }
            }
            else{
                System.out.println("Password cannot be blank");
            }

        }
        else{
            System.out.println("Password cannot be Empty");
        }

        scanner.close();

    }




}
