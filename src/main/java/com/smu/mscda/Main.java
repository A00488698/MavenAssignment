package com.smu.mscda;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will capitalize the input string and generate MD5 hex! ");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().strip();
        String capitalized = StringUtils.capitalize(input);
        String md5Hex = DigestUtils.md5Hex(input);
        System.out.println("Capitalized string is: " + capitalized);
        System.out.println("MD5 Hex is: " + md5Hex);
        }

    }

