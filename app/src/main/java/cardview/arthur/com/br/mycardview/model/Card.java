package cardview.arthur.com.br.mycardview.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cardview.arthur.com.br.mycardview.R;

/**
 * Created by arthur on 25/08/17.
 */

public class Card implements Serializable {

    private String nome;

    private String descricao;

    private int imagem;

    public Card(String nome, String descricao, int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public static List<Card> listCard(){
        List<Card> lista = new ArrayList<>();

        lista.add(new Card("Terra", "Planeta do seres humanos", R.drawable.planeta_03_terra));
        lista.add(new Card("Marte", "Planeta do aliens", R.drawable.planeta_04_marte));
        return lista;
    }
}
