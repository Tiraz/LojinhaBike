package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {

    //criando variáveis globais para representar a lista e o contexto
    private Context context;
    private List<BikeNova> lstBikeNova;

    //criando um construtor
    public RecyclerAdapterBikeNova(Context context, List<BikeNova> lstBikeNova) {
        this.context = context;
        this.lstBikeNova = lstBikeNova;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bikes_novas,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idModeloBikeNovaTitulo.setText(lstBikeNova.get(position).getTituloBikeNova());
        holder.idModeloBikeNovaImagem.setImageResource(lstBikeNova.get(position).getImagemBikeNova());

        //criar o clique no card

    }

    @Override
    public int getItemCount() {
        return lstBikeNova.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView idModeloBikeNovaCard;
        ImageView idModeloBikeNovaImagem;
        TextView idModeloBikeNovaTitulo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idModeloBikeNovaCard = itemView.findViewById(R.id.idModeloBikeNovaCard);
            idModeloBikeNovaImagem = itemView.findViewById(R.id.idModeloBikeNovaImagem);
            idModeloBikeNovaTitulo = itemView.findViewById(R.id.idModeloBikeNovaTitulo);
        }

    }

}
