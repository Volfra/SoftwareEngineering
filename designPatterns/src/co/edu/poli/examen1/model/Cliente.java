package co.edu.poli.examen1.model;

import java.util.*;

/**
 * Eliminar constructor por defecto.
 */
public class Cliente {

    /**
     * @param args
     */
    public static void main(String [ ]  args) {

    	OptFabricante f = new OptFabricante();
    	Fabricante fs = f.elegirEquipo("servidor");
    	
    	Grafica es = (Grafica) fs.crearTarjeta("grafica");
    	DiscoDuro a = (DiscoDuro) fs.crearAlmacenamiento("DD");
    	
    	es.serial = "AFSGFGHVDE12123JB";
    	es.marca = "NVIDIA";
    	
    	Procesador p1 = new Procesador();
    	p1.serial = "AWDA1";
    	p1.marca = "AMD";
    	p1.tamMemoria = 8;
    	p1.nHilos = 4;

    	Procesador p2 = new Procesador();
    	p2.serial = "AWDA2";
    	p2.marca = "AMD";
    	p2.tamMemoria = 8;
    	p2.nHilos = 4;
    	
    	List<Procesador> procesadores = new ArrayList<Procesador>();
    	procesadores.add(p1);
    	procesadores.add(p2);
    	
    	es.procesadores = procesadores;
    	
    	Plato pl1 = new Plato();
    	pl1.serial = "SEAERE1";
    	pl1.material = "cristal";

    	Plato pl2 = new Plato();
    	pl2.serial = "SEAERE2";
    	pl2.material = "cristal";

    	Plato pl3 = new Plato();
    	pl3.serial = "GTFSTS1";
    	pl3.material = "ceramica";
    	
    	List<Plato> platos = new ArrayList<Plato>();
    	platos.add(pl1);
    	platos.add(pl2);
    	platos.add(pl3);
    	
    	a.platos = platos;
    	
    	System.out.println(es);
    	System.out.println(a);
    	System.out.println(es.calcularPotencia());
    	System.out.println(es.calcularAB(40, 62.3));
    	System.out.println(a.calcularVelLecEsc("SCSI"));
    }

}