
package com.mycompany.projetopoo;

import java.util.Scanner;



public class Lancha extends VeiculosAquaticos{
    boolean banheiro;    
    //construtor1
    public Lancha(){}
    //construtor2 reuso1
    public Lancha(String m, String mo, String c, String tp, String id,
           int np, int v, double pre, double p, double ac){
        super (m , mo, c, tp, id, np, v, pre, p, ac);
    }
    //construtor3 reuso2
    public Lancha(String m, String mo, String c, String tp, String id,
           int np, int v, double pre, double p, double ac, boolean b){
        super (m , mo, c, tp, id, np, v, pre, p, ac);
        setBanheiro(b);
    }
    public void setBanheiro(Boolean b){
        banheiro = true;
    }
    public boolean getBanheiro(){
        return banheiro;
    }
    public void semBanheiro(Boolean b){
        banheiro = false;
    }
    //construtor4 reuso3
    public Lancha(String m){
        super (m);
    }
    //construtor5 reuso4
    public Lancha(String m, int np, double pre){
        super(m, np, pre);
    }
    //construtor6 reuso5
    public Lancha(double pre, String mo){
        super(pre, mo);
    }
    //construtor7
    public Lancha(String m, boolean b){
        setMarca(m);
        setBanheiro(b);
    }
    //construtor8
    public Lancha(double pre, boolean b){
        setPreco(pre);
        setBanheiro(b);
    }
    //construtor9
    public Lancha(boolean b, String id){
        setBanheiro(b);
        setIdentificacao(id);
    }
    //construtor10
    public Lancha(int v, boolean b){
        setVelocidadeMaxima(v);
        setBanheiro(b);
    }
    //construtor11
    public Lancha(String m, boolean b, int v){
        setMarca(m);
        setBanheiro(b);
        setVelocidadeMaxima(v);
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Com banheiro   :" + getBanheiro());
    }
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        super.entrada();
        System.out.println("Tem banheiro:  ");
        setBanheiro(Boolean.parseBoolean(ent.nextLine()));
    }
    public void cadastrar(String m, String mo, String c, String tp, String id,
           int np, int v, double pre, double p, double ac, boolean b){
        super.cadastrar (m , mo, c, tp, id, np, v, pre, p, ac);
        setBanheiro(b);
    }
    public void valorDesconto(){
       preco = preco - (preco * 0.10);
       System.out.println("Valor com desconto de 10%:  R$" + getPreco());  
    } 
}


