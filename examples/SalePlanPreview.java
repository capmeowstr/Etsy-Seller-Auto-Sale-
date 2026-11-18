import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class SalePlanPreview {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java examples/SalePlanPreview.java YYYY-MM-DD");
            System.exit(2);
        }

        LocalDate start;
        LocalDate end;
        try {
            start = LocalDate.parse(args[0]);
            end = start.plusDays(1);
        } catch (DateTimeException exception) {
            System.err.println("Enter a valid date in YYYY-MM-DD format.");
            System.exit(2);
            return;
        }

        System.out.println("Sale name: ANYSALE" + start.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("Start date: " + start);
        System.out.println("End date: " + end);
        System.out.println("Offer: 25% off all listings, no order minimum");
    }
}
