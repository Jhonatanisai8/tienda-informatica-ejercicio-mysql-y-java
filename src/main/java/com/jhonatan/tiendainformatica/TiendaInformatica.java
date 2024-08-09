package com.jhonatan.tiendainformatica;

import com.jhonatan.tiendainformatica.iu.frmDasboard;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TiendaInformatica {

    public static void main(String[] args) {
        frmDasboard de = new frmDasboard();
        de.setVisible(true);

    }

    public static void ejemplo() {
        System.out.println(1975 - 2024);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Ingrese su fecha de nacimiento (yyyy-MM-dd):");
        String input = scanner.nextLine();

        try {
            LocalDate fechaNacimiento = LocalDate.parse(input, formatter);
            LocalDate hoy = LocalDate.now();
            Period edad = Period.between(fechaNacimiento, hoy);

            System.out.println("Edad:");
            System.out.println("Años: " + edad.getYears());
            System.out.println("Meses: " + edad.getMonths());
            System.out.println("Días: " + edad.getDays());
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido. Use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}
