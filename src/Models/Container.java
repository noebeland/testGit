package Models;

import java.util.Scanner;


public class Container {
    private Company company;
    private Scanner scanner;

    public Container(Company c) {
        this.company = c;
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public Company getCompany() {
        return this.company;
    }
}

