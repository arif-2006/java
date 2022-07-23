package projecti;
import java.util.Scanner;
public class PasswordControler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yes = "y";
        String no  = "n";

        //dataBase

        String EntryName = "please entry your usurname:";
        System.out.print(EntryName);
        String StartName=input.next();
        String EntryPassword="plase entry your password";
        System.out.println(EntryPassword);
        String StartPassword = input.next();

        //Entry user data and control

        if (StartName.equals("ahmetarif") && StartPassword.equals("arif200619")){
            System.out.println("you are logged in..");
        } else if (StartName.equals("ahmetarif") && StartPassword !="arif200619") {
            System.out.println(" your entry password wrong.. are you reset in password /y or /n");
            String yn = input.next();

            switch (yn){
                case "y":
                    System.out.println("please your new password entry");
                    String NewPassword = input.next();
                    System.out.println("new password succesfully saved...");
                    break;
                case "n":
                    System.out.println("please your try again");
                    break;
            }
        }else {
            System.out.println("there is not such user");

        }



    }
        }