package Exceptions.Throw_Exceptions.Checked_Exception;

public class Amount {

    public Amount(String currency, int amount)	{
        this.currency =	currency;
        this.amount =	amount;
    }
    String	currency;//	Should	be	an	Enum
    int amount;//	Should	ideally	use	BigDecimal
}
