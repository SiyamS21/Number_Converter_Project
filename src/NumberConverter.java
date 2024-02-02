import java.util.Arrays;
public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(String number, int base) {
        digits = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            int d = 0;
            String single = number.substring(i,i+1);
            if (single.equals("0") || single.equals("1") || single.equals("2") || single.equals("3") || single.equals("4") || single.equals("5") || single.equals("6") || single.equals("7") || single.equals("8") || single.equals("9")) {
                d = Integer.parseInt(single);
                digits[i] = d;
            }
            else if (single.equals("A") || single.equals("a")) {
                d = 10;
            }
            else if (single.equals("B") || single.equals("b")) {
                d = 11;
            }
            else if (single.equals("C") || single.equals("c")) {
                d = 12;
            }
            else if (single.equals("D") || single.equals("d")) {
                d = 13;
            }
            else if (single.equals("E") || single.equals("e")) {
                d = 14;
            }
            else if (single.equals("F") || single.equals("f")) {
                d = 15;
            }
            else {
                System.out.println("That doesn't work for this base! Try again!");
                System.exit(0);
            }
            digits[i] = d;
        }
        if (base == 2) {
            for (int digit : digits) {
                if (digit != 0 && digit != 1) {
                    System.out.println("That number isn't binary! Try again!");
                    System.exit(0);
                }
            }
        }
        else if (base == 8) {
            for (int digit : digits) {
                if (digit != 0 && digit != 1 && digit != 2 && digit != 3 && digit != 4 && digit != 5 && digit != 6 && digit != 7) {
                    System.out.println("That number isn't octal! Try again!");
                    System.exit(0);
                }
            }
        }
        else if (base == 10) {
            for (int digit : digits) {
                if (digit != 0 && digit != 1 && digit != 2 && digit != 3 && digit != 4 && digit != 5 && digit != 6 && digit != 7 && digit != 8 && digit != 9) {
                    System.out.println("That number isn't decimal! Try again!");
                    System.exit(0);
                }
            }
        }
        else if (base == 16) {
            for (int digit : digits) {
                if (digit != 0 && digit != 1 && digit != 2 && digit != 3 && digit != 4 && digit != 5 && digit != 6 && digit != 7 && digit != 8 && digit != 9 && digit != 10 && digit != 11 && digit != 12 && digit != 13 && digit != 14 && digit != 15) {
                    System.out.println("That number isn't hexadecimal! Try again!");
                    System.exit(0);
                }
            }
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        String o = "";
        if (base == 2 || base == 8 || base == 10) {
            for (int i = 0; i < digits.length; i++) {
                o = o + digits[i];
            }
        } else {
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] >= 0 && digits[i] <= 9) {
                    o = o + digits[i];
                } else if (digits[i] == 10) {
                    o = o + "A";
                } else if (digits[i] == 11) {
                    o = o + "B";
                } else if (digits[i] == 12) {
                    o = o + "C";
                } else if (digits[i] == 13) {
                    o = o + "D";
                } else if (digits[i] == 14) {
                    o = o + "E";
                } else if (digits[i] == 15) {
                    o = o + "F";
                }
            }
        }
        o = o + "\n";
        return o;
    }

    public int[] getDigits() {
        return digits;
    }

    public int[] convertToDecimal() {
        int currentMultiplier = 1;
        int decimalForm = 0;
        if (base == 2) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 2;
            }
        }
        else if (base == 8) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 8;
            }
        }
        else if (base == 16) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += digits[i] * currentMultiplier;
                currentMultiplier *= 16;
            }
        }
        String decimalFormAsString = Integer.toString(decimalForm);
        int[] decimalFormDigits = new int[decimalFormAsString.length()];
        for (int i = 0; i < decimalFormAsString.length(); i++) {
            String single = decimalFormAsString.substring(i,i+1);
            int d = Integer.parseInt(single);
            decimalFormDigits[i] = d;
        }
        return decimalFormDigits;
    }

    public int[] convertToBinary() {
        int currentMultiplier = 1;
        int decimalForm = 0;
        if (base == 8) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 8;
            }
        }
        else if (base == 10) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 10;
            }
        }
        else if (base == 16) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += digits[i] * currentMultiplier;
                currentMultiplier *= 16;
            }
        }
        int tempCurrentQuotient = decimalForm;
        int[] remainders;
        int count = 0;
        while (tempCurrentQuotient != 0) {
            tempCurrentQuotient /= 2;
            count++;
        }
        int currentQuotient = decimalForm;
        remainders = new int[count];
        for (int i = 0; i < count; i++) {
            remainders[i] = currentQuotient % 2;
            currentQuotient /= 2;
        }
        int[] binaryForm = new int[remainders.length];
        int c = 0;
        for (int i = remainders.length - 1; i >= 0; i--) {
            binaryForm[c] = remainders[i];
            c++;
        }
        return binaryForm;
    }

    public int[] convertToOctal() {
        int currentMultiplier = 1;
        int decimalForm = 0;
        if (base == 2) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 2;
            }
        }
        else if (base == 10) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 10;
            }
        }
        else if (base == 16) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += digits[i] * currentMultiplier;
                currentMultiplier *= 16;
            }
        }
        int tempCurrentQuotient = decimalForm;
        int[] remainders;
        int count = 0;
        while (tempCurrentQuotient != 0) {
            tempCurrentQuotient /= 8;
            count++;
        }
        int currentQuotient = decimalForm;
        remainders = new int[count];
        for (int i = 0; i < count; i++) {
            remainders[i] = currentQuotient % 8;
            currentQuotient /= 8;
        }
        int[] octalForm = new int[remainders.length];
        int c = 0;
        for (int i = remainders.length - 1; i >= 0; i--) {
            octalForm[c] = remainders[i];
            c++;
        }
        return octalForm;
    }

    public int[] convertToHexadecimal() {
        int currentMultiplier = 1;
        int decimalForm = 0;
        if (base == 2) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 2;
            }
        }
        else if (base == 8) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 8;
            }
        }
        else if (base == 10) {
            for (int i = digits.length - 1; i >= 0; i--) {
                decimalForm += (digits[i] * currentMultiplier);
                currentMultiplier *= 10;
            }
        }
        int tempCurrentQuotient = decimalForm;
        int[] remainders;
        int count = 0;
        while (tempCurrentQuotient != 0) {
            tempCurrentQuotient /= 16;
            count++;
        }
        int currentQuotient = decimalForm;
        remainders = new int[count];
        for (int i = 0; i < count; i++) {
            remainders[i] = currentQuotient % 16;
            currentQuotient /= 16;
        }
        int[] hexadecimalForm = new int[remainders.length];
        int c = 0;
        for (int i = remainders.length - 1; i >= 0; i--) {
            hexadecimalForm[c] = remainders[i];
            c++;
        }
        return hexadecimalForm;
    }
}
