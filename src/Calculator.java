
public class Calculator {

    /** 
     * @param operando1
     * @param operando2
     * @param operacion
     * @return double
     */
    public double calcular(double operando1, double operando2, String operacion) {
        // Refactorización 2 y 3: Switch moderno y variables renombradas
        switch (operacion.toLowerCase()) {
            case "suma":
                return operando1 + operando2;
            case "potencia":
                return calcularPotencia(operando1, operando2);
            case "raiz":
                return calcularRaiz(operando1);
            default:
                return 0;
        }
    }

    /** 
     * @param base
     * @param exponente
     * @return double
     */
    // Refactorización 1: Método extraído y uso de Math.pow
    
    private double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /** 
     * @param numero
     * @return double
     */
    // Refactorización 1: Método extraído y uso de Math.sqrt
    private double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }
}