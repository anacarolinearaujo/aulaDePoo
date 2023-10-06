public class Lutador {
//Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categorias;
    private int vitorias, derrotas, empates;

//Métodos publicos
    public void apresentar(){
        System.out.println("______________________________________________________________________________________");
        System.out.println( "Chegou a hora! Apresentamos o lugatador " + this.getNome());
        System.out.println( "De " + this.getNacionalidade());
        System.out.println( " Com " + this.getIdade() + " de idade e com altura de " + this.getAltura() +
                            " Pesando " + this.getPeso());
        System.out.println(this.getVitorias() + " de vitórias! ");
        System.out.println(this.getDerrotas() + " de derrotas! ");
        System.out.println(this.getEmpates() + "  de  empates! ");
        System.out.println("______________________________________________________________________________________");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso da categoria " + this.getCategorias());
        System.out.println("Com " + getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(" e " + getEmpates() + " empate(s)");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);

    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //Métodos Especiais


    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategorias();
    }

    public String getCategorias() {
        return categorias;
    }

    private void setCategorias() {
        this.categorias = categorias;
        if(this.peso <= 52){
            this.categorias = "Invalido";
        }else if (this.peso <= 70.3){
            this.categorias = "Leve";
        } else if (this.peso <= 83.9) {
            this.categorias = "Médio";
        } else if (this.peso <=  120.2) {
            this.categorias = "Pesado";
        }else {
            this.categorias = "Inválido";
        }
    }
    // métodos especiais



    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }



}
