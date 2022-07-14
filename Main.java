package com.itfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduceti textul dorit pentru verificare: ");
        try {
            String mesaj = textIntrodus();
            System.out.println("Textul nu contine cuvintul interzis: pruna.");
        } catch (CuvantInterzisException e) {
            System.out.println("S-a folosit cuvantul interzis: pruna");;
        }
    }


    public static String textIntrodus() throws CuvantInterzisException {
        Scanner scanner = new Scanner(System.in);
        String mesaj = scanner.nextLine();
        if(mesaj.contains("pruna")){
            throw new CuvantInterzisException("Ati introdus un cuvant vulgar!");
        }
        return mesaj;
    }
}

