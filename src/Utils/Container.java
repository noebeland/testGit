package Utils;

import Models.Company;

import java.util.Scanner;


public class Container {
    private Company company = null;
    private Scanner scanner;
    private static Container INSTANCE = new Container();

    private Container() {
        this.scanner = new Scanner(System.in);
    }

    public static Container getInstance() {
        return INSTANCE;
    }

    public void setCompany(Company company) {
        if (this.company == null) {
            this.company = company;
        }
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public Company getCompany() {
        return this.company;
    }
}

