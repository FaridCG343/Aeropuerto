/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aeropuertoo;

/**
 *
 * @author 701
 */
class Superman extends TransporteAereo implements Volador {

    private final String nombre = "Carl Kent";

    @Override
    public void aterrizar() {
        //Aca va el codigo del modo que tiene que aterrizar de Superman
    }

    public String getNombre() {
        return nombre;
    }
}
