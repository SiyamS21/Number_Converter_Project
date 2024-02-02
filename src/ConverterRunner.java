import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8, 10 or 16): ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        int base = Integer.parseInt(choice);
        if (!choice.equals("2") && !choice.equals("8") && !choice.equals("10") && !choice.equals("16")) {
            System.out.println("The base has to be 2, 8, 10 or 16!");
            System.exit(0);
        }

        System.out.print("Enter your number: ");
        String number = s.nextLine();

        s.close();

        NumberConverter nc = new NumberConverter(number, base);
        int[] digits = nc.getDigits();
        System.out.println("\n\nDigit array: " + Arrays.toString(digits));
        System.out.println("Number: " + nc.displayOriginalNumber());


        if (base == 2) {
            int[] octalFormArray = nc.convertToOctal();
            int[] decimalFormArray = nc.convertToDecimal();
            int[] hexadecimalFormArray = nc.convertToHexadecimal();
            String octalFormString = "";
            String decimalFormString = "";
            String hexadecimalFormString = "";
            for (int i = 0; i < octalFormArray.length; i++) {
                octalFormString = octalFormString + octalFormArray[i];
            }
            for (int i = 0; i < decimalFormArray.length; i++) {
                decimalFormString = decimalFormString + decimalFormArray[i];
            }
            for (int i = 0; i < hexadecimalFormArray.length; i++) {
                if (hexadecimalFormArray[i] >= 0 && hexadecimalFormArray[i] <= 9) {
                    hexadecimalFormString = hexadecimalFormString + hexadecimalFormArray[i];
                }
                else if (hexadecimalFormArray[i] == 10) {
                    hexadecimalFormString = hexadecimalFormString + "A";
                }
                else if (hexadecimalFormArray[i] == 11) {
                    hexadecimalFormString = hexadecimalFormString + "B";
                }
                else if (hexadecimalFormArray[i] == 12) {
                    hexadecimalFormString = hexadecimalFormString + "C";
                }
                else if (hexadecimalFormArray[i] == 13) {
                    hexadecimalFormString = hexadecimalFormString + "D";
                }
                else if (hexadecimalFormArray[i] == 14) {
                    hexadecimalFormString = hexadecimalFormString + "E";
                }
                else if (hexadecimalFormArray[i] == 15) {
                    hexadecimalFormString = hexadecimalFormString + "F";
                }
            }
            System.out.println("Octal number: " + octalFormString);
            System.out.println("Decimal number: " + decimalFormString);
            System.out.println("Hexadecimal number: " + hexadecimalFormString);
        }

        else if (base == 8) {
            int[] binaryFormArray = nc.convertToBinary();
            int[] decimalFormArray = nc.convertToDecimal();
            int[] hexadecimalFormArray = nc.convertToHexadecimal();
            String binaryFormString = "";
            String decimalFormString = "";
            String hexadecimalFormString = "";
            for (int i = 0; i < binaryFormArray.length; i++) {
                binaryFormString = binaryFormString + binaryFormArray[i];
            }
            for (int i = 0; i < decimalFormArray.length; i++) {
                decimalFormString = decimalFormString + decimalFormArray[i];
            }
            for (int i = 0; i < hexadecimalFormArray.length; i++) {
                if (hexadecimalFormArray[i] >= 0 && hexadecimalFormArray[i] <= 9) {
                    hexadecimalFormString = hexadecimalFormString + hexadecimalFormArray[i];
                }
                else if (hexadecimalFormArray[i] == 10) {
                    hexadecimalFormString = hexadecimalFormString + "A";
                }
                else if (hexadecimalFormArray[i] == 11) {
                    hexadecimalFormString = hexadecimalFormString + "B";
                }
                else if (hexadecimalFormArray[i] == 12) {
                    hexadecimalFormString = hexadecimalFormString + "C";
                }
                else if (hexadecimalFormArray[i] == 13) {
                    hexadecimalFormString = hexadecimalFormString + "D";
                }
                else if (hexadecimalFormArray[i] == 14) {
                    hexadecimalFormString = hexadecimalFormString + "E";
                }
                else if (hexadecimalFormArray[i] == 15) {
                    hexadecimalFormString = hexadecimalFormString + "F";
                }
            }
            System.out.println("Binary number: " + binaryFormString);
            System.out.println("Decimal number: " + decimalFormString);
            System.out.println("Hexadecimal number: " + hexadecimalFormString);
        }

        else if (base == 10) {
            int[] binaryFormArray = nc.convertToBinary();
            int[] octalFormArray = nc.convertToOctal();
            int[] hexadecimalFormArray = nc.convertToHexadecimal();
            String binaryFormString = "";
            String octalFormString = "";
            String hexadecimalFormString = "";
            for (int i = 0; i < binaryFormArray.length; i++) {
                binaryFormString = binaryFormString + binaryFormArray[i];
            }
            for (int i = 0; i < octalFormArray.length; i++) {
                octalFormString = octalFormString + octalFormArray[i];
            }
            for (int i = 0; i < hexadecimalFormArray.length; i++) {
                if (hexadecimalFormArray[i] >= 0 && hexadecimalFormArray[i] <= 9) {
                    hexadecimalFormString = hexadecimalFormString + hexadecimalFormArray[i];
                }
                else if (hexadecimalFormArray[i] == 10) {
                    hexadecimalFormString = hexadecimalFormString + "A";
                }
                else if (hexadecimalFormArray[i] == 11) {
                    hexadecimalFormString = hexadecimalFormString + "B";
                }
                else if (hexadecimalFormArray[i] == 12) {
                    hexadecimalFormString = hexadecimalFormString + "C";
                }
                else if (hexadecimalFormArray[i] == 13) {
                    hexadecimalFormString = hexadecimalFormString + "D";
                }
                else if (hexadecimalFormArray[i] == 14) {
                    hexadecimalFormString = hexadecimalFormString + "E";
                }
                else if (hexadecimalFormArray[i] == 15) {
                    hexadecimalFormString = hexadecimalFormString + "F";
                }
            }
            System.out.println("Binary number: " + binaryFormString);
            System.out.println("Octal number: " + octalFormString);
            System.out.println("Hexadecimal number: " + hexadecimalFormString);
        }

        else {
            int[] binaryFormArray = nc.convertToBinary();
            int[] octalFormArray = nc.convertToOctal();
            int[] decimalFormArray = nc.convertToDecimal();
            String binaryFormString = "";
            String octalFormString = "";
            String decimalFormString = "";
            for (int i = 0; i < binaryFormArray.length; i++) {
                binaryFormString = binaryFormString + binaryFormArray[i];
            }
            for (int i = 0; i < octalFormArray.length; i++) {
                octalFormString = octalFormString + octalFormArray[i];
            }
            for (int i = 0; i < decimalFormArray.length; i++) {
                decimalFormString = decimalFormString + decimalFormArray[i];
            }
            System.out.println("Binary number: " + binaryFormString);
            System.out.println("Octal number: " + octalFormString);
            System.out.println("Decimal number: " + decimalFormString);
        }

    }
}