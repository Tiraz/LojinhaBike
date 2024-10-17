package br.com.etecia.myapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
