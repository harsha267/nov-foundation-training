import java.util.Scanner;
class login{
    public static void main(String[] args){
        System.out.println("Login System");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String username = sc.nextLine();
        System.out.println("enter password");   
        String password = sc.nextLine();
        loginservice loginSystem = new loginservice();
        boolean isvalid = loginSystem.authenticate(username, password);
        if(isvalid){
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }
    }
}