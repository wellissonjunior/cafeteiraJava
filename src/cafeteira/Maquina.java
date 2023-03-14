package cafeteira;

public class Maquina implements Funcionamento{
    private boolean ligada;
    private boolean reservatorioAgua;
    private boolean capsulaCafe;
    private String tamanhoCafe;
    
    
    
    
    
    
    
    
    
    public Maquina(boolean ligada, boolean reservatorioAgua, boolean capsulaCafe, String tamanhoCafe) {
        this.ligada = ligada;
        this.reservatorioAgua = reservatorioAgua;
        this.capsulaCafe = capsulaCafe;
        this.tamanhoCafe = tamanhoCafe;
        
    }

    


    public boolean isLigada() {
        return ligada;
    }




    public void setLigada(boolean ligada) {
        
            this.ligada = ligada;
            
        
        
    }




    public boolean isReservatorioAgua() {
        return reservatorioAgua;
    }




    public void setReservatorioAgua(boolean reservatorioAgua) {
        
            this.reservatorioAgua = reservatorioAgua;
            
        
    }




    public boolean isCapsulaCafe() {
        return capsulaCafe;
    }




    public void setCapsulaCafe(boolean capsulaCafe) {

        
            this.capsulaCafe = capsulaCafe;
           
               
    }




    public String gettamanhoCafe() {
        return tamanhoCafe;
    }




    public void settamanhoCafe(String tamanhoCafe) {
        if (this.gettamanhoCafe().equalsIgnoreCase("Pequeno")) {
            this.tamanhoCafe = "Pequeno";
            System.out.println("Você escolheu um café pequeno");
        } else if (this.gettamanhoCafe().equalsIgnoreCase("Grande")) {
            this.tamanhoCafe = "Grande";
            System.out.println("Você escolheu um café grande");
        } else {
            this.tamanhoCafe = "Escolha o temanho do seu café";
        }
    }





    @Override
    public void fazerCafePequeno() {
       if (this.isLigada() && this.isCapsulaCafe() && this.isReservatorioAgua() && gettamanhoCafe().equalsIgnoreCase("Pequeno")) {
        System.out.println("Seu cafezinho estará pronto em instantes");
       } else {
        System.out.println("Verifique as instruções de preparo do café");
       }

        
    }
    @Override
    public void fazerCafeGrande() {
        if (this.isLigada() && this.isCapsulaCafe() && this.isReservatorioAgua() && gettamanhoCafe().equalsIgnoreCase("Grande")) {
            System.out.println("Seu café grande estará pronto em instantes");
           } else {
            System.out.println("Verifique as instruções de preparo do café");
           }
    }

    @Override
    public void verificarCafe() {
        System.out.println("------ Máquina de café --------");
        if (this.isLigada()) {
            System.out.println("Sua máquina está ligada");
        } else {
            System.out.println("Você precisa ligar a máquina de café");
        }

        System.out.println("------ Reservatório de água --------");

        if (this.isReservatorioAgua()) {
           System.out.println("Seu reservatório de água está cheio");
        } else {
            System.out.println("Verifique seu reservatório de água");
        }

        System.out.println("------ Cápsula de café --------");
        if (this.isCapsulaCafe()) {
            
            System.out.println("Sua cápsula de café está inserida corretamente");
        } else {
            System.out.println("Verifique se a cápsula de café está inserida corretamente");
        }

        System.out.println("------- Temanho do café ------");
        if (this.gettamanhoCafe().equalsIgnoreCase("Pequeno")) {
            
            System.out.println("Você escolheu um café pequeno");
        } else if (this.gettamanhoCafe().equalsIgnoreCase("Grande")) {
            
            System.out.println("Você escolheu um café grande");
        } else {
            this.tamanhoCafe = "Escolha o temanho do seu café";
        }
    }
}
