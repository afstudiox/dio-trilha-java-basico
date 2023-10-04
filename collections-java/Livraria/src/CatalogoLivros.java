import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adcionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.livroList.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntevaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adcionarLivro("Java Como Programar", "Deitela", 2016);
        catalogo.adcionarLivro("Java 9", "Deitel", 2016);
        catalogo.adcionarLivro("Java 9", "Deitel", 2017);
        catalogo.adcionarLivro("Java 10", "Deitel", 2018);
        catalogo.adcionarLivro("Java 11", "Deitela", 2019);

        List<Livro> pesquisarPorAutor = catalogo.pesquisarPorAutor("Deitela");
        System.out.println("Livros por autor: " );
        for (Livro livro : pesquisarPorAutor) {
            System.out.println(livro);
        }

        List<Livro> pesquisarPorIntervalorAnos = catalogo.pesquisarPorIntevaloAnos(2016, 2017);
        System.out.println("Livros por intervalo de anos: ");
        for (Livro livro : pesquisarPorIntervalorAnos) {
            System.out.println(livro);
        }

        Livro pesquisarPorTitulo = catalogo.pesquisarPorTitulo("Java 9");
        System.out.println("Livro por titulo: ");
        System.out.println(pesquisarPorTitulo);
    }
    
}
