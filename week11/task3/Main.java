import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account[] myAccounts = new Account[4];

        String[] accountLine;
        File file = new File("data.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
            return;
        }
        int count = 0;
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            accountLine = line.split(",");
            myAccounts[count] = new Account(accountLine[5], Long.parseLong(accountLine[4]), accountLine[3], accountLine[6], accountLine[7], accountLine[8], accountLine[9], accountLine[10]);
            count++;
        }

        //Fake card
        myAccounts[0].setCardNumber(4737470823565213L);

        //Working card (https://www.freeformatter.com/credit-card-number-generator-validator.html)
        myAccounts[2].setCardNumber(4913872229519046L);

        for (int i = 0; i < myAccounts.length; i++) {
            System.out.printf("Account #%d: %s%n", i, myAccounts[i].toString());
        }

    }
}
