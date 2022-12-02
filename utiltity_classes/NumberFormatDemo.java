package nt-35;

public class NumberFormatDemo {
    // TODO: Builtin class NumberFormat
    String us  = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india  = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String france  = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
}
