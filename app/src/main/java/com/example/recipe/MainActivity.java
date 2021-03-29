package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criando a array e populando ela de maneira hardcoded
        //A implementar colocar um banco de dados ou alocar em json
        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Galinhada","\nGalinha\n"+"\nIngredientes:\n"+ "Peito de galinha\n" +
                "Farinha\n" +
                "Alho em pó\n" +
                "Sal\n" +
                "Pimenta\n" +
                "Azeite"
                +"\n\nComo Fazer o Molho:\n" +
                "\n" +
                "Peito de galinha – Qualquer tipo funciona.\n" +
                "Manteiga salgada\n" +
                "Farinha branca\n" +
                "Leite\n" +
                "Iogurte.\n" +
                "Temperos-Pimenta etc\n" +
                "Queijo parmesão gratinado",
                "\nComo Fazer\n","Galinhada braba",R.drawable.frangada));

        recipes1.add(new Recipes("Bife Acebolado","\nIngredientes\n2 bifes\n" +
                "1 cebola grande picada em rodelas\n" +
                "Sal a gosto\n" +
                "2 cabeças de alho\n" +
                "4 colheres de maionese\n" +
                "1/2 xícara de água",
                "\n" +
                        "Instruções.\n" +
                        "1- Tempere e frite o bife ao seu gosto em uma frigideira.\n" +
                        "2- Após resguarde os bifes em um refratário ou travessa.\n" +
                        "3- Na mesma panela dos bifes doure a cebola picada em rodelas, adicione o alho, após adicione a água.\n" +
                        "4- Deixe cozinhar um pouco, até a cebola amolecer.\n" +
                        "5- Após feito isso adicione a maionese e deixe engrossar.\n" +
                        "6- Acrescente em cima dos bifes o creme com as cebolas e está pronto.\n" +
                        "\n","Receita: Um Bife Acebolado com maionese",R.drawable.bife));

        recipes1.add(new Recipes("Aveia","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer feugiat metus non risus lacinia aliquet. Proin pretium, nisl vitae tempor ",
                "dignissim, nunc nunc vulputate risus, quis vestibulum lectus sapien condimentum sapien. Morbi et viverra magna. Sed aliquet ex vel odio ",
                "dictum tristique. Morbi facilisis volutpat arcu nec scelerisque. Etiam a metus sit amet ant",R.drawable.aveia));




        //Achando o id do recicler view e alocando
        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        //Instanciando o viewAdapter
        myAdapter = new RecyclerViewAdapter(this,recipes1);
        //Setando o Layout
        myrecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        //Setando o adaptador do recycler view
        myrecyclerView.setAdapter(myAdapter);



    }

}
