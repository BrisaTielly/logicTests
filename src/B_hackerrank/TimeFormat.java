package B_hackerrank;

public class TimeFormat {
    public static String timeConversion(String s) {
        // Extrair partes diretamente
        int hour = Integer.parseInt(s.substring(0, 2)); // Horas
        String minutesSeconds = s.substring(2, 8); // ":mm:ss"
        String period = s.substring(8); // AM ou PM

        // Converter a hora
        if (period.equals("AM") && hour == 12) {
            hour = 0; // 12 AM -> 00
        } else if (period.equals("PM") && hour != 12) {
            hour += 12; // Somar 12 às horas
        }

        // Formatar o resultado
        return String.format("%02d%s", hour, minutesSeconds);
    }
}