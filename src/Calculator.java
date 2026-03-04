
public class Calculator {

   
    public double calcular(double a, double b, String operacion) {
    if (operacion.equals("suma")) {
        return a + b;
    } else if (operacion.equals("potencia")) {
        return calcularPotencia(a, b);
    } else if (operacion.equals("raiz")) {
        return calcularRaiz(a);
    }
    return 0;
}

private double calcularPotencia(double base, double exponente) {
    return Math.pow(base, exponente);
}

private double calcularRaiz(double numero) {
    return Math.sqrt(numero);
}
}
