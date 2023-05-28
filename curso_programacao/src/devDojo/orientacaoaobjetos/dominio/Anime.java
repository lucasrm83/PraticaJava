package devDojo.orientacaoaobjetos.dominio;

public class Anime {
    private String nome;
    private int episodios;
    private int ano;
    private String genero;
    private String estudio;
    {
        System.out.println("Executa primeiro");
    }

    public Anime(String nome, int episodios, int ano, String genero) {
        this();
        this.nome = nome;
        this.episodios = episodios;
        this.ano = ano;
        this.genero = genero;
    }
    public Anime(String nome, int episodios, int ano, String genero, String estudio) {
        this(nome,episodios,ano,genero);
        this.estudio = estudio;
    }
    public Anime(){

    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(episodios);
        System.out.println(ano);
        System.out.println(genero);
        System.out.println(estudio);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
