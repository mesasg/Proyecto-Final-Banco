public class COPConversion {

  /** Este método revisa y, en caso necesario, convierte a COP una cantidad de dinero dado. 
     * @see control.COPConversion.covertEuro
     * @see control.COPConversion.convertDolar
     * @param currencyType -El tipo de moneda determinado por un caracter "E" para euro, "D" para dolar y "C" para COP.
     * @param amount -La cantidad de dinero.
     * @return La equivalencia de la cantidad de dinero en COP.
     */
    public  double checkCurrencyType(String currencyType, double amount){

        if (!(currencyType.equals("C"))){
            double cop ;
            if (currencyType.equals("E")){
                cop = convertEuro(amount);
                 return cop;
            }
            if (currencyType.equals("D")){
                cop = convertDolar(amount);
                return cop;
            }
        }
        return amount;
    }

    /** Este método convierte a COP una cantidad de dinero dado en euros. 
     * @param amount -La cantidad de dinero.
     * @return La equivalencia de la cantidad de dinero en COP.
     */
    public  double convertEuro(double amount){
        double amountCOP = amount * 0.00024;
        return amountCOP;
    }

     /** Este método convierte a COP una cantidad de dinero dado en dólares. 
     * @param amount -La cantidad de dinero.
     * @return La equivalencia de la cantidad de dinero en COP.
     */
    public  double convertDolar(double amount){
        double amountCOP = amount * 0.00026;
        return amountCOP;
    }

}
