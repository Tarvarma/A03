public class Banda {
    private Bandido[] banda;
    private int indice = 0;

    public Banda(int cantidad){
        banda = new Bandido[cantidad];
    }

    public void agregar(Bandido b){
        if (indice < banda.length){
            banda[indice] = b;
            indice++;
        }
    }
}
