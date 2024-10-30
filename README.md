# zero-um-automoveis
API para gerenciamento de venda e anúncios de carros para Curso de Pós Graduação da FIAP

## Índice

- [Recursos](#recursos)
- [Instalação](#instalação)
- [Uso](#uso)
    - [Endpoints](#endpoints)
- [Exemplos de Chamadas HTTP](#exemplos-de-chamadas-http)

## Recursos

- Adicionar um veículo
- Listar todos os veículos
- Atualizar informações de um veículo
- Realizar uma venda
- Listas as vendas realizadas

## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/caiolepetit/zero-um-automoveis.git
   ```
2. Acesse a pasta do projeto
    ```bash
   cd zero-um-automoveis
    ```
3. Inicie através do docker
    ```bash
   docker compose up
    ```
## Uso

A API está disponível no seguinte endpoint base: `http://localhost:8080/v1/`

### Endpoints

- `POST /veiculos`: Adiciona um novo veículo.
- `GET /veiculos`: Lista todos os veículos ordenado por preço, do mais barato para o mais caro.
- `PUT /veiculos/:id`: Atualiza as informações de um veículo pelo ID.
- `PUT /veiculos/:id/venda`: Realiza a venda do veículo.
- `GET /vendas`: Lista todas as vendas ordenada por preço, do mais barato para o mais caro.

## Exemplos de Chamadas HTTP

### Adicionar um Veículo

```http
POST /veiculos
Content-Type: application/json

{
  "marca": "Chevrolet",
  "modelo": "Corsa",
  "ano": 1995,
  "cor": "Prata",
  "preco": "6200"
}
```

### Lista todos os veículos ordenado por preço, do mais barato para o mais caro.

```http
GET /veiculos
```

### Atualiza as informações de um veículo pelo ID.

```http
PUT /veiculos/1
Content-Type: application/json

{
  "id": 1,
  "marca": "Chevrolet",
  "modelo": "Corsa",
  "ano": 1997,
  "cor": "Prata",
  "preco": "6300"
}
```

### Realiza a venda do veículo.

```http
PUT /veiculos/1/venda
Content-Type: application/json

{
  "cpf": "11111111111"
}
```

### Lista todas as vendas ordenada por preço, do mais barato para o mais caro.

```http
GET /vendas
```