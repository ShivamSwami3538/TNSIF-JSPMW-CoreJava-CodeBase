// package com.bankingsystem;

import java.util.*;

public class BankingSystemApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingService service = new BankingServiceImpl();

        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customers");
            System.out.println("2. Add Accounts");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List all Accounts of specific Customer");
            System.out.println("7. List all Transactions of specific Account");
            System.out.println("8. List all Beneficiaries of specific Customer");
            System.out.println("9. Exit");

            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                System.out.println("Enter Customer Details");
                System.out.print("Customer Id: ");
                int cid = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String cname = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                System.out.print("Contact: ");
                String contact = sc.nextLine();
                service.addCustomer(new Customer(cid, cname, addr, contact));
                break;

            case 2:
                System.out.println("Enter Account Details");
                System.out.print("Account Id: ");
                int aid = sc.nextInt();
                System.out.print("Customer Id: ");
                int cid2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Account Type(Saving/Current): ");
                String type = sc.nextLine();
                System.out.print("Balance: ");
                double bal = sc.nextDouble();
                service.addAccount(new Account(aid, cid2, type, bal));
                break;

            case 3:
                System.out.println("Enter Beneficiary Details");
                System.out.print("Customer Id: ");
                int cusid = sc.nextInt();
                System.out.print("Beneficiary Id: ");
                int bid = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String bname = sc.nextLine();
                System.out.print("Account Number: ");
                String accno = sc.nextLine();
                System.out.print("Bank Details: ");
                String bdet = sc.nextLine();
                service.addBeneficiary(new Beneficiary(bid, cusid, bname, accno, bdet));
                break;

            case 4:
                System.out.println("Enter Transaction Details");
                System.out.print("Account Id: ");
                int accId = sc.nextInt();
                sc.nextLine();
                System.out.print("Type (Deposit/Withdraw): ");
                String ttype = sc.nextLine();
                System.out.print("Amount: ");
                double amt = sc.nextDouble();
                service.addTransaction(new Transaction(accId, ttype, amt));
                break;

            case 5:
                System.out.print("Customer Id: ");
                int findId = sc.nextInt();
                Customer c = service.findCustomerById(findId);
                System.out.println(c != null ? c : "Not Found");
                break;

            case 6:
                System.out.print("Customer Id: ");
                int findAcc = sc.nextInt();
                List<Account> listAcc = service.getAccountsByCustomerId(findAcc);
                listAcc.forEach(System.out::println);
                break;

            case 7:
                System.out.print("Account Id: ");
                int findT = sc.nextInt();
                List<Transaction> tlist = service.getTransactionsByAccountId(findT);
                tlist.forEach(System.out::println);
                break;

            case 8:
                System.out.print("Customer Id: ");
                int findB = sc.nextInt();
                List<Beneficiary> blist = service.getBeneficiariesByCustomerId(findB);
                blist.forEach(System.out::println);
                break;

            case 9:
                System.out.println("Thank you!");
                System.exit(0);

            default:
                System.out.println("Invalid Choice!");
            }
        }
    }
}