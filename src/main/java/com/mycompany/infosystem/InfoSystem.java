package com.mycompany.infosystem;

import java.util.Locale;

public class InfoSystem {
    
public static void main(String[] args){
        Locale location = Locale.getDefault();
        String sistema = System.getProperty("os.name").toLowerCase();
        
        if(sistema.contains("win")){
            System.out.println("Sistema operacional: Windows");
        }
        else if(sistema.contains("mac")){
            System.out.println("Sistema operacional: macOS");
        }
        else if(sistema.contains("nix")|| (sistema.contains("nux"))|| (sistema.contains("aix"))){
            System.out.println("Sistema operacional Linux");
        }
 
      System.out.println(location.getLanguage()); // saida do progroma que retorna o idioma do sistema abreviado
      System.out.println(location.getDisplayLanguage()); // saida  do idioma do sistema  por extenso 
        
    }
}
