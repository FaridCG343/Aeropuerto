/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aeropuertoo;

/**
 *
 * @author 701
 */
class AvionPrivado extends TransporteAereo implements Volador {

    private String propietario;

    @Override
    public void aterrizar() {
        //Aca va el codigo del modo que tiene que aterrizar un avion privado
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
