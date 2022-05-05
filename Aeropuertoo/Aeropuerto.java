/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aeropuertoo;

/**
 *
 * @author 701
 */
public class Aeropuerto {

    public void darPermisoDeAterrizaje(Volador v) {
        v.aterrizar();
        if (v instanceof AvionPrivado) {
            AvionPrivado ap = (AvionPrivado) v;
            System.out.println("Aterrizo Licencia " + ap.getLicencia());
        }
        if (v instanceof AvionDePasajeros) {
            AvionDePasajeros adp = (AvionDePasajeros) v;
            System.out.println("Aterrizo Licencia " + adp.getAerolinea());
        }
        if (v instanceof Superman) {
            Superman sp = (Superman) v;
            System.out.println("Aterrizó en un lugar privado " + sp.getNombre());
        }
        if (v instanceof IronMan) {
            IronMan sp = (IronMan) v;
            System.out.println("Aterrizó en la torre de los Avengers " + sp.getNombre());
        }
    }
}
