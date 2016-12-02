import java.util.Objects;


public class BankArray {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        withdraw("Ann", 30, balances, ownerNames);
    }
    static void withdraw (String name, double ammount, int[] bal, String[] user){
        double rest;
        int i = 0;
        while (i < user.length){
            if (user[i] == name){
                break;
            } else {
                i++;
            }
        }
        rest = bal[i] - ammount * 1.05;
        if (rest < 0){
            System.out.println(name+"  "+"NO! There are not enough money on your bank account");
        } else {
            System.out.println(name+"  "+ammount*(1.05)+"  "+rest);
        }
    }
}
