class Suma{
    int num1, num2; // Atributos

    // Método constructor vacío
    Suma(){
    }

    // Método para mostrar el resultado de la suma
    public void MostrarResultado(){
        System.out.println("El resultado es " + (this.num1 + this.num2));
    }

    // Métodos para obtener y establecer el valor de num1
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Métodos para obtener y establecer el valor de num2
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Método para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return "Suma [num1=" + num1 + ", num2=" + num2 + "]";
    }
        
}