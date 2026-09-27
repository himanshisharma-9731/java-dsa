class Complex {
    double a, b;

    Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    Complex add(Complex c) {
        return new Complex(a + c.a, b + c.b);
    }

    Complex subtract(Complex c) {
        return new Complex(a - c.a, b - c.b);
    }

    Complex multiply(Complex c) {
        double real = a * c.a - b * c.b;
        double imag = a * c.b + b * c.a;

        return new Complex(real, imag);
    }

    Complex divide(Complex c) {
        double d = c.a * c.a + c.b * c.b;

        double real = (a * c.a + b * c.b) / d;
        double imag = (b * c.a - a * c.b) / d;

        return new Complex(real, imag);
    }

    public String toString() {
        if (b > 0)
            return a + " + " + b + "i";
        else if (b < 0)
            return a + " - " + (-b) + "i";
        else
            return "" + a;
    }
}

public class prog56 {
    public static void main(String[] args) {

        Complex c1 = new Complex(4, 3);
        Complex c2 = new Complex(2, 1);

        System.out.println("Addition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
        System.out.println("Multiplication: " + c1.multiply(c2));
        System.out.println("Division: " + c1.divide(c2));
    }
}