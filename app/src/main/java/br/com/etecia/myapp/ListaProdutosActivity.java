package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {

    RecyclerView idListaProdutos;
    List<Produtos> lstProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_produtos_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //criando um array que ira carregar a lista de produtos
        lstProdutos = new ArrayList<>();
        lstProdutos.add(new Produtos("Strawberry", R.drawable.strawberry));
        lstProdutos.add(new Produtos("Birthday Cake with Wishes", R.drawable.birthday));
        lstProdutos.add(new Produtos("Birthday Cake with Wishes", R.drawable.birthday_cakewith_wishes));
        lstProdutos.add(new Produtos("Velvet Cake" ,R.drawable.velvetcake));
        lstProdutos.add(new Produtos("Butter Cake", R.drawable.butter_cake));
        lstProdutos.add(new Produtos("Chocolate", R.drawable.chocolate));
        lstProdutos.add(new Produtos("Grace Flower", R.drawable.graceflower));
        lstProdutos.add(new Produtos("Butter Cake", R.drawable.butter_cake));
        lstProdutos.add(new Produtos("Vanilla Cake", R.drawable.vanilla_cake));
        lstProdutos.add(new Produtos("Forest Cake", R.drawable.forest_cake));


        idListaProdutos = findViewById(R.id.idListaProdutos);

        //tipo de layout
        idListaProdutos.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2 ));

        //instanciar o adaptador
        AdaptadorProdutos adapter = new AdaptadorProdutos(getApplicationContext(), lstProdutos);

        idListaProdutos.hasFixedSize();;

        idListaProdutos.setAdapter(adapter);


    }
}