import java.util.Date;

import javax.security.sasl.Sasl;
import java.util.Date;


public class Transactions {
    COPConversion cop = new COPConversion();
    Date date = new Date();
   

    /** Este método realiza la transacción de depositar dinero de una cuenta.
     * Utiliza los métodos de checkCurrencyType, checkBalance y calculateTransactionCost.
     * @see control.Transactions.checkBalance
     * @see control.COPConversion.checkCurrencyType
     * @see control.Transactions.calculateTransactionCost
     * @param account -El número de cuenta de donde se desea depositar el dinero.
     * @param amount -La cantidad de dinero a depositar.
     * @param currency -Moneda de la cantidad de dinero a depositar.
     * @return Un string con mensaje de confirmación de si fue posible depositar el dinero.
     */
    public String depositMoney(int account, double amount, char currency){
        Date date;
        double currentBalance;//obtener saldo de la cuenta
        String currencyType = String.valueOf(currency); 
        double amountToDeposit = cop.checkCurrencyType(currencyType, amount);
        double transactionCost = calculateTransactionCost(amountToDeposit);

        if (checkBalance(account, amountToDeposit-transactionCost)){
            currentBalance =+ (amountToDeposit-transactionCost); 
            //actualizar en base de datos
            //agregar transaccion a la cuenta (arreglo?)
            return ("Transacción exitosa, tu nuevo saldo es de "+ String.valueOf(currentBalance));
        }
        else {
            return ("Transacción fallida, no tienes fondos suficientes para cubrir el valor de la transacción");
        }

    }

    /** Este método realiza la transacción de retirar dinero de una cuenta.
     * Utiliza los métodos de checkCurrencyType, checkBalance y calculateTransactionCost.
     * @see control.Transactions.checkBalance
     * @see control.COPConversion.checkCurrencyType
     * @see control.Transactions.calculateTransactionCost
     * @param account -El número de cuenta de donde se desea extraer el dinero.
     * @param amount -La cantidad de dinero a retirar.
     * @param currency -Moneda de la cantidad de dinero a retirar.
     * @return Un string con mensaje de confirmación de si fue posible retirar el dinero.
     */
    public String retireMoney(int account, double amount, char currency){
        
        double currentBalance;//obtener saldo de la cuenta
        String currencyType = String.valueOf(currency); 
        double amountToRetire = cop.checkCurrencyType(currencyType, amount);
        double transactionCost = calculateTransactionCost(amountToRetire);

        if (checkBalance(account, amountToRetire+transactionCost)){
            if ( amountToRetire>20000000){
                //pedir otra clave
                //si es correcta:
                currentBalance =- (amountToRetire+transactionCost); 
                //actualizar en base de datos
                return ("Transacción exitosa, tu nuevo saldo es de "+ String.valueOf(currentBalance));
                //else : return("No fue posible confirmar tu identidad");
            }
           
        }
        else {
            return ("Transacción fallida, no tienes fondos suficientes");
        }
        
    }

    /** Este método realiza la transacción de transferir dinero de una cuenta a otra.
     * Utiliza los métodos de checkCurrencyType, checkBalance y calculateTransactionCost.
     * @see control.Transactions.checkBalance
     * @see control.COPConversion.checkCurrencyType
     * @see control.Transactions.calulateTransactionCost
     * @param originAccount -Es el número de cuenta desde donde se desea transferir el dinero.
     * @param destinyAccount -Es el número de la cuenta que va a recibir el dinero.
     * @param amount -La cantidad de dinero a transferir.
     * @param currency -Moneda de la cantidad de dinero a transferir.
     * @return Un string con mensaje de confirmación de si fue posible realizar la transferencia.
     */
    public String transferMoney(int originAccount, int destinyAccount, double amount, char currency){
        double originBalance;//obtener saldo de la cuenta
        double destinyBalance;//obtener saldo de la cuenta destino
        String currencyType = String.valueOf(currency); 
        double amountToTransfer = cop.checkCurrencyType(currencyType, amount);
        double transactionCost = calculateTransactionCost(amountToTransfer);

        if (checkBalance(originAccount, amountToTransfer+transactionCost)){
            originBalance =- (amountToTransfer + transactionCost); 
            destinyBalance =+ amountToTransfer;
            //actualizar saldos en base de datos
            return ("Transferencia Exitosa");
        }
        else {
            return ("Transacción fallida, no tienes fondos suficientes");
        }
    }

    /** Este método revisa si la cantidad de dinero disponible en la cuenta es suficiente para realizar la transacción.
     * Utiliza el método calculateTransactionCost.
     * @see control.Transactions.calulateTransactionCost
     * @param account -El número de cuenta de donde se desea extraer el dinero.
     * @param amountToRetire -La cantidad de dinero que se quiere transaccionar.
     * @return Un booleano verdadero o falso de si es posible realizar la transacción.
     */
     public boolean checkBalance(int account, double amountToRetire){
        double currentBalance; //obtener saldo de la cuenta
        double transactionCost = calculateTransactionCost(amountToRetire);
        if (currentBalance < amountToRetire){
            return false;
        }
        else if (currentBalance >= (amountToRetire+transactionCost)){
            return true;
        }

     }

    /** Este método calcula el valor de la transacción. 
     * El cúal es 1% del valor de la transacción y tiene un costo minimo de 100.000 COP.
     * @param amount -La cantidad de dinero que se quiere transaccionar.
     * @return Lo que cuesta la transacción.
     */
     public double calculateTransactionCost(double amount){
        double transactionCost = amount * 0.01;
        if (transactionCost<50000){
            transactionCost = 100000;
        }
        return transactionCost;
     }

}
