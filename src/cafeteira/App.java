package cafeteira;

public class App {
    public static void main(String[] args) throws Exception {
        Maquina maquina = new Maquina(true, true, false, "Grande");
        maquina.fazerCafeGrande();
        maquina.verificarCafe();
        
        
    }
}
