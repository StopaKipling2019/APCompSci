public class Main {

    public static void main(String[] args) {
        int[] data = {0, 1, 63, 127, 255, 256};
        for (int i = 0; i < data.length; i++) System.out.printf("%d: (Binary) %s (Octal) %s (Hex) %s \n", data[i], binary(data[i]), octal(data[i]), hexaDecimal(data[i]));
    }

    public static String octal(int decimal) {
        int[] octal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal <= 8) octal[8] = decimal;
        if (decimal > 8) {
            for (int i = octal.length - 1; i >= 0; i--) {
                octal[i] = decimal % 8;
                decimal /= 8;
            } }
        String build = converter(octal);
        return build;
    }

    public static String hexaDecimal(int decimal) {
        int[] hexaDecimal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal < 16) hexaDecimal[8] = decimal;
        if (decimal >= 16) {
            for (int i = hexaDecimal.length - 1; i >= 0; i--) {
                hexaDecimal[i] = decimal % 16;
                decimal /= 16;
            } }
        String build = converter(hexaDecimal);
        return build;
    }

    public static String binary(int decimal) {
        int[] binary = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal <= 1) binary[8] = decimal;
        if (decimal > 1) {
            for (int i = binary.length - 1; i >= 0; i--) {
                if (Math.pow(2, i) > decimal) binary[(binary.length - 1) - i] = 0;
                if (Math.pow(2, i) <= decimal) {
                    binary[(binary.length - 1) - i] = 1;
                    decimal -= Math.pow(2, i);
                } } }
        String build = converter(binary);
        return build;
    }


    public static String converter(int[] data) {
        String build = "";
        for (int i = 0; i < data.length; i++) {
            switch (data[i]) {
                case 10: build += 'A'; break;
                case 11: build += 'B'; break;
                case 12: build += 'C'; break;
                case 13: build += 'D'; break;
                case 14: build += 'E'; break;
                case 15: build += 'F'; break;
                case 16: build += 'G'; break;
                case 17: build += 'H'; break;
                case 18: build += 'I'; break;
                case 19: build += 'J'; break;
                case 20: build += 'K'; break;
                case 21: build += 'L'; break;
                case 22: build += 'M'; break;
                case 23: build += 'N'; break;
                case 24: build += 'O'; break;
                case 25: build += 'P'; break;
                case 26: build += 'Q'; break;
                case 27: build += 'R'; break;
                case 28: build += 'S'; break;
                case 29: build += 'T'; break;
                case 30: build += 'U'; break;
                case 31: build += 'V'; break;
                case 32: build += 'W'; break;
                case 33: build += 'X'; break;
                case 34: build += 'Y'; break;
                case 35: build += 'Z'; break;
                default: build += Integer.toString(data[i]); break;
            } }
        return build;
    }
}
