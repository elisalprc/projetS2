/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perkolation;

public class Perkolation {
	
	public static void main (String[] args) {
		
		System.out.println("p =");
		float p = Lire.f();
		System.out.println("nb lignes");
		int l = Lire.i();
		System.out.println("nb colonne");
		int c = Lire.i();
		
		int[][] Grille = new int[l][c];
		int i,j;
		
		perkolation(Grille,p,l,c);
	
}
	
	public static void perkolation(int[][]G, float p, int l, int c) {
		int i,j;
                
                for(i=0;i<l;i++) {       //apparition aléatoires des bords 
			for(j=0;j<c;j++) {
				if(G[i][j]==0) {
					if(Math.random() <= p){
						G[i][j] = 1; 
					} else {
						G[i][j] = 0; 
					}
				}
			}
		}
                
		for(i=1;i<l;i=i+2){       // les zones inacessibles "les carrés" 
			for(j=1;j<c;j=j+2) {
				G[i][j]= 0;
			}
		} 
		
		for(i=0;i<l;i+=2) {     // les points (on les rend "accessibles")
			for(j=0;j<c;j+=2) {
				G[i][j] = 1;
			}
		}
		
		//affichage grille pour verif 
		for(i=0;i<l;i++){
			System.out.println(" ");
			for(j=0;j<c;j++) {
				System.out.print(G[i][j] + "  ");
			}
		}
	
	
		//public static void kompo
		
}
}