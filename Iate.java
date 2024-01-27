
package com.mycompany.projetopoo;

import java.util.Scanner;


public class Iate extends VeiculosAquaticos {
    boolean piscina;
    int numeroTripulantes, numeroCabines;
    //construtor1
    public Iate(){}
    //construtor2 reuso1
     public Iate(String m, String mo, String c, String tp, String id,
           int np, int v, double pre, double p, double ac){
        super (m , mo, c, tp, id, np, v, pre, p, ac);
    }
    //construtor3 reuso2
public Iate(String m, String mo, String c, String tp, String id,
           int np, int v, int nt,int nc,  double pre, double p, double ac, boolean pis){
        super (m , mo, c, tp, id, np, v, pre, p, ac);
        setPiscina(pis);
        setNumeroTripulantes(nt);
        setNumeroCabines(nc);
    }
public void setNumeroTripulantes(int nt){
    
    if(nt > 0){
        numeroTripulantes = nt;
    }
}
public int getNumeroTripulantes(){
    return numeroTripulantes;
}
public void setNumeroCabines(int nc){
    
    if(nc > 0){
        numeroCabines = nc;
    }
}
public int getNumeroCabines(){
    return numeroCabines;
}
public void setPiscina(Boolean pis){
        piscina = true;
    }
    public boolean getPiscina(){
        return piscina;
    }
    public void semPiscina(Boolean pis){
        piscina = false;
    }
    //construtor4 reuso3
    public Iate(String m){
        super (m);
    }
    //construtor5 reuso4
    public Iate(String m, int np, double pre){
        super(m, np, pre);
    }
    //construtor6 reuso5
    public Iate(double pre, String mo){
        super(pre, mo);
    }
    //construtor7
    public Iate(int nt, int nc, boolean pis){
        setNumeroTripulantes(nt);
        setNumeroCabines(nc);
        setPiscina(pis);
    }
    //construtor8
    public Iate (int nt, boolean pis){
        setNumeroTripulantes(nt);
        setPiscina(pis);   
    }
    //construtor9
    public Iate (boolean pis, int nc){
        setNumeroCabines(nc);
        setPiscina(pis);
    }
    //construtor10
    public Iate (String m, boolean pis, int nc, int nt){
        setNumeroTripulantes(nt);
        setNumeroCabines(nc);
        setPiscina(pis);
        setMarca(m);
    }
    //construtor11
    public Iate (boolean pis){
        setPiscina(pis);
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Com piscina   :" + getPiscina());
        System.out.println("Número de tripulantes:  " + getNumeroTripulantes());
        System.out.println("Número de cabines:  " + getNumeroCabines());
    }
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Tem piscina:  ");
        setPiscina(Boolean.parseBoolean(ent.nextLine()));
        System.out.println("Número de tripulantes   :");
        setNumeroTripulantes(Integer.parseInt(ent.nextLine()));
        System.out.println("Número de cabines   :");
        setNumeroCabines(Integer.parseInt(ent.nextLine()));
    }
    public void cadastrar(String m, String mo, String c, String tp, String id,
           int np, int v, int nt, int nc, double pre, double p, double ac, boolean pis){
        super.cadastrar (m , mo, c, tp, id, np, v, pre, p, ac);
        setPiscina(pis);
        setNumeroTripulantes(nt);
        setNumeroCabines(nc);
    }
    public void valorDesconto(){
       preco = preco - (preco * 0.08);
       System.out.println("Valor com desconto de 8%:  R$" + getPreco()); 
    
    }
    
}
