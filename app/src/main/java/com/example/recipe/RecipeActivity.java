package com.example.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    //Variaveis da receita
    private TextView NomeReceita;
    private TextView IngredientesReceita;
    private TextView MetodosReceita;
    private TextView Receita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        //Puxando as views do xml
        NomeReceita = (TextView)findViewById(R.id.receita_texto);
        IngredientesReceita = (TextView)findViewById(R.id.ingredientes);
        MetodosReceita = (TextView)findViewById(R.id.metodo);
        Receita = (TextView)findViewById(R.id.receita);

        //Pegando o Intent e puxando os parametros para serem utilizados
        Intent intent = getIntent();
        String Titulo = intent.getExtras().getString("ReceitaNome");
        String Ingredientes = intent.getExtras().getString("ReceitaIngredientes");
        String Metodo = intent.getExtras().getString("Metodo");
        String receita = intent.getExtras().getString("Receita");

        //Setando os texts de acordo com o objeto Recipes
        NomeReceita.setText(Titulo);
        IngredientesReceita.setText(Ingredientes);
        MetodosReceita.setText(Metodo);
        Receita.setText(receita);

    }
}
