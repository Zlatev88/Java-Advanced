package DefiningClasses.Lab._3_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> map = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String []arr = input.split(" ");
            BankAccount bankAccount = new BankAccount();

            if (arr[0].equals("Create")) {

                int id = bankAccount.getId();
                map.put(id, bankAccount);
                System.out.println("Account ID" + id +" created");
            }

            else if (arr[0].equals("Deposit")) {
                int id = Integer.parseInt(arr[1]);
                int amount = Integer.parseInt(arr[2]);
                if (!map.containsKey(id)) {
                    System.out.println("Account does not exist");
                }
                else {

                    BankAccount getID = map.get(id);
                    getID.deposit(amount);
                    System.out.printf("Deposited %d to ID%d%n", amount, id);
                }

            }

            else if (arr[0].equals("SetInterest")) {
                double amount = Double.parseDouble(arr[1]);
                BankAccount.setInterestRate(amount);

            }
            else if (arr[0].equals("GetInterest")) {
                int id = Integer.parseInt(arr[1]);
                int years = Integer.parseInt(arr[2]);
                if (!map.containsKey(id)) {
                    System.out.println("Account does not exist");
                }
                else {
                    double getId = map.get(id).getInterestRate(years);
                    System.out.printf("%.2f%n", getId);
                }


            }





            input = scanner.nextLine();
        }


        }
    }

