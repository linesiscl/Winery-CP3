# 🍷 WinerySys - Aplicação de Web Services SOAP com Maven

Este projeto é uma aplicação Java baseada em Web Services SOAP utilizando Jakarta JAX-WS. Ele simula uma loja de vinhos com dois serviços: um para gerenciar pedidos e cardápio, e outro para enviar avisos de estoque. Dois clientes distintos consomem esses serviços separadamente.

---

## 🧩 Serviços SOAP
### 1. `WineStockService`
- 📍 **Endpoint:** `http://localhost:8085/WineStockService`
- 📄 **WSDL:** `http://localhost:8085/WineStockService?wsdl`
- 🧪 **Métodos:**
  - `getMenu()`: Retorna uma lista de vinhos disponíveis.
  - `placeOrder(String name, int quantity)`: Simula a realização de um pedido.

### 2. `WineWarningService`
- 📍 **Endpoint:** `http://localhost:8086/WineWarningService`
- 📄 **WSDL:** `http://localhost:8086/WineWarningService?wsdl`
- 🧪 **Método:**
  - `sendWarn()`: Retorna uma mensagem de aviso de estoque insuficiente.

---

## ▶️ Como executar

### 🔹 WinerySys

Acesse o projeto `WinerySys` e execute a classe `Loader.java`. Isso publicará os dois serviços SOAP nas portas `8085` e `8086`.

> **Importante:** Verifique se as portas `8085` e `8086` estão livres antes de executar.

### 🔹 WineStockClient

Em seguida, acesse `WineStockClient` e execute a classe `ApplicationClient1`. O cliente conecta no `WineStockService` e executa `getMenu()`, que vai exibir a lista de vinhos no console.

### 🔹 WineOrderClient

Por fim, acesse `WineOrderClient` e execute a classe `ApplicationClient2`. O cliente vai conectar no `WineStockService` e executar o método `placeOrder()`, conectando também no `WineWarningService` e executando `sendWarn()`.

---

## 🛠 Tecnologias utilizadas

- Java 17+
- Maven
- Jakarta JAX-WS (`jaxws-rt`)
- SOAP (RPC Style)
- IntelliJ IDEA

---

## 👩‍👩‍👧 Integrantes 

Aline Fernandes - RM 97966

Camilly Ishida - RM551474

Julia Leite - RM550201

