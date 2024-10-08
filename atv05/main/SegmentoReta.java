package main;

/**
 * Classe que modela um Segmento de reta
 */

public final class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }

    /**
     * Calcula a distancia entre dois pontos
     * @return d A distancia entre p1 e p2
     */

    public double comprimento() {
        double d = Math.sqrt(Math.pow(p2.getCoordX() - p1.getCoordX(),2)
            + Math.pow(p2.getCoordY()-p1.getCoordY(), 2));
        return d;
    }

    public double coeficienteAngular(){
        if (p1.getCoordX() == p2.getCoordX()){
            return Double.POSITIVE_INFINITY;
        }
        return (p2.getCoordY() - p1.getCoordY())
            / (p2.getCoordX() - p1.getCoordX());
    }

}
