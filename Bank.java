/**
 * Created by Olena on 03.11.2016.
 */
public class Bank {
    public static void main(String[] args) {
        withdraw(100,95);
    }

    static void withdraw (float ballance, float ammount){
        float rest = ballance - ammount * 1.05f;
        if (rest < 0){
            System.out.println("NO! There are not enough money on your bank account");
        } else {
            System.out.println("OK"+"  " + ammount*(0.05f) + "  " + rest);
        }
    }
}

