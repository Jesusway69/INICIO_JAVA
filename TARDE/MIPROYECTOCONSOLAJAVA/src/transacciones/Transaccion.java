package transacciones;


public class Transaccion {
    
    // VARIABLES DE INSTANCIA
    private int idTransaccion;
    private String ciudad;
    private String zona;
    private double ventas;
    private String formaPago;
    private String categoría;
    
    // CONSTRUCTORES

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, String ciudad, String zona, double ventas, String formaPago, String categoría) {
        this.idTransaccion = idTransaccion;
        this.ciudad = ciudad;
        this.zona = zona;
        this.ventas = ventas;
        this.formaPago = formaPago;
        this.categoría = categoría;
    }
    
    // METODOS GET Y SET

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "idTransaccion=" + idTransaccion + ", ciudad=" + ciudad + ", zona=" + zona + ", ventas=" + ventas + ", formaPago=" + formaPago + ", categor\u00eda=" + categoría + '}';
    }
    
    
    
    
}
