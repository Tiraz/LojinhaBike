package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BikesNovasFragment extends Fragment {


    private List<BikeNova> lstBikeNova;
    RecyclerView idRecBikesNovas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);

        idRecBikesNovas = view.findViewById(R.id.idRecBikesNovas);

        //carregando objetos na lista
        lstBikeNova = new ArrayList<>();
        lstBikeNova.add(new BikeNova("Monster Bike", R.drawable.monster));
        lstBikeNova.add(new BikeNova("Bike Um", R.drawable.bike_um));
        lstBikeNova.add(new BikeNova("Bike Dois", R.drawable.bike_dois));
        lstBikeNova.add(new BikeNova("Bike Três", R.drawable.bike_tres));
        lstBikeNova.add(new BikeNova("Bike Quatro", R.drawable.bike_quatro));
        lstBikeNova.add(new BikeNova("Bike Cinco", R.drawable.bike_cinco));
        lstBikeNova.add(new BikeNova("Bike Seis", R.drawable.bike_seis));
        lstBikeNova.add(new BikeNova("Bike Sete", R.drawable.bike_sete));
        lstBikeNova.add(new BikeNova("Bike Oito", R.drawable.bike_oito));
        lstBikeNova.add(new BikeNova("Bike Nove", R.drawable.bike_nove));
        lstBikeNova.add(new BikeNova("Bike Dez", R.drawable.bike_dez));


        //Carregando o adaptador
        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(),lstBikeNova);

        idRecBikesNovas.setLayoutManager(new GridLayoutManager(getContext(),2));

        idRecBikesNovas.setAdapter(adapterBikeNova);



        return view;
    }
}