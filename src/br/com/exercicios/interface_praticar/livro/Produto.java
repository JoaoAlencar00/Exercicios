package br.com.exercicios.interface_praticar.livro;

    public abstract class Produto {
        protected double preco;

        public Produto(double preco) {
            this.preco = preco;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }
    }

