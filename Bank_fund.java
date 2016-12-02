/**
 * Created by Olena on 03.11.2016.
 */
public class Bank_fund{
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Lane";
        double withdrawal = 30;
        fund(ownerName, withdrawal, balances, ownerNames);
    }

    static void fund (String name, double ammount, int[] bal, String[] user){
        double rest;
        int i = 0;
        while (i < user.length){
            if (user[i] == name){
                break;
            } else {
                i++;
            }
        }
        rest = bal[i] + ammount;
        System.out.println(name+"  "+rest);
    }
}
