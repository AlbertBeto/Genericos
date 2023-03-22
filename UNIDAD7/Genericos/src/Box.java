public class Box<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        //Al especificar el diamante aqui convierte la T de la clase enlo que ponga en el diamante de Box
        Box <Integer> box = new Box();
        box.setT(12);
        System.out.println(box.getT());


        //main
    }
    //class
}
