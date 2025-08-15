package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
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
        lstProdutos.add(new Produtos("Birthday Cake with Wishes", R.drawable.birthday_cakewith_wishes)):
        lstProdutos.add(new Produtos("Birthday Cake with Wishes", R.drawable.birthday_cakewith_wishes));

        idListaProdutos = findViewById(R.id.idListaProdutos);
        ;
    }
}