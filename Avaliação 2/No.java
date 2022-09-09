public class No{
    private Pessoa p;
    private No proximo;
    private No anterior;

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No(Pessoa pe){
        this.p = pe;
    }

    public String toString(){
        if (proximo!=null && anterior!=null)
            return this.hashCode()+"Obj: "+p.toString() + "Proximo: "+proximo.hashCode() + " Anterior: "+anterior.hashCode();
        else if (proximo == null && anterior!=null)
            return this.hashCode()+"Obj: "+p.toString() + "Proximo: " + " Anterior: " + anterior.hashCode();
        else if (proximo != null && anterior==null)
            return this.hashCode()+"Obj: "+p.toString() + "Proximo: " + proximo.hashCode() + " Anterior: ";
        else
            return this.hashCode()+"Obj: "+p.toString() + "Proximo: " + " Anterior: ";
    }
}
