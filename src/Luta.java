import java.util.Random;


public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int roud;
    private boolean aprovada;

//métodos públics
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategorias().equalsIgnoreCase(l2.getCategorias())
            && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void  lutar(){
        if (this.aprovada){
            System.out.println("+++DESAFIADO+++");
            this.desafiado.apresentar();
            System.out.println("+++DESAFIANTE+++");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0: // empate
                    System.out.println("EMPATE!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                break;

                case 1: // desafiado ganhou luta
                    System.out.println("Desafiado ganhou!");
                    System.out.println(this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;

                case 2: // desafiante ganhou a luta
                    System.out.println("Desafiante ganhou!");
                    System.out.println(this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();




            }


        } else {
            System.out.println("Luta não foi aprovada!");
        }
    }

//Métodos Especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRoud() {
        return roud;
    }

    public void setRoud(int roud) {
        this.roud = roud;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
