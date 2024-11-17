
public class ComplexNumber_3045{

    double real,imag;
    ComplexNumber_3045(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
public ComplexNumber_3045 add(ComplexNumber_3045 other) {
    double newReal = this.real + other.real;
    double newImag = this.imag + other.imag;
    return new ComplexNumber_3045(newReal, newImag);
}
public ComplexNumber_3045 subtract(ComplexNumber_3045 other) {
    double newReal = this.real - other.real;
    double newImag = this.imag - other.imag;
    return new ComplexNumber_3045(newReal, newImag);
}
public ComplexNumber_3045 multiply(ComplexNumber_3045 other) {
    double newReal = this.real * other.real;
    double newImag = this.imag * other.imag;
    return new ComplexNumber_3045(newReal, newImag);
}
public ComplexNumber_3045 divide(ComplexNumber_3045 other) {
    double newReal = this.real / other.real;
    double newImag = this.imag / other.imag;
    return new ComplexNumber_3045(newReal, newImag);
}
    @Override
    public String toString(){
        return this.real+" + "+this.imag+"i";
    }

    public boolean equals(ComplexNumber_3045 obj){
        if(this.real==obj.real){
            if(this.imag==obj.imag){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ComplexNumber_3045 c1 = new ComplexNumber_3045(3,4);
        ComplexNumber_3045 c2 = new ComplexNumber_3045(1,-2);
        System.out.println("Sivaranjani -2022503045");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        ComplexNumber_3045 sum = c1.add(c2);
        System.out.println("The sum is: "+sum);
        ComplexNumber_3045 difference = c1.subtract(c2);
        System.out.println("The difference is: "+difference);

        ComplexNumber_3045 product = c1.multiply(c2);
        System.out.println("The product is: "+product);

        ComplexNumber_3045 quotient = c1.divide(c2);
        System.out.println("The quotient is: "+quotient);

        boolean isEqual = c1.equals(c2);
        System.out.println("c1 equals c2: " + isEqual);
    }

}



