
package com.mycompany.projetopoo;

import java.util.Scanner;

public class JetSki extends VeiculosAquaticos {
    boolean reboque;
    //construtor 1
    public JetSki(){}
    //construtor2 reuso1
     public JetSki(String m, String mo, String c, String tp, String id,
           int np, int v, double pre, double p, double ac){
        super (m , mo, c, tp, id, np, v, pre, p, ac);
    //construtor3 reuso2
    }
public JetSki(String m, String mo, String c, String tp, String id,
           int np, int v, double pre, double p, double ac, boolean r){
        super (m , mo, c, tp, id, np, v, pre, p, ac);
        setReboque(r);
    }
public void setReboque(Boolean r){
        reboque = true;
    }
    public boolean getReboque(){
        return reboque;
    }
    public void semReboque(Boolean r){
        reboque = false;
    }
    //construtor4 reuso3
    public JetSki(String m){
        super (m);
    }
    //construtor5 reuso4
    public JetSki(String m, int np, double pre){
        super(m, np, pre);
    }
    //construtor6 reuso5
    public JetSki(double pre, String mo){
        super(pre, mo);
    }
    //construtor7
    public JetSki(String m, boolean r){
        setMarca(m);
        setReboque(r);
    }
    //construtor8
    public JetSki(double pre, boolean r){
        setPreco(pre);
        setReboque(r);
    }
    //construtor9
    public JetSki(boolean r, String id){
        setReboque(r);
        setIdentificacao(id);
    }
    //construtor10
    public JetSki(int v, boolean r){
        setVelocidadeMaxima(v);
        setReboque(r);
    }
    //construtor11
    public JetSki (boolean r, double pre){
        setReboque(r);
        setPreco(pre);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Com reboque   :" + getReboque());
    }
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Tem reboque:  ");
        setReboque(Boolean.parseBoolean(ent.nextLine()));
    }
    public void cadastrar(String m, String mo, String c, String tp, String id,
           int np, int v, double pre, double p, double ac, boolean r){
        super.cadastrar (m , mo, c, tp, id, np, v, pre, p, ac);
        setReboque(r);
    }
    public void valorDesconto(){
       preco = preco - (preco * 0.15);
       System.out.println("Valor com desconto de 15%:  R$" + getPreco()); 
    }
    
}
