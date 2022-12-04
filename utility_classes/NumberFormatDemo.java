package utility_classes;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    double payment = 1234.567;
    
    // TODO: Builtin class NumberFormat
    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
}
