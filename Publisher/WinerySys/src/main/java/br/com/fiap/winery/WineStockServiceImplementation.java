package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{

    @Override
    public String getMenu() {
        String[] vinhos = {
                "Cabernet Sauvignon",
                "Merlot",
                "Syrah",
                "Pinot Noir",
                "Chardonnay"
        };

        StringBuilder menu = new StringBuilder("Menu de Vinhos:\n");

        for (int i = 0; i < vinhos.length; i++) {
            menu.append(String.format("%d. %s%n", i + 1, vinhos[i]));
        }

        return menu.toString();
    }

    @Override
    public String placeOrder(String name, int quantity) {
        String unidade = quantity == 1 ? "garrafa" : "garrafas";
        return String.format(
                "Pedido confirmado!\nCliente: %s\nQuantidade: %d %s.",
                name, quantity, unidade
        );
    }

}
