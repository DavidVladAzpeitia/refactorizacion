public class Calculator {


    public double calcular(double operando1, double operando2, String operacion) {
        
        switch (operacion.toLowerCase()) {
            case "suma":
                return operando1 + operando2;
                
            case "potencia":
                // Llamada al nuevo método extraído
                return calcularPotencia(operando1, operando2);
                
            case "raiz":
                // Llamada al nuevo método extraído
                return calcularRaiz(operando1);
                
            default:
                return 0;
        }
    }

    private double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    private double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }
}
