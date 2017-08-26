package cardview.arthur.com.br.mycardview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import cardview.arthur.com.br.mycardview.R;
import cardview.arthur.com.br.mycardview.model.Card;

/**
 * Created by arthur on 25/08/17.
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.MyRecycleViewAdapterHolder> {

    Context contexxtActivity;
    List<Card> lista;
    MyRecycleListener listener;

    public interface MyRecycleListener{
        public void onClickListener(View view, int position);
    }

    public MyRecycleViewAdapter(Context contexxtActivity, List<Card> lista, MyRecycleListener listener) {
        this.contexxtActivity = contexxtActivity;
        this.lista = lista;
        this.listener = listener;
    }

    @Override
    public MyRecycleViewAdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(contexxtActivity).inflate(R.layout.card_view, parent, false);
            MyRecycleViewAdapterHolder holder = new MyRecycleViewAdapterHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(final MyRecycleViewAdapterHolder holder, final int position) {

        Card card = lista.get(position);

        holder.txtNome.setText(card.getNome());
        holder.txtDescricao.setText(card.getDescricao());
        holder.image.setImageResource(card.getImagem());

        if(listener != null) {

            holder.itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    listener.onClickListener(holder.view, position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return lista == null ? 0 : lista.size();
    }

    public static class MyRecycleViewAdapterHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView txtNome;
        TextView txtDescricao;
        View view;

        public MyRecycleViewAdapterHolder(View itemView) {
            super(itemView);
            this.view = itemView;

            image = (ImageView) view.findViewById(R.id.img_card);
            txtNome = (TextView) view.findViewById(R.id.txtNome);
            txtDescricao = (TextView) view.findViewById(R.id.txtDescricao);
        }
    }
}


//
//    Context context;
//    List<Animal> animais;
//    AnimalOnClickListener onClickListener;
//
//public interface AnimalOnClickListener{
//    public void OnClickAnimal(View view, int position);
//}
//
//    /**
//     * Instanciado pela activity ou fragmente responsavel pela tela
//     * @param context
//     * @param animais
//     * @param onClickListener
//     */
//    public AnimalAdapterRecicleView(Context context, List<Animal> animais, AnimalOnClickListener onClickListener) {
//        this.context = context;//Recebo o contexto
//        this.animais = animais;//Recebo a lista de animnais
//        this.onClickListener = onClickListener;//e Recebo a instancia da minha interface com a logica do metodo
//    }
//
//    /**
//     * Método responsável por criar a view
//     * Chamado apenas uma vez
//     * @param parent
//     * @param viewType
//     * @return
//     */
//    @Override
//    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(context).inflate(R.layout.adapter_animal, parent ,false);
//
//        AnimalViewHolder animalHolder = new AnimalViewHolder(view);
//
//        return animalHolder;
//    }
//
//    /**
//     * Método responsavel pela inserão de informações na view
//     * chamado varias vezes de dependendo do tamanho da lista
//     * @param holder
//     * @param position
//     */
//    @Override
//    public void onBindViewHolder(final AnimalViewHolder holder, final int position) {
//
//        Animal animal = animais.get(position);
//
//        holder.tNome2.setText(animal.getNome());
//        holder.imageView.setImageResource(R.drawable.planeta_01_mercurio);
//
//        if(onClickListener != null){
//            holder.itemView.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v) {
//                    onClickListener.OnClickAnimal(holder.view, position);
//                }
//            });
//        }
//    }
//
//    /**
//     * Metodo que retorna tamanho da lista
//     * @return
//     */
//    @Override
//    public int getItemCount() {
//        return animais == null ? 0 : animais.size();
//    }
//
///**
// * Classe que contém e
// * recebe as views(componentes) criados no adapter_layout
// * recebe uma view previamente inflada
// */
//public static class AnimalViewHolder extends RecyclerView.ViewHolder{
//
//    public TextView tNome2;
//
//    ImageView imageView;
//
//    ProgressBar progressBar;
//
//    private View view;
//
//    public AnimalViewHolder(View view) {
//        super(view);
//        this.view = view;
//
//        tNome2 = (TextView) view.findViewById(R.id.tNome2);
//        imageView = (ImageView)view.findViewById(R.id.img2);
//
//        progressBar = (ProgressBar) view.findViewById(R.id.progress2);
//    }
//
//}
