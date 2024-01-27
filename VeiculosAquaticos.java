
package com.mycompany.projetopoo;

import java.util.Scanner;



public class VeiculosAquaticos {
    
    String marca, modelo, cor, tipoCasco, identificacao;
    int numeroPassageiros, velocidadeMaxima;
    double preco, peso, alturaCalado;
    //construtor1
    public VeiculosAquaticos(){}
    //construtor2
    public VeiculosAquaticos(String m, String mo, String c, String tp, String id,
            int np, int v, double pre, double p, double ac){
            setMarca(m);
            setModelo(mo);
            setCor(c);
            setTipoCasco(tp);
            setIdentificacao(id);
            setNumeroPassageiros(np);
            setVelocidadeMaxima(v);
            setPreco(pre);
            setPeso(p);
            setAlturaCalado(ac);
    }
    //construtor3
    public VeiculosAquaticos(String m){
        setMarca(m);
    }
    //construtor4
    public VeiculosAquaticos(double pre){
        setPreco(pre);
    }
    //construtor5
    public VeiculosAquaticos(int np){
        setNumeroPassageiros(np);
    }
    //construtor6
    public VeiculosAquaticos(String m, int np, double pre){
        setMarca(m);
        setNumeroPassageiros(np);
        setPreco(pre);
    }
    //construtor7
    public VeiculosAquaticos(String mo, String c){
        setModelo(mo);
        setCor(c);
    }
    //construtor8
    public VeiculosAquaticos(String tp, int np){
        setTipoCasco(tp);
        setNumeroPassageiros(np);
    }
    //construtor9
    public VeiculosAquaticos(double pre, String mo){
        setPreco(pre);
        setModelo(mo);
    }
    //construtor10
    public VeiculosAquaticos(int v, String mo){
        setVelocidadeMaxima(v);
        setModelo(mo);
    }
    public void setMarca(String m){
            marca = m;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo (String mo){
            marca = mo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setCor(String c){
            cor = c;
    }
    public String getCor(){
        return cor;
    }
    public void setTipoCasco(String tp){
            tipoCasco = tp;
    }
    public String getTipoCasco(){
        return tipoCasco;
    }
    public void setIdentificacao(String id){
            identificacao = id;
    }
    public String getIdentificacao(){
        return identificacao;
    }
    public void setNumeroPassageiros(int np){
        
        if (np > 0){
            numeroPassageiros = np;
        }
    }
    public int getNumeroPassageiros(){
        return numeroPassageiros;
    }
    public void setVelocidadeMaxima(int v){
        
        if (v > 0){
            velocidadeMaxima = v;
        }
    }
    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    public void setPreco(double pre){
        
        if (pre > 0){
            preco = pre;
        }
    }
    public double getPreco(){
        return preco;
    }
    public void setPeso(double p){
        
        if (p > 0){
            peso = p;
        }
    }
    public double getPeso(){
        return peso;
    }
    public void setAlturaCalado(double ac){
        
        if (ac > 0){
            alturaCalado = ac;
        }
    }
    public double getAlturaCalado(){
        return alturaCalado;
    }
    public void imprimir(){
        System.out.println("Marca:  " + getMarca());
        System.out.println("Modelo:  " + getModelo());
        System.out.println("Cor:  " + getCor());
        System.out.println("Tipo de casco:  " + getTipoCasco());
        System.out.println("Identificação:  " + getIdentificacao());
        System.out.println("Número de passageiros:  " + getNumeroPassageiros());
        System.out.println("Velocidade Máxima:  " + getVelocidadeMaxima());
        System.out.println("Preço:  " + getPreco());
        System.out.println("Peso:  " + getPeso());
        System.out.println("Altura do calado:  " + getAlturaCalado());
         
     }
    public void entrada(){
        Scanner ent = new Scanner(System.in);
        System.out.println("Marca   :");
        setMarca(ent.nextLine());
        System.out.println("Modelo   :");
        setModelo(ent.nextLine());
        System.out.println("Cor   :");
        setCor(ent.nextLine());
        System.out.println("Tipo de casco   :");
        setTipoCasco(ent.nextLine());
        System.out.println("Identificação   :");
        setIdentificacao(ent.nextLine());
        System.out.println("Número de passageiros   :");
        setNumeroPassageiros(Integer.parseInt(ent.nextLine()));
        System.out.println("Velocidade Máxima   :");
        setVelocidadeMaxima(Integer.parseInt(ent.nextLine()));
        System.out.println("Preço   :");
        setPreco(Double.parseDouble(ent.nextLine()));
        System.out.println("Peso   :");
        setPeso(Double.parseDouble(ent.nextLine()));
        System.out.println("Altura do calado   :");
        setAlturaCalado(Double.parseDouble(ent.nextLine()));   
    }
    public void cadastrar(String m, String mo, String c, String tp, String id,
            int np, int v, double pre, double p, double ac){
            setMarca(m);
            setModelo(mo);
            setCor(c);
            setTipoCasco(tp);
            setIdentificacao(id);
            setNumeroPassageiros(np);
            setVelocidadeMaxima(v);
            setPreco(pre);
            setPeso(p);
            setAlturaCalado(ac);
     }
}