package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "paquetes")
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idPaquete;
    @Column(name ="precio", nullable = false )
    private float precio;
    @ManyToOne
    @JoinColumn(name = "idPlace")
    private Place place;
    @ManyToOne
    @JoinColumn(name = "idViaje")
    private Viaje viaje;
    @Column(name ="ahorro", nullable = false )
    private float ahorro;
    @Column(name = "tipoHabitacion",length = 20,nullable = false)
    private String tipoHabitacion;
    @Column(name = "cantidadNoches",nullable = false)
    private int cantidadNoches;
    @ManyToOne
    @JoinColumn(name = "idHotel")
    private Hotel hotel;
    @Column(name = "checkin", nullable = false)
    private LocalDate checkin;
    @Column(name = "checkout", nullable = false)
    private LocalDate checkout;

    public Paquete() {
    }

    public Paquete(int idPaquete, float precio, Place place, Viaje viaje, float ahorro, String tipoHabitacion, int cantidadNoches, Hotel hotel, LocalDate checkin, LocalDate checkout) {
        this.idPaquete = idPaquete;
        this.precio = precio;
        this.place = place;
        this.viaje = viaje;
        this.ahorro = ahorro;
        this.tipoHabitacion = tipoHabitacion;
        this.cantidadNoches = cantidadNoches;
        this.hotel = hotel;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public float getAhorro() {
        return ahorro;
    }

    public void setAhorro(float ahorro) {
        this.ahorro = ahorro;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }
}
