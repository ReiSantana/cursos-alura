package br.com.alura.screenmatch.desafios.desafio_5_final.modelos;

public class Compra implements Comparable<Compra> {

    private String descricaoItem;
    private double valorItem;

    public String getdescricaoItem() {
        return descricaoItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public Compra(String descricaoItem, double valorItem) {
        this.descricaoItem = descricaoItem;
        this.valorItem = valorItem;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.getValorItem(), outraCompra.getValorItem());

    }

    @Override
    public String toString() {
        return this.getdescricaoItem() + ": " + this.getValorItem();
    }

}