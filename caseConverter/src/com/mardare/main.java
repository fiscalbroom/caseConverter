package com.mardare;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner stringa = new Scanner(System.in);
        caseConverter c1 = new caseConverter();
        System.out.println(c1.convertiInstartCase(stringa.nextLine()));
        System.out.println(c1.convertiInCamelCase(stringa.nextLine()));
        System.out.println(c1.convertiInSnakeCase(stringa.nextLine()));

    }

}

