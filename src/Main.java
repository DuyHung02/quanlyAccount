import Account.Account;
import Manager.manager_accounts;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static manager_accounts managerAccounts = new manager_accounts();
    public static void main(String[] args) {
        System.out.println("1. Hiểm thị");
        System.out.println("2. Thêm");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                managerAccounts.show();
                break;
            case 2:
                managerAccounts.add(managerAccounts.creatAccount(new Account()));
                break;

        }
    }
}