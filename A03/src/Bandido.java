public class Bandido {
    String apodo;
    int altura;
    int salud = 5;

    public Bandido(String apodo, int altura){
        this.apodo = apodo;
        this.altura = altura;
    }

    public void atacar(Bandido b){
        b.recibirDanno();
    }

    public void recibirDanno(){
        if (salud>0) salud--;
        else {
            System.out.println("Me rindo.");
        }
    }
}
