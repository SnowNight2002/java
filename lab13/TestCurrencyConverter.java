package lab13;

public class TestCurrencyConverter {
    public static void main(String s[]) {
    CurrencyConverter yenConverter = new CurrencyConverter(115.7,0.0005);
	CurrencyConverter euroConverter = new CurrencyConverter(0.9927,0.0003);
    yenConverter.setLargeAmount (50000);
    euroConverter.setLargeAmount (50000);
    euroConverter.setExchangeRate(0.9881);
    System.out.println("1500000 yens = US$ "+yenConverter.toUSDollar(1500000)+
    "\nUS$ 2000  = "+yenConverter.fromUSDollar(2000)+"yens");



    System.out.println("170000 euros = US$ "+euroConverter.toUSDollar(170000)+
    "\nUS$ 20000  = "+euroConverter.fromUSDollar(20000)+"euros");



}
}