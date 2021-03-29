package com.example.recipe;

public class Recipes {
    //Atributos da classe Receita
    private String NomeReceita;
    private String IngredientesReceita;
    private String MetodoReceita;
    private String Receita;
    private int Thumbnail;

    //Construtor com 5 parametros
    public Recipes(String Nome, String Ingredientes, String Metodos,String Receita, int thumbnail){
        NomeReceita = Nome;
        IngredientesReceita = Ingredientes;
        MetodoReceita = Metodos;
        this.Receita = Receita;
        Thumbnail = thumbnail;
    }

    //Métodos públicos para retornar nomes dos atributos privados
    public String getRecipeName(){
            return NomeReceita;
    }
    public String getRecipeIngredients(){
        return IngredientesReceita;
    }
    public String getRecipeMethodTitle(){
        return MetodoReceita;
    }
    public String getRecipe(){
        return Receita;
    }
    public int getThumbnail(){
        return Thumbnail;
    }
}
