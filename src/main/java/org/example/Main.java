package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, tarih, muzik, kimya, turkce, fizik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = scanner.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = scanner.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = scanner.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = scanner.nextInt();

        int toplam = (mat + turkce + fizik + kimya + tarih + muzik);

        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız: "+ sonuc);

        System.out.println(sonuc >=60 ? "Sınıfı Geçti":"Sınıfta Kaldı");



    }
}