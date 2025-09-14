# 💳 Sistema de Máquina de Cartão em Java

Este projeto simula o funcionamento de uma **máquina de cartão** em Java, utilizando os conceitos de **POO (Programação Orientada a Objetos)** como:

- ✅ Encapsulamento  
- ✅ Herança  
- ✅ Polimorfismo  

---

## 🛠️ Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-17-orange?logo=java)  
![OOP](https://img.shields.io/badge/Paradigma-POO-blue)  
![Encapsulation](https://img.shields.io/badge/Encapsulation-green)  
![Inheritance](https://img.shields.io/badge/Inheritance-yellow)  
![Polymorphism](https://img.shields.io/badge/Polymorphism-purple)  

---

## 📂 Estrutura de Pastas
````java
src/
└── maquina/
├── Main.java
├── MaquinaCartao.java
├── Pagamento.java
├── PagamentoCredito.java
├── PagamentoDebito.java
└── PagamentoPix.java
````

---

## 🔹 Como Funciona?

1. O **cliente insere o cartão** e escolhe a forma de pagamento.  
2. A **máquina recebe um objeto** (`Pagamento`) — pode ser **crédito, débito ou pix**.  
3. O método `processarPagamento()` é chamado.  
4. Graças ao **polimorfismo**, cada classe lida com a lógica de forma diferente:  
   - `PagamentoCredito` → divide em parcelas.  
   - `PagamentoDebito` → verifica saldo.  
   - `PagamentoPix` → transfere instantaneamente.  

---

## ▶️ Executando o Projeto
```bash
# Compile os arquivos
javac src/maquina/*.java

# Rode o programa
java -cp src maquina.Main
````

#

## 📊 Ilustração do Processo

Abaixo um diagrama simplificado do funcionamento do sistema:
````java
Cliente -> MaquinaCartao -> Pagamento (abstrato)
                           ├── PagamentoCredito
                           ├── PagamentoDebito
                           └── PagamentoPix
````
<img width="524" height="1536" alt="d3eda48e-665e-4ecb-821f-b172ce3b55d3" src="https://github.com/user-attachments/assets/750ddf34-d8e5-4433-89a5-f36478716589" />

---

### 👨‍💻 Autor :  `Hudson Amorim`
💡 Desenvolvido como exemplo de estudo de POO em Java.


