package com.example.recipe;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Recipes> mData;

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //Criando viewholder
        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_recipe,viewGroup,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {
        //Setando texto e recursos das receitas
        myHolder.TituloReceita.setText(mData.get(i).getRecipeName());
        myHolder.imagem_thumb.setImageResource(mData.get(i).getThumbnail());
        //Atribuindo método onclick
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RecipeActivity.class);
                /*Inserindo Parametros de acordo com posição
                para serem usados no recipeActivity
                */
                intent.putExtra("ReceitaNome",mData.get(i).getRecipeName());
                intent.putExtra("ReceitaIngredientes",mData.get(i).getRecipeIngredients());
                intent.putExtra("Metodo",mData.get(i).getRecipeMethodTitle());
                intent.putExtra("Receita",mData.get(i).getRecipe());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        //Retornando a contagem de items
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        //Definindo a classe MyHolder
        TextView TituloReceita;
        CardView cardView;
        ImageView imagem_thumb;

        //Instanciado MyHolder
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            TituloReceita = (TextView)itemView.findViewById(R.id.receita_texto);
            imagem_thumb = (ImageView)itemView.findViewById(R.id.receita_img);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);


        }
    }
}
