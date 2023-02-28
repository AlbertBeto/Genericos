public class dog {
    //campos, atributos, variable miembro
    // estado objeto
    //SIEMPRE SIEMPRE SIEMPRE SIEMPRE privado por seguridad
    private String raza;
    private String nombre;
    private int age;
    private final int patas = 4; //el final es una constante con lo que no hay que crear set 
    
    //miembros de la clase
    //getters y setters
    // This es para decir que este atributo es el de esta clase si no lo pones es posible que tenga problemas si la variable es la misma. 
    // Si haces boton derecho -- crear -- setters and getters te los crea todos. 
    // Tambien puedes hacer boton derecho -- crear -- toString y sacara todos los campos para poder imprimirlos. 
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPatas() {
        return patas;
    }
    
    
}
