class Contador {
    int contador;
    static int staticContador;
    public Contador() {
        contador++;
        staticContador++;
    }
    public int getContador() {
        return contador;
    }
    public static int getStaticContador() {
        return staticContador;
    }
}
class TestContador {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        Contador c4 = new Contador();
        Contador c5 = new Contador();
        Contador c6 = new Contador();
        System.out.println("contador es: " + c1.getContador());
        System.out.println("staticContador es: " + c1.getStaticContador());
    }
}