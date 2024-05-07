package com.example.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurante.databinding.ActivityPedidoBinding

class PedidoActivity : AppCompatActivity() {
    // Declara a variável binding do tipo ActivityPedidoBinding
    private lateinit var binding: ActivityPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        // Atribui a variável binding no ActivityPedidoBinding
        binding = ActivityPedidoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        // Define o conteúdo que vai ser visto no Activity
        setContentView(binding.root)

        // Declara os valores passados pela intent
        val i = intent
        // Extrai a quantidade de pizzas, saladas e hambúrgueres do intent
        val quantidadePizza = i.getStringExtra("quantidadePizza").toString().toInt()
        val quantidadeSalada = i.getStringExtra("quantidadeSalada").toString().toInt()
        val quantidadeHamburguer = i.getStringExtra("quantidadeHamburguer").toString().toInt()

        // Calcula os preços e cria um texto do resumo do pedido
        val texto = "Resumo do Pedido\n" +
                "Pizza: $quantidadePizza Preço: ${quantidadePizza*8}\n" +
                "Salada: $quantidadeSalada Preço: ${quantidadeSalada*10}\n" +
                "Hamburguer: $quantidadeHamburguer Preço: ${quantidadeHamburguer*12}\n"

        // Atribui o texto do "Resumo do Pedido" na variável
        binding.textResumo.text = texto

    }
}