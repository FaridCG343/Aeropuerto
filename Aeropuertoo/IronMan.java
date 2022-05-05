/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aeropuertoo;

/**
 *
 * @author 701
 */
public class IronMan implements Volador{
    private final String nombre="Antonio Stark";

    public String getNombre() {
        return nombre;
    }

    @Override
    public void aterrizar() {
        System.out.println("Estoy aterrizando");
    }
    
}
