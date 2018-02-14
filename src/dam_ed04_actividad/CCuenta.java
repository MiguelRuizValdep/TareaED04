package dam_ed04_actividad;

/**
 * Se trata de una clase que define un cliente, una cuenta, un saldo ,un tipo
 * de interes y las acciones que podemos llevar a cabo entre estos elementos.
 * 
 * @author Miguel Ruiz-Valdepeñas
 * @version 0.01
 */
public class CCuenta {

    /**
     *
     * @return cuenta.Nos devuelve una variable de tipo String con los digitos 
     * de una cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta recibe un parametro de tipo String que representan los 
     * dígitos de una cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return retorna el saldo de nuestra cuenta.Tipo double.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo recibe un parametro de tipo double que representará 
     * el saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Constructor sin parámetros.Se define puesto que al existir otro 
     * con parámetros, no podriamos hacer uso del constructor por defecto.
     */
    public CCuenta()
    {
    }

    /**
     *Constructor que recibe cuatro parámetros
     * 
     * @param nom recibe un String que representa el nombre. 
     * @param cue recibe un String que representa los dígitos de cuenta.
     * @param sal recibe un double que representa el saldo.
     * @param tipo recibe un double que representa el tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @param nom recibe un String con el nombre y llama al método setter 
     * pasndole por parámetro el nombre introducido.
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     *
     * @return llama al método getter (getNombre) para que este devuelva el 
     * nombre.
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     *
     * @return llama al método getter(getSaldo) para que este devuelva el saldo.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     *
     * @param cantidad parámetro tipo double que indica la cantidad a ingresar. 
     * @throws Exception si la cantidad es menor de cero lanzará un excepción.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad parámetro tipo double que indica la cantidad a ingresar.
     * @throws Exception si la cantidad es menor de cero lanzará un excepción.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *
     * @return llamará al método getter (getCuenta) y este devolverá los dígitos 
     * de la cuenta.
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     *
     * @return devolverá un String con el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Pasamos como parámetro un String que representa el nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return retornará un duble que representa el tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés  pasamos por parámetro un double que reptresenta el 
     * tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
