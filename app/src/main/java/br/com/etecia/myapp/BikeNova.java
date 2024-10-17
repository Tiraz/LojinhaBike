package br.com.etecia.myapp;

public class BikeNova {
    private String tituloBikeNova;
    private int imagemBikeNova;

    //Construtor da classe
    public BikeNova(String tituloBikeNova, int imagemBikeNova) {
        this.tituloBikeNova = tituloBikeNova;
        this.imagemBikeNova = imagemBikeNova;
    }

    //método de acesso get  e set
    public String getTituloBikeNova() {
        return tituloBikeNova;
    }

    public void setTituloBikeNova(String tituloBikeNova) {
        this.tituloBikeNova = tituloBikeNova;
    }

    public int getImagemBikeNova() {
        return imagemBikeNova;
    }

    public void setImagemBikeNova(int imagemBikeNova) {
        this.imagemBikeNova = imagemBikeNova;
    }
}
