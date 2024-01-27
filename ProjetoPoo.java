

package com.mycompany.projetopoo;
import java.util.Scanner;

public class ProjetoPoo {

  
public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int menu,submenu ;
    VeiculosAquaticos va = new VeiculosAquaticos();
    
    System.out.println("MENU DE OPÇÕES");
    System.out.print("1 - LANCHA\n  2 - JETSKI\n 3 - IATE\n 0 - SAIR\n");
    menu = ent.nextInt();
            
            switch(menu){
               
                case 1: { 
                System.out.println("Selecione a lancha 1 - Para passar qualquer dado ou 2, 3, 4, 5, 6 para outras opções");
                submenu = ent.nextInt();
                if (submenu == 1){ 
                Lancha l1 = new Lancha();
                l1.entrada();
                l1.imprimir();
                l1.valorDesconto();
                }
                else if(submenu == 2){
                Lancha l2 = new Lancha("marca", true);
                l2.entrada();
                l2.imprimir();
                l2.valorDesconto();
                }
                else if(submenu == 3){
                Lancha l3 = new Lancha(100.000, true);
                l3.entrada();
                l3.imprimir();
                l3.valorDesconto();
                }
                else if(submenu == 4){
                Lancha l4 = new Lancha(true, "id");
                l4.entrada();
                l4.imprimir();
                l4.valorDesconto();
                }
                else if(submenu == 5){
                Lancha l5 = new Lancha(200, true);
                l5.entrada();
                l5.imprimir();
                l5.valorDesconto();
                }
                else if(submenu == 6){
                Lancha l6 = new Lancha("marca", false, 200);
                l6.entrada();
                l6.imprimir();
                l6.valorDesconto();
                }
                else { System.out.println("Selecione uma opção válida");
                }
                break;
                }
                case 2: {  
                System.out.println("Selecione o jetski 1 - Para passar qualquer dado ou 2, 3, 4, 5, 6 para outras opções");
                submenu = ent.nextInt();
                if (submenu == 1){
                JetSki j1 = new JetSki();
                j1.entrada();
                j1.imprimir();
                j1.valorDesconto();
                }
                else if (submenu == 2){
                JetSki j2 = new JetSki("marca", true);
                j2.entrada();
                j2.imprimir();
                j2.valorDesconto();
                }
                else if (submenu == 3){
                JetSki j3 = new JetSki(200.000, false);
                j3.entrada();
                j3.imprimir();
                j3.valorDesconto();
                }
                else if (submenu == 4){
                JetSki j4 = new JetSki(true, "id");
                j4.entrada();
                j4.imprimir();
                j4.valorDesconto();
                }
                else if (submenu == 5){
                JetSki j5 = new JetSki(200, false);
                j5.entrada();
                j5.imprimir();
                j5.valorDesconto();
                }
                else if (submenu == 6){
                JetSki j6 = new JetSki(true, 100.000);
                j6.entrada();
                j6.imprimir();
                j6.valorDesconto();
                }
                else { System.out.println("Selecione uma opção válida");
                }
                break;
                }
                case 3: {  
                System.out.println("Selecione o Iate 1 - Para passar qualquer dado ou 2, 3, 4, 5, 6 para outras opções");
                submenu = ent.nextInt();
                if (submenu == 1){
                Iate i1 = new Iate();
                i1.entrada();
                i1.imprimir();
                i1.valorDesconto();
                }
                else if (submenu == 2){
                Iate i2 = new Iate(true);
                i2.entrada();
                i2.imprimir();
                i2.valorDesconto();
                }
                else if (submenu == 3){
                Iate i3 = new Iate("marca", true, 8, 4);
                i3.entrada();
                i3.imprimir();
                i3.valorDesconto();
                }
                else if (submenu == 4){
                Iate i4 = new Iate(false, 2);
                i4.entrada();
                i4.imprimir();
                i4.valorDesconto();
                }
                else if (submenu == 5){
                Iate i5 = new Iate(8, true);
                i5.entrada();
                i5.imprimir();
                i5.valorDesconto();
                }
                else if (submenu == 6){
                Iate i6 = new Iate(4, 8, true);
                i6.entrada();
                i6.imprimir();
                i6.valorDesconto();
                }
                else { System.out.println("Selecione uma opção válida");
                }
                break;
                }
                default: { System.out.println("Escolha a opção 1, 2 ou 3");
                break;
                }         
            }
}
}


           
        
        
        
            
        
    

